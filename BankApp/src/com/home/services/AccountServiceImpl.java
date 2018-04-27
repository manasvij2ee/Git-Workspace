package com.home.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.home.dao.AccountDao;
import com.home.model.Account;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDao accountDao;

	@Override
	@Transactional
	public boolean saveAccount(Account account) {
		
		return accountDao.saveAccount(account);
	}

}
