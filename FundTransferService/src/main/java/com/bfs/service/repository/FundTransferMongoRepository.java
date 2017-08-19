package com.bfs.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bfs.service.entity.FundTransfer;

public interface FundTransferMongoRepository extends MongoRepository<FundTransfer, Integer> {
	FundTransfer findByTransferDate(String fromTransferDate, String toTransferDate);
}
