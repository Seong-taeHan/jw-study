package com.study.javabasic.jwstudy.repository;

import com.study.javabasic.jwstudy.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository {
    List<User> users = new ArrayList<>();

    // create
    public void save(User user) {
        users.add(user);
    }

    // read
    public User findById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    // readAll
    public List<User> findAll() {
        return users;
    }

    // update
    public void updateUser(User user) {
        for (User user1 : users) {
            if (user1.getId().equals(user.getId())) {
                users.remove(user1);
                users.add(user);
            }
        }
    }

    // delete
    public void delete(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                users.remove(user);
            }
        }
    }
}
