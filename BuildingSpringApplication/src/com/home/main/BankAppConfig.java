package com.home.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.home.model.ATMCard;
import com.home.model.SavingAccount;

public class BankAppConfig {
	
	@Bean
	public ATMCard atmCard() {
		return new ATMCard();
		
	}
	@Bean(initMethod="onInit", destroyMethod="onDestroy")
		@Scope("prototype")
		public SavingAccount savingAccount() {
			return new SavingAccount();
		}
	}


