package com.evgensoft.spring.webshop.clothes.model.dto;

import java.util.Date;


import com.evgensoft.spring.webshop.clothes.model.dto.user.UserDto;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntityDto {
    private long id;
    private long version;
    private Date created;
    private Date updated;
    private UserDto createdBy;
    private UserDto lastModifiedBy;
    private boolean isDeleted = Boolean.FALSE;
}
