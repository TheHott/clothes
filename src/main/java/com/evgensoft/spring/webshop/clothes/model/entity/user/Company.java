package com.evgensoft.spring.webshop.clothes.model.entity.user;

import javax.persistence.Entity;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;

import lombok.Data;

@Data
@Entity
public class Company extends BaseEntity {
    private User owner;
}
