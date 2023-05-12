package ex02.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpCRUD {
    static Connection conn;
    static StringBuilder sb;

    static void dbConnect() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Wallet_edudb", "song",
                "Thdrltjr12**");
    }

    static void selectByEmpNo(int n) throws SQLException {
        sb = new StringBuilder();
        String sql = "SELECT * FROM EMP WHERE EMPNO = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, n);

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            for (int i = 1; i <= 8; i++)
                sb.append(rs.getString(i) + " ");
            sb.append("\n");
        } // while end
        System.out.println(sb);
    }

    static void selectByNoBtw(int startn, int endn) throws SQLException {
        sb = new StringBuilder();
        String sql = "SELECT * FROM EMP WHERE EMPNO BETWEEN ? AND ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, startn);
        pstmt.setInt(2, endn);
        
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            for (int i = 1; i <= 8; i++)
                sb.append(rs.getString(i) + " ");
            sb.append("\n");
        } // while end
        System.out.println(sb);
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        dbConnect();

        selectByNoBtw(sc.nextInt(), sc.nextInt());
        selectByEmpNo(sc.nextInt());
    }
}
