package com.brazilian_funds_management.repository;

import com.brazilian_funds_management.model.Fund;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FundRepository extends MongoRepository<Fund, String> {
}