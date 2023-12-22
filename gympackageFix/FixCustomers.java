package gympackageFix;
import gympackage.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import gympackageview.*;
import java.awt.event.KeyEvent;
public class FixCustomers extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
DefaultTableModel dtm = null;
    public FixCustomers() {        
        initComponents();
        jtxtCustomerID.setEnabled(false);        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        emailid = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        jtxtAge = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtHeight = new javax.swing.JTextField();
        jtxtWeight = new javax.swing.JTextField();
        jtxtPhone = new javax.swing.JTextField();
        jbtnReset = new javax.swing.JButton();
        jtxtEmail = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        CustomerID = new javax.swing.JLabel();
        jtxtCustomerID = new javax.swing.JTextField();
        weight1 = new javax.swing.JLabel();
        jtxtDate = new javax.swing.JTextField();
        jButtonListofcusstomer = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jButtonSearchCustomerID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        date.setBackground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        name.setText("Name");

        age.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        age.setText("Age");

        address.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        address.setText("Address");

        gender.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        gender.setText("Gender");

        emailid.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        emailid.setText("Email Id");

        contact.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        contact.setText("Phone");

        height.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        height.setText("Height");

        weight.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        weight.setText("Weight");

        jtxtAge.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtAge.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jtxtAddress.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jtxtHeight.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtHeight.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jtxtWeight.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtWeight.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jtxtPhone.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtPhone.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jbtnReset.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jbtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/erase-128.png"))); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jtxtEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jtxtName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "O" }));
        jComboBoxGender.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jButtonUpdate.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/update icon.png"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/delete_16x16.gif"))); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        CustomerID.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        CustomerID.setText("CustomerID");

        jtxtCustomerID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtCustomerID.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        weight1.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        weight1.setText("Date");

        jtxtDate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtDate.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jButtonListofcusstomer.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButtonListofcusstomer.setText("List of customer");
        jButtonListofcusstomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListofcusstomerActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dateLayout = new javax.swing.GroupLayout(date);
        date.setLayout(dateLayout);
        dateLayout.setHorizontalGroup(
            dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dateLayout.createSequentialGroup()
                        .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emailid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(weight1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(152, 152, 152)
                        .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dateLayout.createSequentialGroup()
                                .addComponent(jtxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(dateLayout.createSequentialGroup()
                                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dateLayout.createSequentialGroup()
                                        .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtxtWeight, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtxtHeight, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(dateLayout.createSequentialGroup()
                                            .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jtxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jtxtPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtxtAge)
                                                    .addComponent(jtxtAddress)
                                                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(1, 1, 1))))
                                .addGap(296, 296, 296))
                            .addGroup(dateLayout.createSequentialGroup()
                                .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateLayout.createSequentialGroup()
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(315, 315, 315))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateLayout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateLayout.createSequentialGroup()
                        .addComponent(jButtonListofcusstomer)
                        .addGap(108, 108, 108))))
        );
        dateLayout.setVerticalGroup(
            dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCustomerID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtName)
                    .addComponent(name))
                .addGap(21, 21, 21)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address))
                .addGap(18, 18, 18)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dateLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(emailid))
                    .addGroup(dateLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtPhone))
                .addGap(18, 18, 18)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(height)
                    .addComponent(jtxtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(weight1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListofcusstomer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
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

        jButtonSearchCustomerID.setText("CustomerID:");
        jButtonSearchCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchCustomerIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButtonSearchCustomerID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_search)
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
                    .addComponent(jButtonSearchCustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //----------thực hiện làm mới ô----------------------
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtCustomerID.setText(null);
        jtxtName.setText(null);
        jtxtAge.setText(null);
        jtxtAddress.setText(null);
        jComboBoxGender.setSelectedIndex(0);
        jtxtEmail.setText(null);
        jtxtPhone.setText(null);
        jtxtHeight.setText(null);
        jtxtWeight.setText(null);
        jtxtDate.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed
    
    //-----------thực hiện quay trở lại--------------------
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
//        new MgrPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    //-----------thực hiện xóa----------------------
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
        String cusID = jtxtCustomerID.getText();        
        // Call the xoaKhachHang method to delete the customer record
        int check = checkCustomer(cusID);
        if(cusID.equals(""))
            JOptionPane.showMessageDialog(this,"The name is not empty!");
        else{
            if(check == 1){
                int ret = JOptionPane.showConfirmDialog(this,"Would you like to delete?","Confirm",0);
                //Tạo biến để gán 2 giá trị là Cancel và Ok bên dưới
                if(ret == JOptionPane.CANCEL_OPTION)
                    return;//nếu bấn cancel nghĩa là không xóa thì chỉ việc return về thôi
                else if(ret == JOptionPane.OK_OPTION){
                    deleteCustomer(cusID);//Nếu bấm ok thì thực hiện ham xóa bên dưới
                    JOptionPane.showMessageDialog(this,"Delete is successful!");//xóa xog thì hiện dòng này ra  
                    this.updateTableViewCustomer();
                } 
            }else{
                JOptionPane.showMessageDialog(this,"This custome is not exist,please press submit button to add!");
            }
        }    
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    
    public void deleteCustomer(String cusID) {
        conn = MysqlConnect.ConnectDB();
        String deletePaymentQuery = "DELETE FROM payment WHERE CID = ?";
//        String deleteSignupQuery = "DELETE FROM signup WHERE CID = ?";
        String deleteCustomerQuery = "DELETE FROM customer WHERE CID = ?";
        String deleteUsersQuery = "DELETE FROM users WHERE Username = ?"; 
        try {
            // Delete corresponding entries in the payment table
            PreparedStatement deletePaymentStmt = conn.prepareStatement(deletePaymentQuery);
            deletePaymentStmt.setString(1, cusID);
            deletePaymentStmt.executeUpdate();

            // Delete corresponding entries in the signup table
//            PreparedStatement pstSU = conn.prepareStatement(deleteSignupQuery);
//            pstSU.setString(1, cusID);
//            pstSU.executeUpdate();

            // Retrieve the customer name before deletion
            String customerName = getCustomerName(cusID);

            // Delete the customer from the customer table
            PreparedStatement deleteCustomerStmt = conn.prepareStatement(deleteCustomerQuery);
            deleteCustomerStmt.setString(1, cusID);
            deleteCustomerStmt.executeUpdate();

            // Delete the associated user from the users table
            if (customerName != null && !customerName.isEmpty()) {
                PreparedStatement deleteUsersStmt = conn.prepareStatement(deleteUsersQuery);
                deleteUsersStmt.setString(1, customerName);
                deleteUsersStmt.executeUpdate();
            }

            System.out.println("Customer and associated user deleted successfully!");
        } catch (Exception e) {
            System.err.println("Can't delete this customer!");
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
    private String getCustomerName(String cusID) {
        String customerName = "";
        try {
            String query = "SELECT CName FROM customer WHERE CID = ?";
            pst = conn.prepareStatement(query);
            pst.setString(1, cusID);
            rs = pst.executeQuery();
            if (rs.next()) {
                customerName = rs.getString("CName");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerName;
}
        
    private void updateTableViewCustomer() {
    // Gọi phương thức để cập nhật jTable trong ListOfCustomer
        ListOfCustomer viewCustomer = new ListOfCustomer();
        viewCustomer.DisplayCustTable();
    }
    
    //--------------thực hiện cập nhật----------------------
    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        String name = jtxtName.getText();
        String cusID = jtxtCustomerID.getText();
        String age = jtxtAge.getText();
        String contact = jtxtPhone.getText();
        String email = jtxtEmail.getText();
        String address = jtxtAddress.getText();
        String gender = jComboBoxGender.getSelectedItem().toString();
        String weight = jtxtWeight.getText();
        String height = jtxtHeight.getText();
        this.updateCus(name,cusID, age, contact, email, address, gender, weight, height);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void updateCus(String name,String cusID, String age, String contact, String email, String address, String gender, String weight, String height) {
        conn = MysqlConnect.ConnectDB();        
        String updateCustomer = "UPDATE customer SET CName = ?, CAge = ?, Phone = ?, Email = ?, Address = ?, Gender = ?, Height = ?, Weight = ? WHERE CID = ?";
        try {            
            pst = conn.prepareStatement(updateCustomer);
            pst.setString(1, jtxtName.getText());
            pst.setString(2, jtxtAge.getText());
            pst.setString(3, jtxtPhone.getText());
            pst.setString(4, jtxtEmail.getText());
            pst.setString(5, jtxtAddress.getText());
            pst.setString(6, jComboBoxGender.getSelectedItem().toString());
            pst.setString(7, jtxtHeight.getText());
            pst.setString(8, jtxtWeight.getText());
            pst.setString(9, jtxtCustomerID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Updated!");
            // Update Username in users table
//            String updateUsername = "UPDATE users SET Username = ? WHERE emp_ID = ?";
//            pst = conn.prepareStatement(updateUsername);
//            pst.setString(1, name); // Update Username with the new 'name' value
//            pst.setString(2, cusID); // Use the 'cusID' parameter instead of jtxtCustomerID.getText()
//            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Can't update!");
        }
        
    }
    
    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButtonSearchCustomerID.doClick();
        }
    }//GEN-LAST:event_txt_searchKeyPressed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void jButtonSearchCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchCustomerIDActionPerformed
        conn=MysqlConnect.ConnectDB();
        String sql = "Select CID ,CName ,CAge ,Phone,Email,Address,Gender,Height,Weight,DateOfMem from customer WHERE CID = ?";
        //String sql = "Select c.CID as 'CustomerID',c.CName as 'Name',c.CAge as 'Age (in years)',c.Gender,c.Height as 'Height(in cms)',c.Weight as'Weight(in kgs)',c.Phone,c.Email,c.Address from customer c WHERE CID = ?";
        try {
        pst = conn.prepareStatement(sql);
        pst.setString(1, txt_search.getText());
        rs = pst.executeQuery();
            if (rs.next()) {
                int cusID = rs.getInt("CID");
                jtxtCustomerID.setText(String.valueOf(cusID));

                String name = rs.getString("CName");
                jtxtName.setText(name);

                int age = rs.getInt("CAge");
                jtxtAge.setText(String.valueOf(age));

                String phone = rs.getString("Phone");
                jtxtPhone.setText(phone);

                String email = rs.getString("Email");
                jtxtEmail.setText(email);

                String address = rs.getString("Address");
                jtxtAddress.setText(address);

                String gender = rs.getString("Gender");
                jComboBoxGender.setSelectedItem(gender);

                int height = rs.getInt("Height"); // Update column name here
                jtxtHeight.setText(String.valueOf(height));

                int weight = rs.getInt("Weight"); // Update column name here
                jtxtWeight.setText(String.valueOf(weight));


                java.sql.Date date = rs.getDate("DateOfMem");
                jtxtDate.setText(date.toString());


            }
    }  catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Don't exist this customer!");
        }
    }//GEN-LAST:event_jButtonSearchCustomerIDActionPerformed

    private void jButtonListofcusstomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListofcusstomerActionPerformed
        this.dispose();
        new ListOfCustomer().setVisible(true);
    }//GEN-LAST:event_jButtonListofcusstomerActionPerformed

    
     
   
    public void DisplayCustomerTable(){
        new ListOfCustomer().setVisible(true);          
    }
    
    private int checkCustomer(String cusID){
    conn = MysqlConnect.ConnectDB();
    int exist = 0;
    String sql = "SELECT * FROM customer WHERE CID= '"+cusID+"'";
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
    
    //---------------thực hiện nút mouseclick cho bảng view------------------
    public int getCusID() {
    String text = jtxtCustomerID.getText();
    int cusID = Integer.parseInt(text);
    return cusID;
    }
    
    public void setCusID(int cusID) {
    String text = String.valueOf(cusID);
    jtxtCustomerID.setText(text);
}
    
    public String getName(){
        return jtxtName.getText();
    }
    public void setName(String name){
        jtxtName.setText(name);
    }
    public String getAge(){
        return jtxtAge.getText();
    }
    public void setAge(String age){
        jtxtAge.setText(age);
    }  
    public JTextField getheight(){
        return jtxtHeight;
    }
    public void setheight(String height){
        jtxtHeight.setText(height);
    }
    public String getWeight(){
        return jtxtWeight.getText();
    }
    public void setWeight(String weight){
        jtxtWeight.setText(weight);
    }
    public String getContact(){
        return jtxtPhone.getText();
    }
    public void setContact(String contact){
        jtxtPhone.setText(contact);
    }
    public String getEmail(){
        return jtxtEmail.getText();
    }
    public void setEmail(String email){
        jtxtEmail.setText(email);
    }
    public String getGender(){
        return jComboBoxGender.getSelectedItem().toString();
    }
    public void setGender(String gender){
        jComboBoxGender.setSelectedItem(gender);
    }
    public String getAddress(){
        return jtxtAddress.getText();
    }
    public void setAddress(String address){
        jtxtAddress.setText(address);
    }  
    
    public String getDate(){
        return jtxtDate.getText();
    }
    
    public void setDate(String date){
        jtxtDate.setText(date);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                               
                new FixCustomers().setVisible(true);
                 // Create an instance of ListOfCustomer                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerID;
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JButton back;
    private javax.swing.JLabel contact;
    private javax.swing.JPanel date;
    private javax.swing.JLabel emailid;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel height;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonListofcusstomer;
    private javax.swing.JButton jButtonSearchCustomerID;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtAge;
    private javax.swing.JTextField jtxtCustomerID;
    private javax.swing.JTextField jtxtDate;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtHeight;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtPhone;
    private javax.swing.JTextField jtxtWeight;
    private javax.swing.JLabel name;
    private javax.swing.JTextField txt_search;
    private javax.swing.JLabel weight;
    private javax.swing.JLabel weight1;
    // End of variables declaration//GEN-END:variables
}