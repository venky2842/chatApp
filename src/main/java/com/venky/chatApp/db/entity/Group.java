package com.venky.chatApp.db.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "groups")
@Getter
@Setter
public class Group {

    @Id
    private String id = UUID.randomUUID().toString(); // Generate a unique ID using UUID

    private String groupName;

    @DBRef(lazy = true)
    private User groupAdmin;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // getters and setters
}