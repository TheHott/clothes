package com.evgensoft.spring.webshop.clothes.model.dto.user;

import com.evgensoft.spring.webshop.clothes.model.dto.BaseEntityDto;

import lombok.Data;

@Data
public class UserDto extends BaseEntityDto {
    private String username;
}
