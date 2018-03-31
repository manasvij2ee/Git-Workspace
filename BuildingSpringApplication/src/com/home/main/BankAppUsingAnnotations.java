package com.home.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankAppUsingAnnotations {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(BankAppConfig.class);
		Account account = context.getBean("savingAccount", Account.class);
		System.out.println(account.createAccount());
		System.out.println(account.cardDetails());

	}

}
