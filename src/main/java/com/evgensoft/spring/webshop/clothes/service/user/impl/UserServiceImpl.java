package com.evgensoft.spring.webshop.clothes.service.user.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.evgensoft.spring.webshop.clothes.model.entity.user.User;
import com.evgensoft.spring.webshop.clothes.repository.user.UserRepository;
import com.evgensoft.spring.webshop.clothes.service.user.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public List<User> findAllByUsername(String username) {
        return userRepository.findAllByUser_Username(username);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }
}
