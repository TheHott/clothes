package com.evgensoft.spring.webshop.clothes.model.entity.product.base;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "heels")
public class Heel extends BaseEntity {
    private String name;
    private int height;
}
