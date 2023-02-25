package com.venky.chatApp.db.dto;

import com.venky.chatApp.db.entity.Location;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class UserDTO {
    @Setter(AccessLevel.NONE)
    private Long userId;
    private String username;
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Location location;

    // Getters and setters
    // Constructors
}
