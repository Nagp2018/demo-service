package com.nagarro.microservices.userservice.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableList;
import com.nagarro.microservices.userservice.Configuration;



@RestController
@RequestMapping("/api/user")
public class UserServiceController {

	
	@Autowired
	Configuration configuration;
	
	
	
	@GetMapping("/test")
	public BankProducts getOrderTest() {
		
		BankProducts bankProducts = new BankProducts();
		
		FDRates fdRates = new FDRates();
		fdRates.setInterestRate("0.45 % p.a.");
		fdRates.setTerm("1.5 years");
		fdRates.setCurrency("EUR");
				
		FDRates fdRates1 = new FDRates();
		fdRates1.setInterestRate("0.50 % p.a.");
		fdRates1.setTerm("2 years");
		fdRates1.setCurrency("EUR");
		
		List<FDRates> fdRateList = ImmutableList.of(fdRates,fdRates1);
		bankProducts.setFdRates(fdRateList);
		
		Loans loans = new Loans();
		loans.setInterestRate("10.75 %");
		loans.setLoanCategory("Personal Loan");
		
		List<Loans> loanList = ImmutableList.of(loans);
		bankProducts.setLoans(loanList);
		
		Offers offer = new Offers();
		offer.setTitle("No Processing fee on Car Loan");
		offer.setDesc("Interest starts at 10.75%, Get discount on the processing fee for amounts above $10000.");
		List<Offers> offersList = ImmutableList.of(offer);
		bankProducts.setOffers(offersList);
		
		return bankProducts;
	}

	
	
	
	

}

