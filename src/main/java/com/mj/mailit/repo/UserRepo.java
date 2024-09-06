package com.mj.mailit.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mj.mailit.model.User;

public interface UserRepo extends MongoRepository<User, String>{
	
	public User findByEmail(String email);

}
