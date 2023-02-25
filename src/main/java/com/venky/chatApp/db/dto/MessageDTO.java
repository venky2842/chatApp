package com.venky.chatApp.db.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MessageDTO {

    @Setter(AccessLevel.NONE)
    private Long messageId;
    private String messageText;
    private UserDTO sender;
    private GroupDTO group;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and setters
    // Constructors
}
