package com.bfs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bfs.service.entity.User;
import com.bfs.service.repository.UserMongoRepository;


@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class UserAuthenticationService {

	@Autowired
	UserMongoRepository userMongoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserAuthenticationService.class, args);
	}
	
	@RequestMapping(value = "/v1/user/authenticate", method = RequestMethod.POST)
    public User authenticate(@RequestBody User user) {
		User userFromDB = userMongoRepository.findByUsername(user.getUsername());
		if ((userFromDB.getUsername().equals(user.getUsername())) && (userFromDB.getPassword().equals(user.getPassword()))) {
			return user;
		}
		return null;
    }
}
