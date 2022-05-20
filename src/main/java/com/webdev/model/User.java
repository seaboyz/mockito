package com.webdev.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class User {

    private Integer id;

    private String username;

    private String email;

    private String password;

    private String phone;

}
