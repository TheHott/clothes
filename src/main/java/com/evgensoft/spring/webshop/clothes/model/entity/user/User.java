package com.evgensoft.spring.webshop.clothes.model.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String username;
}
