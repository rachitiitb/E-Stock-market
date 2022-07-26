package com.example.techademyproject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.techademyproject.entities.Company;
import com.example.techademyproject.services.Company_Services;
import com.example.techademyproject.services.Stocks_Services;
@RestController
@RequestMapping("/company")

public class RegController {
	@Autowired
	private Company_Services compService;
	
	@Autowired
	private Stocks_Services stockService;
	
	@PostMapping("/register")
	public Company addCompany(@Valid @RequestBody Company company) {
		return compService.addCompany(company);
	}

	@PostMapping("/addCompanies")
	public List<Company> addAllCompanies(@RequestBody List<Company> companies) {
		return compService.addAllCompanies(companies);
	}

	@GetMapping("/info/{companyCode}")
	public Company getCompanyByCode(@PathVariable String companyCode) {
		return compService.getCompanyByCode(companyCode);
	}

	@GetMapping("/getAll")
	public List<Company> getAllCompanies() {
		return compService.getAllCompanies();
	}

	@DeleteMapping("/deleteCompanyByCode/{companyCode}")
	public void deleteCompanyByCode(@PathVariable String companyCode) {
		compService.deleteCompanyByCode(companyCode);
		stockService.deleteCompanyByCode(companyCode);
		
	}
}
