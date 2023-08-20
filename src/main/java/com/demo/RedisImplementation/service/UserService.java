package com.demo.RedisImplementation.service;

import com.demo.RedisImplementation.model.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUser();


    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
}
