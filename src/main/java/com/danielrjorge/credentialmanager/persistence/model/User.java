package com.danielrjorge.credentialmanager.persistence.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User extends Encoder{
    private final UUID uuid;
    private final String username;
    private final String encodedPassword;

    private final List<Login> passwordList;

    public User(@JsonProperty("username") String username,
                @JsonProperty("password") String password) {
        this.uuid = UUID.randomUUID();
        this.username = username;
        this.encodedPassword = passwordEncoder.encode(password);
        this.passwordList = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getEncodedPassword() {
        return encodedPassword;
    }
}
