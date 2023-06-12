package com.evgensoft.spring.webshop.clothes.model.entity.product.base;

import java.util.List;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;
import com.evgensoft.spring.webshop.clothes.model.entity.product.Shoe;
import com.evgensoft.spring.webshop.clothes.model.entity.user.Company;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "collections")
public class ProductCollection extends BaseEntity {
    private String name;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Shoe> shoeList;
}
