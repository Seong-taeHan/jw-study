package com.study.javabasic.jwstudy.service;

import com.study.javabasic.jwstudy.dto.request.UserSaveRequest;
import com.study.javabasic.jwstudy.entity.User;
import com.study.javabasic.jwstudy.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    // save
    public void save(UserSaveRequest request) {
        User user = new User(
            request.id(),
            request.name(),
            request.email(),
            request.password()
        );
        userRepository.save(user);
        log.info("user has been saved");
    }

    // find one
    public User findById(Long id) {
        User user = userRepository.findById(id);
        return user;
    }

    // find all
    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        return users;
    }

    // update
    public void update(User user) {
        userRepository.updateUser(user);
        log.info("user has been updated");
    }

    // delete
    public void delete(Long id) {
        userRepository.delete(id);
        log.info("user has been deleted");
    }

}
