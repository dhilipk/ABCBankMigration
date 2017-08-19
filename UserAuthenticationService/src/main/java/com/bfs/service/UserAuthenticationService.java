package com.bfs.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/v1/user/authenticate", method = RequestMethod.POST)
    public Map<String, String> authenticate(@RequestBody User user) {
		Map<String, String> map = new HashMap<String, String>();
		User userFromDB = userMongoRepository.findByUsername(user.getUsername());
		if (userFromDB != null && (userFromDB.getUsername().equals(user.getUsername())) && (userFromDB.getPassword().equals(user.getPassword()))) {
			map.put("token", userFromDB.getToken());
			return map;
		} else {
			map.put("token", "");
			return map;
		}
    }
	
	@Bean
    public CommandLineRunner populateData(UserMongoRepository userMongoRepository) {
        return (args) -> {
        	if(userMongoRepository.findAll().size() == 0) {
        		User manojc = new User("1", "manojc", "manojc", "1666752410ahkleuy");
	        	User logeshwaranp = new User("2", "logeshwaranp", "logeshwaranp", "1666752410ahkleuy");
	        	User jonese = new User("3", "jonese", "jonese", "1666752410ahkleuy");
	        	User dhilipk = new User("4", "dhilipk", "dhilipk", "1666752410ahkleuy");
	        	User berchmansa = new User("5", "berchmansa", "berchmansa", "1666752410ahkleuy");
	        	userMongoRepository.save(manojc);
	        	userMongoRepository.save(logeshwaranp);
	        	userMongoRepository.save(jonese);
	        	userMongoRepository.save(dhilipk);
	        	userMongoRepository.save(berchmansa);
	        	System.out.println("Users added at the start");
        	}
        };
    }
}
