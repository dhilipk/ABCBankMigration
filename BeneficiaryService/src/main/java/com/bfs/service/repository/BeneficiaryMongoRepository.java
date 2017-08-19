package com.bfs.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bfs.service.entity.Beneficiary;

public interface BeneficiaryMongoRepository extends MongoRepository<Beneficiary, Integer> {
	Beneficiary findByCreatedby(String createdby);
}
