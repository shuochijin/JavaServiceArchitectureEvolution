package jdk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesFile {
	
	public static void main(String[] args) {
		Properties properties = new Properties();
		// ʹ��properties�������������
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\workspace\\java\\github\\shuochijin\\JavaServiceArchitectureEvolution\\lab\\resource\\aa"));
			properties.load(bufferedReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//��ȡkey��Ӧ��valueֵ
		System.out.println(properties.getProperty("a"));
	}

}
