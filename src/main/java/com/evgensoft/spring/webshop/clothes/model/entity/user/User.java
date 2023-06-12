package com.evgensoft.spring.webshop.clothes.model.entity.user;

import java.util.List;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;
import com.evgensoft.spring.webshop.clothes.model.entity.product.Review;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Review> reviewList;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Company> companyList;
}
