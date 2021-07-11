package com.boot.mapping.endPoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.mapping.model.User;

import com.boot.mapping.repository.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo repo;

	
	@PostMapping("/newOrder")
	public User createUser(@RequestBody User user)
	{
		return repo.save(user);
	}
		
	@GetMapping("/get/user/name/{name}")
	public List<User> getUserByName(@PathVariable String name)
	{
		return repo.findByName(name);
	}
	
	@GetMapping("/get/user/city/{city}")
	public List<User> getUserByCity(@PathVariable String city)
	{
		return repo.findByCity(city);
	}
}