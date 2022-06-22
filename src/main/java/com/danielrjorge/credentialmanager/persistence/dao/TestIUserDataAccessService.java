package com.danielrjorge.credentialmanager.persistence.dao;

import com.danielrjorge.credentialmanager.persistence.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("testUser")
public class TestIUserDataAccessService implements IUserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(User user) {
        DB.add(user);
        return 1;
    }

    @Override
    public List<User> selectAllUsers() {
        return DB;
    }

    @Override
    public Optional<User> selectUserById(UUID uuid) {
        return DB.stream()
                .filter(user -> user.getUuid().equals(uuid))
                .findFirst();
    }

    @Override
    public int deleteUserById(UUID uuid) {
        Optional<User> user = selectUserById(uuid);
        if (user.isEmpty()) {
            return 0;
        }
        DB.remove(user.get());
        return 1;
    }

    @Override
    public int updateUserById(UUID uuid, User user) {
        return selectUserById(uuid)
                .map(u -> {
                    int indexOfUserToDel = DB.indexOf(u);
                    if (indexOfUserToDel >= 0) {
                        DB.set(indexOfUserToDel, user);
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}


