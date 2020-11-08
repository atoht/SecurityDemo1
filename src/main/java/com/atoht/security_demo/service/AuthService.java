package com.atoht.security_demo.service;

import com.atoht.security_demo.model.User;

public interface AuthService {

	User register(User userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}
