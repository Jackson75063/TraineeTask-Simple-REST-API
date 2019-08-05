package com.jackson.service.impl;

import com.jackson.entity.User;
import com.jackson.model.Color;
import com.jackson.repository.ArticleRepository;
import com.jackson.repository.UserRepository;
import com.jackson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ArticleRepository articleRepository;


    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUserById(Long id) {

    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> getUserAgeGreaterThen(Short age) {
        return userRepository.findByAgeIsGreaterThan(age);
    }

    @Override
    public List<User> findUsersByArticleColor(Color color) {
        return userRepository.findUsersByArticleColor(color);
    }

   /* @Override
    public List<User> findUsersByNameAndArticleIsGreaterThanEqual(Short count) {
        return userRepository.findUsersByNameAndArticleIsGreaterThanEqual(count);
    }*/


}