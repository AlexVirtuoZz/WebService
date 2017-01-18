package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import entities.Account;
/*
 * Class to provide work with database for Account entity
 */
public class JdbcAccountDAO implements AccountDAO{
	
	@Override
	public void create(Account account) {
		
		try (Connection connection = JdbcConnector.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.ACCOUNT_CREATE);) {
			connection.setAutoCommit(false);
			try {
				statement.setString(1, account.getLogin());
				statement.setString(2, account.getPassword());
				statement.executeUpdate();
				connection.commit();
			} catch (SQLException e) {
				connection.rollback();
				throw new SQLException();
			}			
		} catch (SQLException | ClassNotFoundException q) {
			throw new RuntimeException();
		} 
	}

	@Override
	public boolean update(Account e) {
		throw new NotImplementedException();

	}

	@Override
	public boolean delete(Account e) {
		throw new NotImplementedException();
	}

	@Override
	public Account read(Account account) {
		Account temp = null;
		try (Connection connection = JdbcConnector.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.ACCOUNT_READ);) {
			
			statement.setString(1, account.getLogin());
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				temp = new Account(resultSet.getLong(Constants.ACCOUNT_ID), 
				resultSet.getString(Constants.ACCOUNT_LOGIN),
				resultSet.getString(Constants.ACCOUNT_PASSWORD));				
			}
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException();
		} 
		return temp;	
	}

	@Override
	public List<Account> findAll() {
		throw new NotImplementedException();

	}

}
