package ex02.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class GiftInsert2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1. Driver load......  exception
        Class.forName("oracle.jdbc.OracleDriver");
        //2. Connection & Open
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Wallet_edudb", "song",
                "Thdrltjr12**");

        System.out.println("Gift Table data input : 상품명/최저가/최고가");
        

        String sql = "INSERT INTO GIFT VALUES(s_seq.NEXTVAL,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        StringTokenizer st = new StringTokenizer(br.readLine());
        pstmt.setString(1, st.nextToken());
        pstmt.setInt(2, Integer.parseInt(st.nextToken()));
        pstmt.setInt(3, Integer.parseInt(st.nextToken()));
        int result = pstmt.executeUpdate();

        System.out.println(result + "개 데이터 추가 성공");

        pstmt.close();
        conn.close();
    }
}


// 업데이트 삭제 ㄱㄱ