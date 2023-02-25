package com.venky.chatApp.db.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class GroupDTO {
    @Setter(AccessLevel.NONE)
    private Long groupId;
    private String groupName;
    private UserDTO groupAdmin;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and setters
    // Constructors
}
