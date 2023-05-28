package com.evgensoft.spring.webshop.clothes.repository.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.evgensoft.spring.webshop.clothes.model.entity.user.User;
import com.evgensoft.spring.webshop.clothes.repository.BaseRepository;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {
    List<User> findAllByUser_Username(String username);
}
