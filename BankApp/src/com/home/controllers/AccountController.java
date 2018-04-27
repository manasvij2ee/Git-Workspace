package com.home.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.model.Account;
import com.home.services.AccountService;


@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@RequestMapping("/")
	public String showHomePage() {
		return "index";

	}

	@RequestMapping("/new")
	public String newAccount(Model model ) {
		model.addAttribute("account", new Account());
		return "newAccount";

	}

	@RequestMapping("/showAccount")
	
	public String showAccount() {
		return "showAccount";

	}

	@RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
	public String saveAccount(@Valid @ModelAttribute("account") Account account,BindingResult result) {
		
		/*String accNo = request.getParameter("accountNo");
		String customerName = request.getParameter("name");
		String balance = request.getParameter("balance");*/

		/*model.addAttribute("accountNumber ", accNo);
		model.addAttribute("accountHolderName ", customerName);
		model.addAttribute("balance ", balance);*/
		
	/*	Account account = new Account();
		account.setAccountNo(Integer.parseInt(accNo));
		account.setName(customerName);
		account.setBalance(Integer.parseInt(balance))*/;
		
		if(result.hasErrors())
			return "newAccount";
		else
		{
			accountService.saveAccount(account);
			return" redirect:/list";
		}

	}

}
