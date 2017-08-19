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
	@Bean
    public CommandLineRunner populateData(FundTransferMongoRepository fundTransferMongoRepository) {
		return (args) -> {
			if (fundTransferMongoRepository.findAll().size() == 0) {
				FundTransfer fundTransfer =  new FundTransfer("2300500","565896321455","345256784545","Savings","Transfer","1000","Y","","8600","IMPS","56238914","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer);
				FundTransfer fundTransfer1 =  new FundTransfer("2300501","565896321455","849256784545","Savings","Return","600","Y","","9600","NEFT","12567645","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer1);
				FundTransfer fundTransfer2 =  new FundTransfer("2300502","565896321455","555256784526","Current","Rent","5000","Y","","10200","NEFT","78904567","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer2);
				FundTransfer fundTransfer3 =  new FundTransfer("2300503","565896321455","985256784335","Current","EMI","100","Y","","15200","IMPS","456123789","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer3);
				FundTransfer fundTransfer4 =  new FundTransfer("2300504","565896321455","655146784596","Savings","Ticket","400","Y","","15300","IMPS","84512036","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer4);
				FundTransfer fundTransfer5 =  new FundTransfer("2300505","565896321455","849256784545","Savings","Movie Ticket","600","Y","","IMPS","15700","7894512036","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer5);
				FundTransfer fundTransfer6 =  new FundTransfer("2300506","565896321455","555256784526","Current","EMI","8000","Y","","16300","NEFT","456123079","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer6);
				FundTransfer fundTransfer7 =  new FundTransfer("2300507","565896321455","345256784545","Savings","Return","4500","Y","","24300","IMPS","451368875","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer7);
				FundTransfer fundTransfer8 =  new FundTransfer("2300508","565896321455","985256784335","Current","Return","12000","Y","","28800","IMPS","4512366875","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer8);
				FundTransfer fundTransfer9 =  new FundTransfer("2300509","565896321455","655146784596","Savings","Others","1400","Y","","40800","NEFT","4512036765","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer9);
				FundTransfer fundTransfer10 =  new FundTransfer("2300510","565896321455","345256784545","Savings","Ticket","750","Y","","42200","NEFT","879545225","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer10);
				FundTransfer fundTransfer11 =  new FundTransfer("2300511","565896321455","555256784526","Current","Rent","300","Y","","42500","IMPS","6554211254","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer11);
				FundTransfer fundTransfer12 =  new FundTransfer("2300512","565896321455","849256784545","Savings","Book","7500","Y","","50000","IMPS","897856254","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer12);
				FundTransfer fundTransfer13 =  new FundTransfer("2300513","565896321455","849256784545","Savings","Book","45000","","Y","50000","NEFT","564546213","Dhilip",new Date());
				fundTransferMongoRepository.save(fundTransfer13);
				
			}
		};
	}
}
