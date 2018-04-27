package com.home.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class Account {
	@NotNull(message="Account# cant be blank")
	private Integer accountNo;
	
	@NotNull(message="Name cant be blank")
	private String name;
	
	@NotNull(message="Balance Amount is required")
	private Integer balance;
	
	@NotNull(message="Account type cant be null")
	private String accountType;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@NotNull(message="DOB cant be null")
	private Date dateOfBirth;
	
	@NotNull(message="Ps Code is required")
	private String psCode;
	
	
	public Account(Integer accountNo, String name, Integer balance, String accountType, Date dateOfBirth,
			String psCode) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
		this.dateOfBirth = dateOfBirth;
		this.psCode = psCode;
	}
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPsCode() {
		return psCode;
	}

	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

	public Account() {
		accountNo=0;
		name="";
		balance=0;
		accountType="";
		dateOfBirth=new Date();
		psCode="";
		
		
	}
	

}
