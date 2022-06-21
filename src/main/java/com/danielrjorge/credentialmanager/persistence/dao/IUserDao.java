package com.danielrjorge.credentialmanager.persistence.dao;

import com.danielrjorge.credentialmanager.persistence.model.User;

import java.util.UUID;

public interface IUserDao {

    int insertUser(User user);

}
