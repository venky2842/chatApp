package com.venky.chatApp.repository;

import com.venky.chatApp.db.entity.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group, String> {
}
