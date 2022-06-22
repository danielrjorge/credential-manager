package com.danielrjorge.credentialmanager.services;

import com.danielrjorge.credentialmanager.persistence.dao.IUserDao;
import com.danielrjorge.credentialmanager.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final IUserDao iUserDao;

    @Autowired
    public UserService(@Qualifier("testUser") IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

    public int addUser(User user){
        return iUserDao.insertUser(user);
    }

    public List<User> getAllUsers(){
        return iUserDao.selectAllUsers();
    }

    public Optional<User> getUserById(UUID id){
        return iUserDao.selectUserById(id);
    }

    public int deleteUserById(UUID uuid){
        return iUserDao.deleteUserById(uuid);
    }

    public int updateUserById(UUID uuid, User user){
        return iUserDao.updateUserById(uuid, user);
    }
}
