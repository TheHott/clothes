package com.evgensoft.spring.webshop.clothes.model.entity;

import com.evgensoft.spring.webshop.clothes.model.enums.ProductStatus;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class BaseProduct extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;
    private Double cost;
    private Long amountInStock;
}
