package com.danielrjorge.credentialmanager.persistence.model;

import java.util.UUID;

public class Login extends Encoder{
    private final UUID uuid;
    private final String loginUsername;
    private final String encodedPassword;
    private final User owner;

    public Login(String loginUsername, String password, User owner) {
        this.owner = owner;
        this.uuid = UUID.randomUUID();
        this.loginUsername = loginUsername;
        this.encodedPassword = password;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public String getEncodedPassword() {
        return encodedPassword;
    }

    public User getOwner() {
        return owner;
    }
}
