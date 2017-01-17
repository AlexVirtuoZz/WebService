package model.service;

import dao.JdbcAccountDAO;
import entities.Account;
/*
 * Singleton service for Account data access
 */
public class AccountService {
	private static AccountService accountDAO = new AccountService();
	public static AccountService getInstance() {
		return accountDAO;
	}
	private AccountService(){}
	
	public void create(Account account){
		new JdbcAccountDAO().create(account);
	}
	
	public Account read(Account account){
		return new JdbcAccountDAO().read(account);
	}	
	
}
