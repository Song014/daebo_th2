package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      //1. Driver load......  exception
        Class.forName("oracle.jdbc.OracleDriver");
        //2. Connection & Open
        Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Wallet_edudb", 
                "song", "Thdrltjr12**" );
        
        Statement stmt = conn.createStatement();
        
//        String sql = "INSERT INTO GIFT VALUES(s_seq.NEXTVAL,'종합과자',1000,20000)";
        String sql = "INSERT INTO GIFT VALUES("+ args[0] +",'"+ args[1] +"',"+ args[2] +","+args[3]+")"; 
        int result = stmt.executeUpdate(sql);
        
        System.out.println(result + "개 데이터 추가 성공");
        
        stmt.close(); conn.close();
    }
}
