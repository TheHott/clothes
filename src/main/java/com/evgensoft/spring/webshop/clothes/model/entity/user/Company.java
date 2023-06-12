package com.evgensoft.spring.webshop.clothes.model.entity.user;

import java.util.List;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;
import com.evgensoft.spring.webshop.clothes.model.entity.product.Shoe;
import com.evgensoft.spring.webshop.clothes.model.entity.product.base.Country;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "companies")
public class Company extends BaseEntity {
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private User owner;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    @OneToMany(mappedBy = "sellerCompany", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Shoe> shoeList;
}
