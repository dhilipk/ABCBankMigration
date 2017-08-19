package com.bfs.service;

import java.util.Date;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
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
    public List<Beneficiary> findByUsername(@QueryParam("createdBy") String createdBy) {
		return beneficiaryMongoRepository.findByCreatedBy(createdBy);
    }
	
	@RequestMapping(value = "/v1/testapp", method = RequestMethod.GET)
    public String testApp() {
		return "Application is Running";
    }
	
	@Bean
    public CommandLineRunner populateData(BeneficiaryMongoRepository beneficiaryMongoRepository) {
		
		return  (args) -> {
			if (beneficiaryMongoRepository.findAll().size() == 0) {
				Beneficiary beneficiary =  new Beneficiary("BID0010","345256784545","Berchmans Arul","Savings","HDFC0010","HDFC BANK","berchmans@gmail.com","Dhilip",new Date());
				beneficiaryMongoRepository.save(beneficiary);
				Beneficiary beneficiary1 =  new Beneficiary("BID0011","555256784526","Dhilip Kumar","Current","CITI505","CITY BANK","dhilip@gmail.com","Dhilip",new Date());
				beneficiaryMongoRepository.save(beneficiary1);
				Beneficiary beneficiary2 =  new Beneficiary("BID0012","849256784545","Manoj Christopher","Savings","SBI0056","SBI BANK","manoj@gmail.com","Dhilip",new Date());
				beneficiaryMongoRepository.save(beneficiary2);
				Beneficiary beneficiary3 =  new Beneficiary("BID0013","655146784596","Logeswaran","Savings","IND2356","INDIAN BANK","logesh@gmail.com","Dhilip",new Date());
				beneficiaryMongoRepository.save(beneficiary3);
				Beneficiary beneficiary4 =  new Beneficiary("BID0014","985256784335","Jones Bastin Xavier","Current","HBSC263","HSBC BANK","jones@gmail.com","Dhilip",new Date());
				beneficiaryMongoRepository.save(beneficiary4);
			}
		};
	}
}
