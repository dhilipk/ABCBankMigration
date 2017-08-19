package com.bfs.service;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bfs.service.entity.Beneficiary;
import com.bfs.service.repository.BeneficiaryMongoRepository;



@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class BenificiaryService {

	@Autowired
	BeneficiaryMongoRepository beneficiaryMongoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BenificiaryService.class, args);
	}
	
	@RequestMapping(value = "/v1/benificiary/save", method = RequestMethod.POST)
    public Beneficiary register(@RequestBody Beneficiary beneficiary) {
		return beneficiaryMongoRepository.save(beneficiary);
    }
	
	@RequestMapping(value = "/v1/benificiary", method = RequestMethod.GET)
    public Beneficiary findByUsername(@QueryParam("createdby") String createdby) {
		return beneficiaryMongoRepository.findByCreatedby(createdby);
    }
	
	@RequestMapping(value = "/v1/testapp", method = RequestMethod.GET)
    public String testApp() {
		return "Application is Running";
    }
}
