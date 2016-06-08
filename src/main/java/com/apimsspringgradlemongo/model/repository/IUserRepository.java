package com.apimsspringgradlemongo.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apimsspringgradlemongo.model.entity.User;

/**
 * @author eloi eloibilek@gmail.com
 */
public interface IUserRepository extends MongoRepository<User, String> {
}
