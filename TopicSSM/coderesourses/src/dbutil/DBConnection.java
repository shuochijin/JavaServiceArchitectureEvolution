package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection con = null;
	
	private static String driver = "";
	
	private static String user = "";
	
	private static String password = "";
	
	private static String url = "";
	
	public static void getJDBCProperties(){
		if(driver.equals("") || url.equals("") || user.equals("") || password.equals("")){
			return;
		}
		driver = DBProperties.getDriverProperties();
		url = DBProperties.getUrlProperties();
		user = DBProperties.getUsernameProperties();
		password = DBProperties.getPasswordProperties();
	}
	
	public static void getJDBCStrings(){
		if(!(driver.equals("") || url.equals("") || user.equals("") || password.equals(""))){
			return;
		}
		driver = DBProperties.getDriver();
		url = DBProperties.getUrl();
		user = DBProperties.getUser();
		password = DBProperties.getPassword();
	}
	
	public static Connection getConnection(){
		try {
			if(con == null){
				getJDBCStrings();
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
