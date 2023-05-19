package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ex01.jdbc.JdbcUtill;
import model.GogakVO;

public class Controller {
    private static Connection conn;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static ResultSet rs;
    private static PreparedStatement pstmt;

    static {
        try {
            conn = JdbcUtill.getConnection("oracle");
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void menu() throws NumberFormatException, IOException, SQLException {
        GogakVO vo = new GogakVO();
        while (true) {
            JdbcUtill.menu();
            switch (Integer.parseInt(br.readLine())) {
            case 0:
                System.out.println("RollBack 하시겠습니까?(ㅇㅇ/ㄴㄴ)");
                if (br.readLine().equals("ㅇㅇ")) {
                    conn.rollback();
                    selectAll(vo.getClassName());
                } else {
                    break;
                }
                break;
            case 1:
                selectAll(vo.getClassName());
                break;
            case 2:
                insert(vo.getClassName());
                break;
            case 3:
                update();
                break;
            case 4:
                delete();
                break;
            case 5: // 조건 검색
                break;
            case 9: // 커밋
                System.out.println("Commit 하시겠습니까?(ㅇㅇ/ㄴㄴ)");
                if (br.readLine().equals("ㅇㅇ")) {
                    conn.commit();
                    selectAll(vo.getClassName());
                } else {
                    break;
                }
                break;
            case 6:
                close();
                System.exit(0);
                break;
            default:
                break;
            }
        }

    }

    private static void selectAll(String className) {
        // TODO Auto-generated method stub

    }

    private static void delete() {

    }

    private static void update(String name) throws NumberFormatException, IOException, SQLException {
        //        selectAll(name);
        //        System.out.println("변경하실 상품번호를 입력해주세요."); int gno = Integer.parseInt(br.readLine());
        //        System.out.println("상품명: "); String gname = br.readLine();
        //        System.out.println("최저가: "); int g_start = Integer.parseInt(br.readLine());
        //        System.out.println("최고가: "); int g_end =  Integer.parseInt(br.readLine());
        //        try {
        //            pstmt = conn.prepareStatement("UPDATE GIFT SET GNAME=?,G_START=?,G_END=? WHERE GNO=?");
        //            pstmt.setInt(4, gno);
        //            pstmt.setString(1, gname);
        //            pstmt.setInt(2, g_start);
        //            pstmt.setInt(3, g_end);
        //            int result = pstmt.executeUpdate();
        //            System.out.println(result + "개의 데이터를 수정했습니다.");
        //        } catch (Exception e) {
        //            System.err.println(e.getMessage());
        //        }
    }

    public static void update() {
        Scanner sc = new Scanner(System.in);

        System.out.println("상품번호를 입력하시오.");
        String gno = sc.next();
        sc.nextLine();
        sc.nextLine();
        System.out.println("상품이름을 입력하시오.");
        String gname = sc.nextLine();
        System.out.println("상품최저가를 입력하시오.");
        String g_start = sc.next();
        System.out.println("상품최고가를 입력하시오.");
        String g_end = sc.next();

        try {
            pstmt = conn.prepareStatement("update gift set gname=?, g_start = ?, g_end=? where gno=?");
            pstmt.setString(4, gno);
            pstmt.setString(4, gno);
            pstmt.setString(1, gname);
            pstmt.setString(1, gname);
            pstmt.setString(2, g_start);
            pstmt.setString(2, g_start);
            pstmt.setString(3, g_end);
            pstmt.setString(3, g_end);

            int result = pstmt.executeUpdate();
            System.out.println(result + "데이터가 변경 되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void insert(String name) throws IOException {
        selectAll(name);

        System.out.println("고객번호를 입력하세요"); int gno = Integer.parseInt(br.readLine());
        System.out.println("고객명을 입력하세요"); String gname = br.readLine();
        System.out.println("주민번호를 입력하세요"); String jumin = br.readLine();
        System.out.println("포인트를 입력하세요"); int point = Integer.parseInt(br.readLine());

        try {
            pstmt = conn.prepareStatement("INSERT INTO " + name + " VALUES(?,?,?,?)");
            pstmt.setInt(1, gno);
            pstmt.setString(2, gname);
            pstmt.setString(3, jumin);
            pstmt.setInt(4, point);
            int result = pstmt.executeUpdate();
            System.out.println(result + "개의 데이터를 삽입했습니다.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public static void close() {
        JdbcUtill.close(rs, pstmt, conn);
    }
}
