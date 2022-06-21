package com.danielrjorge.credentialmanager.persistence.dao;

import com.danielrjorge.credentialmanager.persistence.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("testUser")
public class TestIUserDataAccessService implements IUserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(User user) {
        DB.add(user);
        return 1;
    }
}


