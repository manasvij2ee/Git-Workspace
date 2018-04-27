package com.home.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.entity.AccountEntity;
import com.home.model.Account;

@Repository
public class AccountDaoImpl implements AccountDao {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean saveAccount(Account account) {
		boolean saveFlag=true;
		AccountEntity accountEntity =new AccountEntity();
		accountEntity.setAccountNo(account.getAccountNo());
		accountEntity.setName(account.getName());
		accountEntity.setBalance(account.getBalance());
		accountEntity.setAccountType(account.getAccountType());
		accountEntity.setDateOfBirth(account.getDateOfBirth());
		accountEntity.setPsCode(account.getPsCode());
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(accountEntity);
			} catch (Exception ex) {
				ex.printStackTrace();
				saveFlag=false;
			}
		return saveFlag;
	}

}
