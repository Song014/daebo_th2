package dbConn.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtill {
    private static Connection conn;

    private JDBCUtill() {
    }

    public static Connection getConnection(String dsn) {
        if (conn != null)
            return conn;
        try {
            if (dsn.equalsIgnoreCase("mysql")) {
                Class.forName("org.gjt.mm.mysql.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB명 ", "song", "Thdrltjr12**");
            } else if (dsn.equalsIgnoreCase("oracle")) {
                Class.forName("oracle.jdbc.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Wallet_edudb", "song",
                        "Thdrltjr12**");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC연결오류");
        } catch (SQLException e) {
            System.out.println("db연결 오류");
        }
        System.out.println("연결 성공");

        return conn;
    }

    public static Connection getConnection(String dsn, String userid, String pwd)
            throws ClassNotFoundException, SQLException {
        if (conn != null)
            return conn;
        try {
            if (dsn.equalsIgnoreCase("mysql")) {
                Class.forName("org.gjt.mm.mysql.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB명 ", userid, pwd);
            } else if (dsn.equalsIgnoreCase("oracle")) {
                Class.forName("oracle.jdbc.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Wallet_edudb", userid,
                        pwd);
            }
            System.out.println("연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC연결오류");
        } catch (SQLException e) {
            System.out.println("db연결 오류");
        }

        return conn;
    }

    public static void close(PreparedStatement pstmt, Connection conn) {
        if (pstmt != null) {
            try {
                if (!pstmt.isClosed())
                    pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                pstmt = null;
            }
        }
        if (conn != null) {
            try {
                if (!conn.isClosed())
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }
    
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                if (!rs.isClosed())
                    rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                rs = null;
            }
        }
        if (stmt != null) {
            try {
                if (!stmt.isClosed())
                    stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                stmt = null;
            }
        }
        if (conn != null) {
            try {
                if (!conn.isClosed())
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }

    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        if (rs != null) {
            try {
                if (!rs.isClosed())
                    rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                rs = null;
            }
        }
        if (pstmt != null) {
            try {
                if (!pstmt.isClosed())
                    pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                pstmt = null;
            }
        }
        if (conn != null) {
            try {
                if (!conn.isClosed())
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }
    
    public static void menu() {
        System.out.println("\n-=-=-=-=-=-=-=-= JDBC Query =-=-=-=-=-=-=-=-");
        System.out.println("\t0.롤백");
        System.out.println("\t1.전체조회");
        System.out.println("\t2.삽입");
        System.out.println("\t3.수정");
        System.out.println("\t4.삭제");
        System.out.println("\t5.조건에 의한 검색(ex>GNO)");
        System.out.println("\t6.프로그램 종료");
        System.out.println("\t9.커밋");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
