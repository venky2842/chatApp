package com.venky.chatApp.repository;

import com.venky.chatApp.db.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInterface extends MongoRepository<User, String> {

}
