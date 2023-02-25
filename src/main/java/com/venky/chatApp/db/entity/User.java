package com.venky.chatApp.db.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "users")
@Getter
@Setter
public class User {

    @Id
    private String id = UUID.randomUUID().toString(); // Generate a unique ID using UUID;

    @Indexed(unique = true)
    private String email;

    @Indexed(unique = true)
    private String username;

    private String password;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Location location;

    // getters and setters
}