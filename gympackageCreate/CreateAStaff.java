package gympackageCreate;
import gympackage.*;
import java.sql.*;
import javax.swing.*;
import gympackageview.*;
public class CreateAStaff extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;

    public CreateAStaff() {
        initComponents();
        id_AutoIncreate();
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
        jbtnSubmit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jbtnView = new javax.swing.JButton();
        StaffID = new javax.swing.JLabel();
        jtxtStaffID = new javax.swing.JTextField();
        jComboBoxDesignation = new javax.swing.JComboBox<>();

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

        jbtnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/update icon.png"))); // NOI18N
        jbtnSubmit.setText("Create");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/erase-128.png"))); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        header.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        header.setText("Create a Staff ");

        back.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jbtnView.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnView.setText("List of staff");
        jbtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnViewActionPerformed(evt);
            }
        });

        StaffID.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        StaffID.setText("StaffID");

        jtxtStaffID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtStaffID.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jComboBoxDesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trainer" }));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(back))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                                        .addComponent(jbtnSubmit)
                                        .addGap(14, 14, 14)))
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bodyLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnReset)
                                        .addGap(31, 31, 31)
                                        .addComponent(jbtnView))
                                    .addGroup(bodyLayout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtxtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(jtxtSAge, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(jtxtSName, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(jtxtExperience, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(jtxtStaffID)
                                            .addComponent(jComboBoxDesignation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(StaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(header)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StaffID, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jtxtStaffID))
                .addGap(11, 11, 11)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(salary)
                        .addGap(19, 19, 19)
                        .addComponent(experience)
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(designation)
                            .addComponent(jComboBoxDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(jtxtSName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtSAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jtxtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnReset)
                    .addComponent(jbtnSubmit)
                    .addComponent(jbtnView))
                .addGap(36, 36, 36)
                .addComponent(back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void id_AutoIncreate(){
        try {
            conn = MysqlConnect.ConnectDB();
            String sql = "SELECT MAX(SID) from staff";
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                int id = rs.getInt(1);
                int n = id+1;
                jtxtStaffID.setText(Integer.toString(n));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

//----------------Làm mới ô ----------------------
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtSName.setText(null);
        jtxtSAge.setText(null);
        jtxtSalary.setText(null);
        jtxtExperience.setText(null);
        jComboBoxDesignation.setSelectedItem(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        //new MgrPanel().setVisible(true);
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
    
    
    //---------------Thực hiện đăng kí nhân viên
    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
    String name = jtxtSName.getText();
    String age = jtxtSAge.getText();
    String salary = jtxtSalary.getText();
    String experience = jtxtExperience.getText();
    String designation = jComboBoxDesignation.getSelectedItem().toString();
    
    savedStaff(name, age, salary, experience, designation);

    }//GEN-LAST:event_jbtnSubmitActionPerformed

    private void savedStaff(String name, String age, String salary, String experience, String designation){
        conn = MysqlConnect.ConnectDB();
        String insertStaffQuery = "INSERT INTO staff(SName, SAge, Salary, Experience, Designation) VALUES (?,?, ?, ?, ?)";
//        String insertUserQuery = "INSERT INTO users(Roles, Username, Password, emp_ID) VALUES (?, ?, ?, ?)";

        try {
            pst = conn.prepareStatement(insertStaffQuery);
            pst.setString(1, name);
            pst.setString(2, age);
            pst.setString(3, salary);
            pst.setString(4, experience);
            pst.setString(5, designation);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Staff saved successfully!");

//            // Fetch the recently added staff member
//            pst = conn.prepareStatement("SELECT SID, SName FROM staff WHERE SName = ?");
//            pst.setString(1, name);
//            ResultSet staffResult = pst.executeQuery();
//
//            if (staffResult.next()) {
//                String staffId = staffResult.getString("SID");
//                String staffUsername = staffResult.getString("SName");
//                String staffPassword = staffUsername + "@";
//                String roles = "Staff";
//
//                pst = conn.prepareStatement(insertUserQuery);
//                pst.setString(1, roles);
//                pst.setString(2, staffUsername);
//                pst.setString(3, staffPassword);
//                pst.setString(4, staffId);
//                pst.execute();
//
//                JOptionPane.showMessageDialog(null, "User account created successfully.\nUsername: " + staffUsername + "\nPassword: " + staffPassword);
//            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error while saving staff or creating user account.");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
       
    }
    
       
    //----------------Thực hiện hiện view----------------------
    private void jbtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnViewActionPerformed
        this.displayStaffTable();
        this.dispose();
    }//GEN-LAST:event_jbtnViewActionPerformed
    public void displayStaffTable(){
        new ListOfStaff().setVisible(true);
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
            java.util.logging.Logger.getLogger(CreateAStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAStaff().setVisible(true);
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
    private javax.swing.JLabel header;
    private javax.swing.JComboBox<String> jComboBoxDesignation;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JButton jbtnView;
    private javax.swing.JTextField jtxtExperience;
    private javax.swing.JTextField jtxtSAge;
    private javax.swing.JTextField jtxtSName;
    private javax.swing.JTextField jtxtSalary;
    private javax.swing.JTextField jtxtStaffID;
    private javax.swing.JLabel name;
    private javax.swing.JLabel salary;
    // End of variables declaration//GEN-END:variables

    void setTimings(String timings) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
