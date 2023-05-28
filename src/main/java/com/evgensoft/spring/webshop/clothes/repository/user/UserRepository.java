package com.evgensoft.spring.webshop.clothes.repository.user;

import java.util.List;

import com.evgensoft.spring.webshop.clothes.model.entity.user.User;
import com.evgensoft.spring.webshop.clothes.repository.BaseRepository;

public interface UserRepository extends BaseRepository<User, Long> {
    List<User> findAllByUsername(String username);
}
