package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
/*
 * Class - helper to get jdbc connection
 */
public class JdbcConnector {
	
	
	/**
	 * A method to return connecting from data source
	 * @return Connection to the data source
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName(Constants.DRIVER);
		Connection conn = DriverManager.getConnection(Constants.DB_PATH, Constants.DB_LOGIN, Constants.DB_PASSWORD);
		return conn;
	}
}
