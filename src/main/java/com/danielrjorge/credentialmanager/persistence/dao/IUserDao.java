package com.danielrjorge.credentialmanager.persistence.dao;

import com.danielrjorge.credentialmanager.persistence.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IUserDao {

    int insertUser(User user);

    List<User> selectAllUsers();

    Optional<User> selectUserById(UUID uuid);
    int deleteUserById(UUID uuid);

    int updateUserById(UUID uuid, User user);

}
