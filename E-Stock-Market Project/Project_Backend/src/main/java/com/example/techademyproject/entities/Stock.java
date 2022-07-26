package com.example.techademyproject.entities;

import javax.validation.constraints.NotBlank;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "stocks")
public class Stock {
	@Id
	private String stockId;

	@NotBlank(message = "Mandatory")
	private String companyCode;
	@NotBlank(message = "Mandatory")
	private double stockPrice;
	@NotBlank(message = "Mandatory")
	private String dateAdded;
	@NotBlank(message = "Mandatory")
	private String timeAdded;

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		dateAdded = formatter.format(date);
		this.dateAdded = dateAdded;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public String getTimeAdded() {
		return timeAdded;
	}

	public void setTimeAdded(String timeAdded) {
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
		Date date = new Date();
		timeAdded = formatter.format(date);
		this.timeAdded = timeAdded;
	}

}
