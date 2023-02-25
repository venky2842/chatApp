package com.venky.chatApp.repository;

import com.venky.chatApp.db.entity.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
}
