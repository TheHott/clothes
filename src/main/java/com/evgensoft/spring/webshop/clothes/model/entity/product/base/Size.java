package com.evgensoft.spring.webshop.clothes.model.entity.product.base;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "sizes")
public class Size extends BaseEntity {
    private float us;
    private float euro;
    private float rus;
    private float cm;
    private float uk;
}
