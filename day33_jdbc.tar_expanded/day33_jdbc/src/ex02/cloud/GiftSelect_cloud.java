package ex02.cloud;

import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class GiftSelect_cloud {
	
	private static Connection conn;
	
	public static void main(String[] args) 
			  throws ClassNotFoundException,  SQLException {

		Properties properties  = new Properties();
		Reader reader;
		
		try {
			reader = new FileReader("C:/daebo_th2/1_Java/workspace/day33_jdbc/src/lib/oracle.properties");  // 읽어올 파일 지정
			properties.load(reader);   
			
			String driverName = properties.getProperty("driver");   // key
			String url = properties.getProperty("url");   
			String user = properties.getProperty("user");
			String pwd = properties.getProperty("password");
			
//			Class.forName(driverName);   
			conn = DriverManager.getConnection(url, user, pwd);   // 
		} catch (Exception e) {		e.printStackTrace();		}
		
		//3. 사용 ( DML 명령어 - Select )
		Statement  stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");   // ctrl+shift+x
		
		System.out.println("상품 번호\t상 품 명\t최 저 가\t최 고 가 : cloud에서 호출됨");
		while(rs.next()) {
			int gno = rs.getInt(1);   // rs.getXXX(인덱스번호);  // rs.getXXX("필드명");
		    String gname = rs.getString(2);
		    int g_s = rs.getInt(3);
		    int g_e = rs.getInt(4);
		    
		    System.out.println(gno +"\t"+gname+"\t"+g_s+"\t"+g_e);
		}// while end
		
		//4. 닫기 (자원 반환)
		rs.close();		stmt.close();		conn.close();
	}
}




