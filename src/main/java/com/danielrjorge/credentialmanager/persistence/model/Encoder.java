package com.danielrjorge.credentialmanager.persistence.model;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

abstract public class Encoder{

    protected PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

}
