package com.nagarro.microservices.userservice.controller;

import java.util.List;


public class BankProducts {

	 private List<FDRates> fdRates;
	 private List<Loans> loans;
	 private List<Offers> offers;
	public List<FDRates> getFdRates() {
		return fdRates;
	}
	public void setFdRates(List<FDRates> fdRates) {
		this.fdRates = fdRates;
	}
	public List<Loans> getLoans() {
		return loans;
	}
	public void setLoans(List<Loans> loans) {
		this.loans = loans;
	}
	public List<Offers> getOffers() {
		return offers;
	}
	public void setOffers(List<Offers> offers) {
		this.offers = offers;
	}
}
