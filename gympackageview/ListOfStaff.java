package gympackageview;
import gympackage.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import gympackageFix.FixStaff;
import java.awt.event.KeyEvent;
public class ListOfStaff extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;

    public ListOfStaff() {
        initComponents();
        DisplayStaffTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_search1 = new javax.swing.JTextField();
        jButtonSearch1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stafftable = new javax.swing.JTable();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        header.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        header.setText("View Staff");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        txt_search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_search1KeyPressed(evt);
            }
        });

        jButtonSearch1.setText("StaffID:");
        jButtonSearch1.setBorder(null);
        jButtonSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearch1ActionPerformed(evt);
            }
        });

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButtonSearch1)
                .addGap(3, 3, 3)
                .addComponent(txt_search1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_search1)
                    .addComponent(jButtonSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        stafftable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        stafftable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        stafftable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stafftableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stafftable);

        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(back))
            .addComponent(jScrollPane1)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(header))
                    .addComponent(back))
                .addGap(17, 17, 17)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
//        new MgrPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void stafftableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stafftableMouseClicked
        // Tạo một đối tượng StaffForm (hoặc tên lớp tương ứng)
    FixStaff ad = new FixStaff();
    
    // Lấy chỉ mục hàng được chọn
    int row = stafftable.getSelectedRow();
    
    // Lấy mô hình dữ liệu (TableModel) của bảng
    DefaultTableModel dtm = (DefaultTableModel) stafftable.getModel();
    
    // Lấy giá trị từ các cột tương ứng trong hàng được chọn
    String staffID = dtm.getValueAt(row, 0).toString();
    String name = dtm.getValueAt(row, 1).toString();
    String age = dtm.getValueAt(row, 2).toString();
    String salary = dtm.getValueAt(row, 3).toString();
    String experience = dtm.getValueAt(row, 4).toString();
    String designation = dtm.getValueAt(row, 5).toString();
    
    // Hiển thị form (hoặc cửa sổ) StaffForm và thiết lập giá trị cho các trường
    
    ad.setStaffID(staffID);
    ad.setName(name);
    ad.setAge(age);
    ad.setSalary(salary);
    ad.setExperience(experience);
    ad.setDesignation(designation);
    ad.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_stafftableMouseClicked

    private void txt_search1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButtonSearch1.doClick();
        }
    }//GEN-LAST:event_txt_search1KeyPressed

    private void jButtonSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearch1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) stafftable.getModel();
        model.setRowCount(0);
        conn=MysqlConnect.ConnectDB();
        int staffID = Integer.parseInt( txt_search1.getText());
        String sql = "Select SID,SName ,SAge ,Salary,Experience,Designation from staff where SID = ?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setInt(1,staffID);
            rs=pst.executeQuery();
            stafftable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pst.close();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Don't has this customer!");

        }

    }//GEN-LAST:event_jButtonSearch1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ListOfStaff().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void DisplayStaffTable(){
    try{
        conn=MysqlConnect.ConnectDB();
        String Sql="Select SID as'StaffID',SName as 'Name',SAge as 'Age',Salary,Experience,Designation as 'Expertise' from staff";
        pst=conn.prepareStatement(Sql);
        rs=pst.executeQuery();
        stafftable.setModel(DbUtils.resultSetToTableModel(rs));
        rs.close();
        pst.close();
        conn.close();
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListOfStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOfStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOfStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOfStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOfStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSearch1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable stafftable;
    private javax.swing.JTextField txt_search1;
    // End of variables declaration//GEN-END:variables
}
