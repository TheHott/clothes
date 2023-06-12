package com.evgensoft.spring.webshop.clothes.model.entity.product.base;

import java.util.List;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "countries")
public class Country extends BaseEntity {
    private String name;

    // @OneToMany(mappedBy = "countryOfOrigin", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    // private List<Product> productList;
}
