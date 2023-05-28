package com.evgensoft.spring.webshop.clothes.controller.user;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.evgensoft.spring.webshop.clothes.model.dto.user.UserDto;
import com.evgensoft.spring.webshop.clothes.model.entity.user.User;
import com.evgensoft.spring.webshop.clothes.service.user.UserService;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/user", produces = "application/json")
@AllArgsConstructor
public class UserController {
    private UserService userService;
    private ModelMapper modelMapper;

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(convertToDto(userService.findById(id)));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        return ResponseEntity.ok(userService.findAll()
        .stream()
        .map(this::convertToDto)
        .collect(Collectors.toList()));
    }

    @GetMapping("/by-username")
    public ResponseEntity<List<UserDto>> getAllByUsername(@RequestParam String username) {
        return ResponseEntity.ok(userService.findAllByUsername("")
            .stream()
            .map(this::convertToDto)
            .collect(Collectors.toList()));
    }

    private UserDto convertToDto(User user) {
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }

    // private User convertToEntity(UserDto userDto) {
    //     User user = modelMapper.map(userDto, User.class);
    //     return user;
    // }
}
