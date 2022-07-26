package com.example.techademyproject.services;

import java.util.List;

import com.example.techademyproject.entities.Company;
import com.example.techademyproject.repository.CompanyRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class Company_Services {

	@Autowired
	private CompanyRepository companyRepository;

	public Company addCompany(Company company) {
		return companyRepository.save(company);
	}

	public void deleteCompanyByCode(String companyCode) {
		companyRepository.deleteById(companyCode);
	}

	public Company getCompanyByCode(String companyCode) {
		return companyRepository.findById(companyCode).orElse(null);
	}

	public List<Company> addAllCompanies(List<Company> companies) {
		return companyRepository.saveAll(companies);
	}

	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}

}
