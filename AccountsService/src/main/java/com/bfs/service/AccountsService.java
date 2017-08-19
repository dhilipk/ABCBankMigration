package com.bfs.service;

import javax.ws.rs.QueryParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bfs.service.entity.Accounts;


@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class AccountsService {

		
	public static void main(String[] args) {
		SpringApplication.run(AccountsService.class, args);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/v1/accounts/summary", method = RequestMethod.GET)
    public Accounts register(@QueryParam("username") String username) {
		Accounts account;
		if (username.equalsIgnoreCase("dhilipk")) {
			account = new Accounts("Dhilip Kumar", "565896321455", "Kodampakkam", "8600", "Current");
		} else if (username.equalsIgnoreCase("berchmansa")) {
			account = new Accounts("Berchmans Arul", "345256784545", "Nungampakkam", "8600", "Savings");
		} else if (username.equalsIgnoreCase("manojc")) {
			account = new Accounts("Manoj Christopher", "849256784545", "OMR", "8600", "Savings");
		} else if (username.equalsIgnoreCase("logeshwaranp")) {
			account = new Accounts("Logeswaran", "655146784596", "T-Nagar", "8600", "Savings");
		}
		else {
			account = new Accounts("Jones Bastin Xavier", "985256784335", "Chennai", "8600", "Current");
		}
		
		return account;
    }
	
	
}
