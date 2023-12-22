package gympackageFix;
import gympackage.*;
import java.sql.*;
import javax.swing.*;
import gympackageview.*;
import java.awt.event.KeyEvent;
public class FixStaff extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;

    public FixStaff() {
        initComponents();
        jtxtStaffID.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        experience = new javax.swing.JLabel();
        designation = new javax.swing.JLabel();
        jtxtSName = new javax.swing.JTextField();
        jtxtSAge = new javax.swing.JTextField();
        jtxtSalary = new javax.swing.JTextField();
        jtxtExperience = new javax.swing.JTextField();
        jbtnReset = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnView = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        StaffID = new javax.swing.JLabel();
        jtxtStaffID = new javax.swing.JTextField();
        jComboBoxDesignation = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jButtonSearchStaffID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        name.setText("Name");

        age.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        age.setText("Age");

        salary.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        salary.setText("Salary");

        experience.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        experience.setText("Experience");

        designation.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        designation.setText("Designation");

        jtxtSName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jtxtSAge.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jtxtSalary.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jtxtExperience.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jbtnReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/erase-128.png"))); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jbtnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/update icon.png"))); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnView.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnView.setText("List of staff");
        jbtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnViewActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/delete_16x16.gif"))); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        StaffID.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        StaffID.setText("Staff ID");

        jtxtStaffID.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jComboBoxDesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trainer" }));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                            .addComponent(jbtnUpdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                            .addComponent(jbtnDelete)
                            .addGap(27, 27, 27)
                            .addComponent(jbtnReset)
                            .addGap(26, 26, 26)
                            .addComponent(jbtnView)
                            .addGap(95, 95, 95))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(StaffID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(salary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(197, 197, 197)
                            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtxtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(jtxtSAge, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(jtxtSName, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(jtxtExperience, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(jtxtStaffID, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(jComboBoxDesignation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(190, 190, 190)))))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(jtxtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtSAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jtxtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jtxtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(salary)
                        .addGap(18, 18, 18)
                        .addComponent(experience)
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(designation)
                            .addComponent(jComboBoxDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 47, Short.MAX_VALUE)))
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnView)
                    .addComponent(jbtnReset)
                    .addComponent(jbtnDelete)
                    .addComponent(jbtnUpdate))
                .addGap(14, 14, 14)
                .addComponent(back))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
        });

        jButtonSearchStaffID.setText("StaffID:");
        jButtonSearchStaffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchStaffIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButtonSearchStaffID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_search, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonSearchStaffID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //----------------Làm mới ô ----------------------
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtStaffID.setText(null);
        jtxtSName.setText(null);
        jtxtSAge.setText(null);
        jtxtSalary.setText(null);
        jtxtExperience.setText(null);
        jComboBoxDesignation.setSelectedItem(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
//        new MgrPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed
    private int checkStaff(String staffID){
    conn = MysqlConnect.ConnectDB();
    int exist = 0;
    String sql = "SELECT * FROM staff WHERE SID= '"+staffID+"'";
    try {
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        if(rs.next()){
            exist = 1;
        }
    } catch(SQLException ex){
        System.err.println("Don't have this Customer! " + ex.getMessage());
    } 
    return exist;
}
    
    //----------------Thực hiện xóa----------------------
    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        String staffID = jtxtStaffID.getText();        
        // Call the xoaKhachHang method to delete the customer record
        int check = checkStaff(staffID);
        if(staffID.equals(""))
            JOptionPane.showMessageDialog(this,"The name is not empty!");
        else{
            if(check == 1){
                int ret = JOptionPane.showConfirmDialog(this,"Would you like to delete?","Confirm",0);
                //Tạo biến để gán 2 giá trị là Cancel và Ok bên dưới
                if(ret == JOptionPane.CANCEL_OPTION)
                    return;//nếu bấn cancel nghĩa là không xóa thì chỉ việc return về thôi
                else if(ret == JOptionPane.OK_OPTION){
                    deleteStaff(staffID);//Nếu bấm ok thì thực hiện ham xóa bên dưới
                    JOptionPane.showMessageDialog(this,"Delete is successful!");//xóa xog thì hiện dòng này ra  
                    this.updateTableViewStaff();
                } 
            }else{
                JOptionPane.showMessageDialog(this,"This custome is not exist,please press submit button to add!");
            }
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void deleteStaff(String staffID) {

    conn = MysqlConnect.ConnectDB();
    String deleteStaffQuery = "DELETE FROM staff WHERE SID = ?";
    String selectStaffNameQuery = "SELECT SName FROM staff WHERE SID = ?";
    String deleteUsersQuery = "DELETE FROM users WHERE Username = ?";
    try {
        // Get the staff member's name before deletion
        PreparedStatement selectStaffNameStmt = conn.prepareStatement(selectStaffNameQuery);
        selectStaffNameStmt.setString(1, staffID);
        ResultSet rs = selectStaffNameStmt.executeQuery();
        String staffName = null;

        if (rs.next()) {
            staffName = rs.getString("SName");
        }

        // Delete the staff member from the staff table
        PreparedStatement deleteStaffStmt = conn.prepareStatement(deleteStaffQuery);
        deleteStaffStmt.setString(1, staffID);
        deleteStaffStmt.executeUpdate();

        // Delete the associated user from the users table
        if (staffName != null && !staffName.isEmpty()) {
            PreparedStatement deleteUsersStmt = conn.prepareStatement(deleteUsersQuery);
            deleteUsersStmt.setString(1, staffName);
            deleteUsersStmt.executeUpdate();
        }

        System.out.println("Staff member and associated user deleted successfully!");
    } catch (Exception e) {
        System.err.println("Can't delete this staff member!");
        e.printStackTrace();
    } finally {
        // Close connections and resources
        try {
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
    private void updateTableViewStaff() {
    // Gọi phương thức để cập nhật jTable trong ViewCustomer
        ListOfStaff vs = new ListOfStaff();
        vs.DisplayStaffTable();
    }
    
    //----------------Thực hiện cập nhật----------------------
    
    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        String name = jtxtSName.getText();
        String staffID = jtxtStaffID.getText();
        String age = jtxtSAge.getText();
        String salary = jtxtSalary.getText();
        String experience = jtxtExperience.getText();
        String designation = jComboBoxDesignation.getSelectedItem().toString();

        
        
        this.updateStaff(name,staffID, age, salary, experience, designation);
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void updateStaff(String name,String staffID, String age, String salary, String experience, String designation){
    conn = MysqlConnect.ConnectDB();
    String updateStaffQuery = "UPDATE staff SET SName =?,  SAge = ?, Salary = ?, Experience = ?, Designation = ? WHERE SID = ?";
    try {
            pst = conn.prepareStatement(updateStaffQuery);
            pst.setString(1,name);
            pst.setString(2, age);
            pst.setString(3, salary);
            pst.setString(4, experience);
            pst.setString(5, designation);
            pst.setString(6, staffID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Updated!");
//            // Update Username in users table
//            String updateUsername = "UPDATE users SET Username = ? WHERE emp_ID = ?";
//            pst = conn.prepareStatement(updateUsername);
//            pst.setString(1, name); // Update Username with the new 'name' value
//            pst.setString(2, staffID); // Use the 'cusID' parameter instead of jtxtCustomerID.getText()
//            pst.executeUpdate();
                                                   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Unupdated!");
        }finally{
        try {
            conn.close();
            pst.close(); 
        } catch (Exception e) {
        }
    }
}
        
    //----------------Thực hiện hiện view----------------------
    private void jbtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnViewActionPerformed
        this.displayStaffTable();
        this.dispose();
    }//GEN-LAST:event_jbtnViewActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButtonSearchStaffID.doClick();
        }
    }//GEN-LAST:event_txt_searchKeyPressed

    private void jButtonSearchStaffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchStaffIDActionPerformed
        conn=MysqlConnect.ConnectDB();
        String sql = "Select SID ,SName ,SAge ,Salary,Experience,Designation from staff WHERE SID = ?";
        //String sql = "Select c.CID as 'CustomerID',c.CName as 'Name',c.CAge as 'Age (in years)',c.Gender,c.Height as 'Height(in cms)',c.Weight as'Weight(in kgs)',c.Phone,c.Email,c.Address from customer c WHERE CID = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                int staffID = rs.getInt("SID");
                jtxtStaffID.setText(String.valueOf(staffID));

                String name = rs.getString("SName");
                jtxtSName.setText(name);

                int age = rs.getInt("SAge");
                jtxtSAge.setText(String.valueOf(age));

                String salary = rs.getString("Salary");
                jtxtSalary.setText(salary);

                String experience = rs.getString("Experience");
                jtxtExperience.setText(experience);

                String designation = rs.getString("Designation"); // Update column name here
                jComboBoxDesignation.setSelectedItem(String.valueOf(designation));

//                java.sql.Date date = rs.getDate("DateOfMem");
//                jtxtDate.setText(date.toString());

            }
        }  catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Don't exist this customer!");
        }
    }//GEN-LAST:event_jButtonSearchStaffIDActionPerformed
    public void displayStaffTable(){
        new ListOfStaff().setVisible(true);
    }
    
    
    
    
    //----------------nút sự kiện mouseclick----------------------
    public String getStaffID(){
        return jtxtStaffID.getText();
    }
    public void setStaffID(String staffID){
        jtxtStaffID.setText(staffID);
    }
    public String getName(){
        return jtxtSName.getText();
    }
    public void setName(String name){
        jtxtSName.setText(name);
    }
    public String getAge(){
        return jtxtSAge.getText();
    }
    public void setAge(String age){
        jtxtSAge.setText(age);
    }
    public String getSalary(){
        return jtxtSalary.getText();
    }
    public void setSalary(String salary){
        jtxtSalary.setText(salary);
    }
    public String getExperience(){
        return jtxtExperience.getText();
    }
    public void setExperience(String experience){
        jtxtExperience.setText(experience);
    }
    public String getDesignation(){
        return jComboBoxDesignation.getSelectedItem().toString();
    }
    public void setDesignation(String designation){
        jComboBoxDesignation.setSelectedItem(designation);
    }

    
    //-----------------hàm main----------------------
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FixStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FixStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FixStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FixStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FixStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StaffID;
    private javax.swing.JLabel age;
    private javax.swing.JButton back;
    private javax.swing.JPanel body;
    private javax.swing.JLabel designation;
    private javax.swing.JLabel experience;
    private javax.swing.JButton jButtonSearchStaffID;
    private javax.swing.JComboBox<String> jComboBoxDesignation;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JButton jbtnView;
    private javax.swing.JTextField jtxtExperience;
    private javax.swing.JTextField jtxtSAge;
    private javax.swing.JTextField jtxtSName;
    private javax.swing.JTextField jtxtSalary;
    private javax.swing.JTextField jtxtStaffID;
    private javax.swing.JLabel name;
    private javax.swing.JLabel salary;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    void setTimings(String timings) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
