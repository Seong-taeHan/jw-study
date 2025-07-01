package com.study.javabasic.jwstudy.controller;

import com.study.javabasic.jwstudy.dto.request.UserSaveRequest;
import com.study.javabasic.jwstudy.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping()
    public void createUser(
        @RequestBody UserSaveRequest userSaveRequest
    ) {
        userService.save(userSaveRequest);
    }


}
