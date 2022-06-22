package com.danielrjorge.credentialmanager.persistence.dao;

import com.danielrjorge.credentialmanager.persistence.model.User;

import java.util.List;

public interface IUserDao {

    int insertUser(User user);

    List<User> selectAllUsers();



}
