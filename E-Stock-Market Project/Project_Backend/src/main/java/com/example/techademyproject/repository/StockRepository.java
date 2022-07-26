package com.example.techademyproject.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.techademyproject.entities.Stock;

@Repository
public interface StockRepository extends MongoRepository<Stock, String> {

}
