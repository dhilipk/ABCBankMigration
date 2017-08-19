package com.bfs.service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bfs.service.entity.Beneficiary;

public interface BeneficiaryMongoRepository extends MongoRepository<Beneficiary, Integer> {
	List<Beneficiary> findByCreatedBy(String createdBy);
}
