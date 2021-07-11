package com.boot.mapping.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.boot.mapping.model.User;

public interface UserRepo extends MongoRepository<User, Integer> 
{

	List<User> findByName(String name);
		
	@Query("{'Address.city':?0}")
	List<User> findByCity(String city); 
	
}