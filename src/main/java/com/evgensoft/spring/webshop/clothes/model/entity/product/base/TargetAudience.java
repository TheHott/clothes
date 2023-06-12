package com.evgensoft.spring.webshop.clothes.model.entity.product.base;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "target_audiences")
public class TargetAudience extends BaseEntity {
    private String name;
    private int ageFrom;
    private int ageTo;
}
