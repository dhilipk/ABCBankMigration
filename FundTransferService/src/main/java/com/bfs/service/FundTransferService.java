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


import com.bfs.service.entity.FundTransfer;

import com.bfs.service.repository.FundTransferMongoRepository;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class FundTransferService {

	@Autowired
	FundTransferMongoRepository fundTransferMongoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FundTransferService.class, args);
	}
	
	@RequestMapping(value = "/v1/benificiary/save", method = RequestMethod.POST)
    public FundTransfer register(@RequestBody FundTransfer beneficiary) {
		return fundTransferMongoRepository.save(beneficiary);
    }
	
	@RequestMapping(value = "/v1/benificiary", method = RequestMethod.GET)
    public FundTransfer findByUsername(@QueryParam("fromdate") String fromdate, @QueryParam("todate") String todate) {
		return fundTransferMongoRepository.findByTransfsdate(fromdate, todate);
    }
	
	@RequestMapping(value = "/v1/testapp", method = RequestMethod.GET)
    public String testApp() {
		return "Application is Running";
    }
}
