package com.home.model;

import com.home.main.Card;

public class ATMCard implements Card {

	@Override
	public String cardDetails() {
		return "ATM card has been Issued.";
	}

}
