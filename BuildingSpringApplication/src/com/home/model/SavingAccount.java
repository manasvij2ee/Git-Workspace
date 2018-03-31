package com.home.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.home.main.Account;
import com.home.main.Card;

public class SavingAccount implements Account {
	@Autowired
	private Card atmCard;	
	
	public SavingAccount() {
		super();
	}


	public SavingAccount(Card atmCard) {
		super();
		this.atmCard = atmCard;
	}
	

	public void setAtmCard(Card atmCard) {
		this.atmCard = atmCard;
	}


	@Override
	public String createAccount() {
		return "Saving Account Created .";
	}

	@Override
	public String cardDetails() {
		return this.atmCard.cardDetails();
	}
	
	public void onInit() {
		System.out.println("onInit method invoked ");
	}
	
	public void onDestroy() {
		System.out.println("onDestroy  method invoked ");
	}

}
