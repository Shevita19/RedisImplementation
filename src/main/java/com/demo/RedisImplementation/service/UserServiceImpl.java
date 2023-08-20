package com.demo.RedisImplementation.service;

import com.demo.RedisImplementation.model.User;
import com.demo.RedisImplementation.repository.UserDaoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDaoRepo userDaoRepo;

    @Override
    public boolean saveUser(User user) {
        return userDaoRepo.saveUser(user);
    }

    @Override
    public List<User> fetchAllUser() {
        return userDaoRepo.fetchAllUser();
    }

    @Override
    public User fetchUserById(Long id) {
        return userDaoRepo.fetchUserById(id);
    }

    @Override
    public boolean deleteUser(Long id) {
        return userDaoRepo.deleteUser(id);
    }


    @Override
    public boolean updateUser(Long id, User user) {
        return userDaoRepo.updateUser(id,user);
    }



}
