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
	private static DataSource dataSource;
	/**
	 * JdbcDAOFactory constructor
	 * initialize data source by context from specified source path
	 */
	public JdbcConnector() {
    	try {
    		Context context = new InitialContext();
			dataSource = (DataSource) context.lookup(Constants.LOOKUP_SOURCE);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}	
	
	/**
	 * A method to return connecting from data source
	 * @return Connection to the data source
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts_db","root", "");
		return conn;
	}
}
