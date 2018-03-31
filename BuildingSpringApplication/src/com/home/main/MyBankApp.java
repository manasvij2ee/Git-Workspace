package com.home.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBankApp {

	public static void main(String[] args) {

		// Account account = new SavingAccount();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Account account = context.getBean("myAccount", Account.class);
		System.out.println(account.createAccount());
		System.out.println(account.cardDetails());
		// understanding scopes
		Account account1 = context.getBean("myAccount", Account.class);
		Account account2 = context.getBean("myAccount", Account.class);
		boolean isSame = (account1 == account2);
		System.out.println(isSame);
		System.out.println("Account1 has:" + account1.hashCode());
		System.out.println("Account2 has:" + account2.hashCode());
		context.close();
	
		
		
		

	}

}
