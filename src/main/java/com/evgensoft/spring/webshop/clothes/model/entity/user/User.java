package com.evgensoft.spring.webshop.clothes.model.entity.user;

import javax.persistence.Entity;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;

import lombok.Data;

@Data
@Entity
public class User extends BaseEntity {
    private String username;
}
