package com.venky.chatApp.db.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "locations")
@Getter
@Setter
public class Location {
    @Id
    @Setter(AccessLevel.NONE)
    private String id = UUID.randomUUID().toString();
    private String userId;
    private Double latitude;
    private Double longitude;

    // Constructors
    // Getters and setters
}