package com.home.model;

import com.home.main.Account;

public class CurrentAccount implements Account {

	@Override
	public String createAccount() {
		return "Current Account Created.";
	}

	@Override
	public String cardDetails() {
		return null;
	}

}
