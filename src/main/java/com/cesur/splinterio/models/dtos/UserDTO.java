package com.cesur.splinterio.models.dtos;

import java.time.LocalDateTime;

import com.cesur.splinterio.models.utils.enums.Roles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    Long id;
    private String name;
    private String email;
    private String password;
    private Roles rol;
    private Boolean active;
    private LocalDateTime lastConnection;
    private LocalDateTime deleteAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
