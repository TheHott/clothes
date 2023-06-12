package com.evgensoft.spring.webshop.clothes.model.entity.product;

import com.evgensoft.spring.webshop.clothes.model.entity.BaseEntity;
import com.evgensoft.spring.webshop.clothes.model.entity.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "reviews")
public class Review extends BaseEntity {
    private String text;
    private int grade;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
