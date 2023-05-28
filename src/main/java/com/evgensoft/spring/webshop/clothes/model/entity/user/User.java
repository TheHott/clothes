package com.evgensoft.spring.webshop.clothes.model.entity.user;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String username;
}
