package ex01.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbConn.utill.JDBCUtill;

public class MainEntry {
   public static void main(String[] args) {
      Connection  conn = JDBCUtill.getConnection("oracle");
      Statement stmt = null;
      ResultSet rs = null;
      StringBuilder sb = new StringBuilder();
      try {
         stmt = conn.createStatement();
         //SQL구문, HTML태그는 Java/jsp/servlet에서는 문자열 취급한다.
//         sb.append("IF EXISTS TABLE DROP KOSADB ");
         sb.append("CREATE TABLE KOSADB(NAME VARCHAR2(20), AGE NUMBER) ");
         
         String sql = "";
         System.out.println(sql.toString());
         stmt.executeUpdate(sb.toString());//반환값이 없는 경우
         
         sql = "insert into kosadb values('yuna',33)";
         int result = stmt.executeUpdate(sql);
         
         sql = "select * from kosadb";
         rs = stmt.executeQuery(sql);
         
         System.out.println(result + "개 추가됨");
         
         while(rs.next()) {
         System.out.print("name: " + rs.getString(1)+"\t");
         System.out.print("age: " + rs.getInt(2)+"age");
         }   
         //conn.commit();
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
          JDBCUtill.close(rs, stmt, conn);
      }
   }
}