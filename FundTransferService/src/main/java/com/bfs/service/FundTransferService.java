package com.bfs.service;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.bfs.service.entity.FundTransfer;

import com.bfs.service.repository.FundTransferMongoRepository;
import com.mongodb.MongoClient;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class FundTransferService {

	@Autowired
	FundTransferMongoRepository fundTransferMongoRepository;
	
	MongoTemplate mongoTemplate =
		    new MongoTemplate(new MongoClient("127.0.0.1"),"fund");
	
	public static void main(String[] args) {
		SpringApplication.run(FundTransferService.class, args);
	}
	
	@RequestMapping(value = "/v1/funding/save", method = RequestMethod.POST)
    public FundTransfer fundTransfer(@RequestBody FundTransfer funding) {
		return fundTransferMongoRepository.insert(funding);
    }
	
	@RequestMapping(value = "/v1/funding", method = RequestMethod.GET)
    public List<FundTransfer> getTransferDetails(@QueryParam("fromdate") String fromdate, @QueryParam("todate") String todate) {
		/*MongoOperations mongo = (MongoOperations) mongoTemplate;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD");
		Date startDate = simpleDateFormat.parse(fromdate);  
		Date endDate = simpleDateFormat.parse(todate);
		BasicDBObject query = new BasicDBObject("transferDate",
				   new BasicDBObject("$gte",startDate).append("$lt",endDate ));
		List<FundTransfer> userTest3 = mongo.findOne(query, FundTransfer.class);*/
		return fundTransferMongoRepository.findAll();
    }
}
