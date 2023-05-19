package ex02.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class MyModel extends AbstractTableModel {

    Object[][] data;
    String[] columnName;
    int rows, cols;

    @Override
    public int getRowCount() { // 레코드 개수
        return data.length;
    }

    public void getRowCount(ResultSet rsScroll) { // 레코드 개수
        try {
            rsScroll.last();
            rows = rsScroll.getRow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getColumnCount() { // 열의 개수
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { // 원자값
        return data[rowIndex][columnIndex];
    }

    // DB 저장된 데이터를 채움
    public void setData(ResultSet rs) {
        try {

            String title;
            ResultSetMetaData rsmd = rs.getMetaData();
            cols = rsmd.getColumnCount();
            columnName = new String[cols];
            for (int i = 0; i < cols; i++) {
                columnName[i] = rsmd.getColumnName(i+1); // 데이터베이스 필드 번호는 1부터 시작함
                System.out.println(columnName[i]);
            }
            
            data = new Object[rows][cols];
            int r=0;
            while(rs.next()) {
                for(int i=0;i<cols;i++) {
                    if(i!=1)data[r][i] = rs.getObject(i+1);
                    else data[r][i] = rs.getObject(i+1);
                }
                r++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}