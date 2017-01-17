package dao;

public interface Constants {
	
	String ACCOUNT_CREATE = "INSERT INTO accounts (login, password) VALUES (?, ?)";
	String ACCOUNT_READ = "SELECT * FROM accounts WHERE login = ?";
	String ACCOUNT_ID = "id";
	String ACCOUNT_LOGIN = "login";
	String ACCOUNT_PASSWORD = "password";
	
	String LOOKUP_SOURCE = "jdbc/accounts_db";

}
