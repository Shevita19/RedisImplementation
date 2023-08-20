package com.demo.RedisImplementation.repository;

import com.demo.RedisImplementation.model.User;

import java.util.List;

public interface UserDaoRepo {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
}
