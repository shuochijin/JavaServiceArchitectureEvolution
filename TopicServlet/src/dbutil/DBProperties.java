package dbutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DBProperties {
	
	private static String driver = "com.mysql.jdbc.Driver";
	
	private static String user = "root";
	
	private static String password = "rootroot";
	
	private static String url = "jdbc:mysql://localhost:3306/topic";
	
	private static Properties prop;
	static{
		try {
			String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
			System.out.println(path);
			File f = new File(path + File.separator + "jdbc.properties");
			System.out.println("f.getAbsolutePath():" + f.getAbsolutePath());
			prop = new Properties();
			prop.load(new FileInputStream(path + File.separator + "jdbc.properties"));
		} catch (FileNotFoundException e) {
			System.out.println("加载配置文件失败");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		init();
	}
	
	public static void init(){
		driver = getDriverProperties();
		
		user = getUsernameProperties();
		
		password = getPasswordProperties();
		
		url = getUrlProperties();
		
		System.out.println(driver + "\n" + user + "\n" + password + "\n" + url);
	}
	// 根据数据库名获取其驱动
	public static String getDriverProperties(){
		return prop.getProperty("jdbc.driver");
	}
	// 根据数据库名获取url
	public static String getUrlProperties(){
		return prop.getProperty("jdbc.url");
	}
	// 获取用户名
	public static String getUsernameProperties(){
		return prop.getProperty("jdbc.user");
	}
	// 获取密码
	public static String getPasswordProperties(){
		return prop.getProperty("jdbc.password");
	}
	
	public static String getDriver() {
		return driver;
	}
	public static void setDriver(String driver) {
		DBProperties.driver = driver;
	}
	public static String getUser() {
		return user;
	}
	public static void setUser(String user) {
		DBProperties.user = user;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		DBProperties.password = password;
	}
	public static String getUrl() {
		return url;
	}
	public static void setUrl(String url) {
		DBProperties.url = url;
	}
	
	public static String getPropertiesString(){
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		s.append(driver);
		s.append(",");
		s.append(user);
		s.append(",");
		s.append(password);
		s.append(",");
		s.append(url);
		s.append("]");
		
		return s.toString();
	}
}
