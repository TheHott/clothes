package com.evgensoft.spring.webshop.clothes.model.entity.user;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Company extends BaseEntity {
    private User owner;
}
