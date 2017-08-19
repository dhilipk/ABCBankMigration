package com.bfs.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bfs.service.entity.User;

public interface UserMongoRepository extends MongoRepository<User, Integer> {
	User findByUsername(String username);
}
