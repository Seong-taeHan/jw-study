package com.study.javabasic.jwstudy.controller;

import com.study.javabasic.jwstudy.dto.request.UserSaveRequest;
import com.study.javabasic.jwstudy.entity.User;
import com.study.javabasic.jwstudy.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(
            @PathVariable("id") Long id
    ) {
        User user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }
    @GetMapping("read-all")
    public ResponseEntity<List<User>> findAll() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }
}
