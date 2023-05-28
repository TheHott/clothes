package com.evgensoft.spring.webshop.clothes.model.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import com.evgensoft.spring.webshop.clothes.model.enums.ProductStatus;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseProduct extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;
    private Double cost;
    private Long amountInStock;
}
