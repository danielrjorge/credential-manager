package com.danielrjorge.credentialmanager.services;

import com.danielrjorge.credentialmanager.persistence.dao.IUserDao;
import com.danielrjorge.credentialmanager.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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
}
