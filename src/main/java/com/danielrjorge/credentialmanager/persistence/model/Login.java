package com.danielrjorge.credentialmanager.persistence.model;

import java.util.UUID;

public class Login extends Encoder{
    private final UUID uuid;
    private final String loginUsername;
    private final String encodedPassword;

    public Login(String loginUsername, String password) {
        this.uuid = UUID.randomUUID();
        this.loginUsername = loginUsername;
        this.encodedPassword = passwordEncoder.encode(password);
    }
}
