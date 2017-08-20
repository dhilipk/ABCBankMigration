package com.bfs.service;

import java.util.HashMap;
import java.util.Map;

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
public class CustomerOnboardingService {

	@Autowired
	UserMongoRepository userMongoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerOnboardingService.class, args);
	}
	
	@RequestMapping(value = "/v1/user/onboard", method = RequestMethod.POST)
    public Map<String, String> register(@RequestBody User user) {
		Map<String, String> map = new HashMap<String, String>();
		if (userMongoRepository.findByUsername(user.getUsername()) != null) {
			map.put("message", "Customer Already Exists!!");
			map.put("status", "danger");
			return map;
		} else {
			user.setPassword(user.getUsername());
			user.setToken("1666752410ahkleuy");
			userMongoRepository.insert(user);
			map.put("message", "Customer Onboarded Successfully!!");
			map.put("status", "success");
			return map;
		}
    }
}
