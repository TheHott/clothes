package com.evgensoft.spring.webshop.clothes.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import com.evgensoft.spring.webshop.clothes.model.entity.user.User;

import lombok.Getter;

@Getter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Version
    private long version;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

    @CreatedBy
    private User createdBy;

    @LastModifiedBy
    private User lastModifiedBy;

    @PrePersist
    private void onPersist() {
        additionalOnPersist();
    }

    protected void additionalOnPersist() {}
    
}
