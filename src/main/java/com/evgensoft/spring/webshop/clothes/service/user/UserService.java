package com.evgensoft.spring.webshop.clothes.service.user;

import java.util.List;

import com.evgensoft.spring.webshop.clothes.model.entity.user.User;

public interface UserService {
    List<User> findAll();
    
    List<User> findAllByUsername(String username);

    User findById(Long id);
}
