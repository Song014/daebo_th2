package db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	private static Connection conn;

	private DBConnection() {
	}

	static {
		// 환경설정 파일을 읽어오기 위한 객체 생성
		Properties properties  = new Properties();
		Reader reader;
		try {
			reader = new FileReader("./src/lib/oracle.properties");  // 읽어올 파일 지정
			properties.load(reader);                           // 설정 파일 로딩하기
		} catch (FileNotFoundException e1) {
			System.out.println("예외: 지정한 파일을 찾을수없습니다 :" + e1.getMessage());
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// oracle.properties 파일에 있던 key=value
		String driverName = properties.getProperty("driver");   // key
		String url = properties.getProperty("url");   // cf) setProperty(key, value)
		String user = properties.getProperty("user");
		String pwd = properties.getProperty("password");

		try {
			Class.forName(driverName);   // 1. 
			conn = DriverManager.getConnection(url, user, pwd);  // 2.
			System.out.println("cloud connection success");
		} catch (ClassNotFoundException e) {
			System.out.println("예외: 드라이버로드 실패 :" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("예외: connection fail :" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return conn;
	}
	
	public static void main(String[] args) {
		new DBConnection();
	}
}
