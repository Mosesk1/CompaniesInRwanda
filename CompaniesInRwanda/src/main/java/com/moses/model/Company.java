package com.moses.model;

import java.time.LocalDate;

public class Company {

	private int registartionNo;
	private String companyName;
	private String category;
	private String owner;
	private LocalDate startingDate;
	private LocalDate registrationDate;
	private Double capital;
	
	
	public Company(int registartionNo, String companyName, String category, String owner, LocalDate startingDate,
			LocalDate registrationDate, Double capital) {
		super();
		this.registartionNo = registartionNo;
		this.companyName = companyName;
		this.category = category;
		this.owner = owner;
		this.startingDate = startingDate;
		this.registrationDate = registrationDate;
		this.capital = capital;
	}


	public int getRegistartionNo() {
		return registartionNo;
	}


	public void setRegistartionNo(int registartionNo) {
		this.registartionNo = registartionNo;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public LocalDate getStartingDate() {
		return startingDate;
	}


	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}


	public LocalDate getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}


	public Double getCapital() {
		return capital;
	}


	public void setCapital(Double capital) {
		this.capital = capital;
	}


	@Override
	public String toString() {
		return "Company [registartionNo=" + registartionNo + ", companyName=" + companyName + ", category=" + category
				+ ", owner=" + owner + ", startingDate=" + startingDate + ", registrationDate=" + registrationDate
				+ ", capital=" + capital + "]";
	}
	
	
	
	
}
