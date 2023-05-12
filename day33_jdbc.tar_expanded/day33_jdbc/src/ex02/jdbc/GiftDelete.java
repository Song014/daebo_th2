package ex02.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GiftDelete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1. Driver load......  exception
        Class.forName("oracle.jdbc.OracleDriver");
        //2. Connection & Open
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Wallet_edudb", "song",
                "Thdrltjr12**");
        
        System.out.println("삭제하실 상품번호를 입력하세요.");
        String sql = "delete gift where gno=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, Integer.parseInt(br.readLine()));
        int result = pstmt.executeUpdate();

        System.out.println(result + "개 데이터 삭제 성공");

        pstmt.close();
        conn.close();
    }
}
