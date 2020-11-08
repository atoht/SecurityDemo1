package com.atoht.security_demo.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class User {
    private String id;

    private String username;

    private String password;
    private String email;
    private Date lastPasswordResetDate;
    private List<String> roles;
}
