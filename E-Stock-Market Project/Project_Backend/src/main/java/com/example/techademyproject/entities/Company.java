package com.example.techademyproject.entities;

import org.hibernate.validator.constraints.URL;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Document(collection = "companies")
public class Company {

	@Id
	private String companyCode;

	@NotBlank(message = "Mandatory")
	private String companyName;

	@NotBlank(message = "Mandatory!")
	private String companyCEO;

	@Min(value=10 , message = "Turnover must be more than 10 Crores" )
	private double companyTurnover;

	@URL(message = "Provide a valid URL")
	@NotBlank(message = "Mandatory")
	private String companyWebsite;

	@NotBlank(message = "Mandatory")
	private String stockExchange;

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCEO() {
		return companyCEO;
	}

	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}

	public double getCompanyTurnover() {
		return companyTurnover;
	}

	public void setCompanyTurnover(double companyTurnover) {
		this.companyTurnover = companyTurnover;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

}
