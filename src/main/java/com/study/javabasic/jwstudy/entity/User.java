package com.study.javabasic.jwstudy.entity;

import lombok.Getter;

@Getter
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;


    public User(
        Long id,
        String name,
        String email,
        String password
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

}
