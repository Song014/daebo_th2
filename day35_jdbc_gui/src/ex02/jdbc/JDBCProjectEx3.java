package ex02.jdbc;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dbConn.utill.JDBCUtill;

@SuppressWarnings("serial")
public class JDBCProjectEx3 extends JFrame implements ActionListener {
    //component 객체 선언
    JPanel panWest, panSouth; //왼쪽텍스트필드, 아래쪽 버튼
    JPanel p1, p2, p3, p4, p5;
    JTextField txtNo, txtName, txtEmail, txtPhone;
    JButton btnTotal, btnAdd, btnDel, btnSearch, btnCancel,btnUpdate;
    JTable table; //검색과 전체 보기를 위한 테이블 객체 생성
    //상태변화를 위한 변수 선언
    private static final int NONE = 0;
    private static final int ADD = 1;
    private static final int DELETE = 2;
    private static final int SEARCH = 3;
    private static final int TOTAL = 4;
    private static final int UPDATE = 5;
    int cmd = NONE;
    
    MyModel model;

    public JDBCProjectEx3() {
        //component 등록
        panWest = new JPanel(new GridLayout(5, 0)); // martrix 5,0
        p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT)); //sort
        p1.add(new JLabel("번    호"));
        p1.add(txtNo = new JTextField(12)); // default size
        panWest.add(p1);

        p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(new JLabel("이    름"));
        p2.add(txtName = new JTextField(12));
        panWest.add(p2);

        p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p3.add(new JLabel("이  메  일"));
        p3.add(txtEmail = new JTextField(12));
        panWest.add(p3);

        p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p4.add(new JLabel("전화번호"));
        p4.add(txtPhone = new JTextField(12));
        panWest.add(p4);

        p5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p5.add(new JLabel(""));
        panWest.add(p5);

        add(panWest, "West");

        //button 화면 아래 등록
        panSouth = new JPanel();
        panSouth.add(btnTotal = new JButton("전체보기"));
        panSouth.add(btnAdd = new JButton("추     가"));
        panSouth.add(btnDel = new JButton("삭     제"));
        panSouth.add(btnSearch = new JButton("검     색"));
        panSouth.add(btnUpdate = new JButton("업데이트"));
        panSouth.add(btnCancel = new JButton("취     소"));
        add(panSouth, "South");
        
        

        //event 처리
        btnTotal.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnAdd.addActionListener(this);
        btnDel.addActionListener(this);
        btnSearch.addActionListener(this);
        btnCancel.addActionListener(this);

        //테이블 객체 생성
        add(new JScrollPane(table = new JTable()), "Center");
        //close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //메인 창 출력
        setBounds(100, 100, 700, 300); //x,y,w,h  setSize(W,H);   pack(); 
        setVisible(true);
        dbConnection();
        total();
    } //constuctor end

    /* DB 세팅 */
    Connection conn;
    Statement stmt;
    PreparedStatement pstmtInsert, pstmtDelete, pstmtSelectAll, pstmtTotalScroll, pstmtSearch, pstmtSearchScroll,pstmtUpdate;

    private final String SQL_INSERT = "INSERT INTO CUSTOMERS VALUES(?,?,?,?)";
    private final String SQL_DELETE = "DELETE CUSTOMERS WHERE bno=?";
    private final String SQL_SELECT = "SELECT * FROM CUSTOMERS";
    private final String SQL_SEARCH = "SELECT * FROM CUSTOMERS WHERE NAME like '%?%'";
    private final String SQL_UPDATE = "UPDATE CUSTOMERS SET NAME=?,EMAIL=?,PHONE=? where bno=?";

    public void dbConnection() {
        try {
            conn = JDBCUtill.getConnection("oracle");

            pstmtInsert = conn.prepareStatement(SQL_INSERT);
            pstmtDelete = conn.prepareStatement(SQL_DELETE);
            pstmtSelectAll = conn.prepareStatement(SQL_SELECT);
            pstmtSearch = conn.prepareStatement(SQL_SEARCH);
            pstmtUpdate= conn.prepareStatement(SQL_UPDATE);

            pstmtTotalScroll = conn.prepareStatement(SQL_SELECT, ResultSet.TYPE_SCROLL_SENSITIVE, // 커서 이동을 자유롭게하고 업데이트 내용을 반영한다.
                    ResultSet.CONCUR_UPDATABLE); // ResultSet 객체 변경 가능 <==> CONCUR_READ_ONLY    

            pstmtSearchScroll = conn.prepareStatement(SQL_SELECT, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == btnAdd) {
            if (cmd != ADD) {
                setText(ADD); //user method
                return;
            } //if in
            setTitle(e.getActionCommand());
            add(); // 추가

        } else if (obj == btnDel) {
            if (cmd != DELETE) {
                setText(DELETE); //user method
                return;
            } //if in
            setTitle(e.getActionCommand());
            del(); // 삭제

        } else if (obj == btnSearch) {
            if (cmd != SEARCH) {
                setText(SEARCH); //user method
                return;
            } //if in
            setTitle(e.getActionCommand());
            search(); // 검색

        } else if (obj == btnTotal) {
            setTitle(e.getActionCommand());
            total(); // 전체보기
        } else if (obj == btnUpdate) {
            if (cmd != UPDATE) {
                setText(UPDATE); //user method
                return;
            }
            setTitle(e.getActionCommand());
            update(); // 전체보기
        }
        setText(NONE);
        init(); //초기화 메소드, user method
    }// actionPerformed end

    private void update() {
        try {
            String bno = txtNo.getText();
            String name = txtName.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();

            if ( bno.length() < 1) {
                JOptionPane.showMessageDialog(null, "고객번호는 필수 사항 입니다. 입력해주세요.");
                return;
            }

            switch (JOptionPane.showConfirmDialog(null,"고객번호 " + bno +", 이름 "+name+",이메일 "+email+", 폰 "+phone,
                    "수정하시겠습니까?", JOptionPane.YES_NO_OPTION)) {
            case 0:
                pstmtUpdate.setInt(4, Integer.parseInt(bno));
                pstmtUpdate.setString(1, name);
                pstmtUpdate.setString(2, email);
                pstmtUpdate.setString(3, phone);

                int result = pstmtUpdate.executeUpdate();
                System.out.println(result + "개 수정함");
                JOptionPane.showMessageDialog(null, "수정 되었습니다.");
                break;
            case 1:
               
                return;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        total();
    }

    private void total() {
        try {
            ResultSet rs = pstmtSelectAll.executeQuery();
            ResultSet rsScroll = pstmtTotalScroll.executeQuery();
            
            if(model == null) model = new MyModel();
            model.getRowCount(rsScroll);
            model.setData(rs);
            
            table.setModel(new DefaultTableModel(model.data,model.columnName));
            table.updateUI();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void search() {
        String strName = txtName.getText();
        
        if( strName.length() < 1 ) {
            JOptionPane.showMessageDialog(null, "이름은 필수 입니다. 입력해라~~~");
            return;
        }
        try {
            pstmtSearchScroll.setString(1, strName);
            ResultSet rsScroll = pstmtSearchScroll.executeQuery();
            pstmtSearch.setString(1, strName);
            ResultSet rs = pstmtSearch.executeQuery();
            
            if( model == null ) model = new MyModel();
            
            model.getRowCount(rsScroll);
            model.setData(rs);
            //table.setModel(model);
            table.setModel(new DefaultTableModel(model.data, model.columnName));
            table.updateUI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // end search()

    private void del() {
        try {
            String bno = txtNo.getText();

            if ( bno.length() < 1) {
                JOptionPane.showMessageDialog(null, "고객번호는 필수 사항 입니다. 입력해주세요.");
                return;
            }

            switch (JOptionPane.showConfirmDialog(null,"고객번호 " + bno ,
                    "삭제하시겠습니까?", JOptionPane.YES_NO_OPTION)) {
            case 0:
                pstmtDelete.setInt(1, Integer.parseInt(bno));

                int result = pstmtDelete.executeUpdate();
                System.out.println(result + "개 삭제함");
                JOptionPane.showMessageDialog(null, "삭제 되었습니다.");
                break;
            case 1:
               
                return;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        total();
    }

    private void add() {
        try {
            String bno = txtNo.getText();
            String name = txtName.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();

            if (bno.length() < 1 || name.length() < 1) {
                JOptionPane.showMessageDialog(null, "번호와 이름은 필수 사항 입니다. 입력해주세요.");
                return;
            }

            switch (JOptionPane.showConfirmDialog(null, "(" + bno + "," + name + "," + email + "," + phone + ",)",
                    "추가하시겠습니까?", JOptionPane.YES_NO_OPTION)) {
            case 0:
                pstmtInsert.setInt(1, Integer.parseInt(bno));
                pstmtInsert.setString(2, name);
                pstmtInsert.setString(3, email);
                pstmtInsert.setString(4, phone);

                int result = pstmtInsert.executeUpdate();
                System.out.println(result + "개 추가함");
                JOptionPane.showMessageDialog(null, "추가 되었습니다.");
                break;
            case 1:

                break;
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        total();
    }

    private void init() { //초기화 메소드
        txtNo.setText("");
        txtNo.setEditable(false);
        txtName.setText("");
        txtName.setEditable(false);
        txtEmail.setText("");
        txtEmail.setEditable(false);
        txtPhone.setText("");
        txtPhone.setEditable(false);
    }// init() end

    private void setText(int command) {
        switch (command) {
        case ADD:
        case UPDATE:
            txtNo.setEditable(true);
            txtName.setEditable(true);
            txtEmail.setEditable(true);
            txtPhone.setEditable(true);
            break;
        case DELETE:
            txtNo.setEditable(true);
            break;
        case SEARCH:
            txtName.setEditable(true);
            break;
        }//switch end

        setButton(command); //user method
    }// setText() end

    private void setButton(int command) {
        //cancel button 제외하고 어떤 버튼이 눌리더라도 모든 버튼이 비활성화
        btnTotal.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnAdd.setEnabled(false);
        btnDel.setEnabled(false);
        btnSearch.setEnabled(false);

        switch (command) {
        case ADD:
            btnAdd.setEnabled(true);
            cmd = ADD;
            break;
        case DELETE:
            btnDel.setEnabled(true);
            cmd = DELETE;
            break;
        case SEARCH:
            btnSearch.setEnabled(true);
            cmd = SEARCH;
            break;
        case TOTAL:
            btnTotal.setEnabled(true);
            cmd = TOTAL;
            break;
        case UPDATE:
            btnUpdate.setEnabled(true);
            cmd = UPDATE;
            break;
        case NONE:
            btnTotal.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnAdd.setEnabled(true);
            btnDel.setEnabled(true);
            btnSearch.setEnabled(true);
            btnCancel.setEnabled(true); //
            cmd = NONE;
            break;
        }//switch end   
    }//setButton end

    public static void main(String[] args) {

        new JDBCProjectEx3();
    }
}
