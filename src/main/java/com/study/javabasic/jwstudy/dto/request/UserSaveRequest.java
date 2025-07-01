package com.study.javabasic.jwstudy.dto.request;

public record UserSaveRequest(
    Long id,
    String name,
    String email,
    String password
) {

}
