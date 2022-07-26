package com.example.techademyproject.services;

import com.example.techademyproject.entities.Stock;
import com.example.techademyproject.repository.StockRepository;


import java.util.*;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class Stocks_Services {
	@Autowired
	private StockRepository stockRepository;
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public Stock addStock(Stock stock) {
		return stockRepository.save(stock);
	}
	
	public List<Stock> getStockByCompanyCode(String companyCode , String startDate , String endDate) {
		Query query = new Query();
		query.addCriteria(Criteria.where("dateAdded").lt(endDate).gt(startDate).and("companyCode").is(companyCode) );
		List<Stock> stocks = mongoTemplate.find(query,Stock.class);
		return stocks;
	}
	
	public void deleteCompanyByCode(String companyCode) {
		stockRepository.deleteById(companyCode);
	}
	
}


