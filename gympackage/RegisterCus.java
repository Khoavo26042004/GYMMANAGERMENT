
package gympackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class RegisterCus extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public RegisterCus() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldContact = new javax.swing.JTextField();
        jLabelContact = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelAddress = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jLabelHeight = new javax.swing.JLabel();
        jTextFieldHeight = new javax.swing.JTextField();
        jLabelWeight = new javax.swing.JLabel();
        jTextFieldWeight = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jLabelLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelName.setText("Name:");

        jLabelAge.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelAge.setText("Age: ");

        jLabelContact.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelContact.setText("Phone");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelEmail.setText("EmailID:");

        jLabelAddress.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelAddress.setText("Address:");

        jLabelGender.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelGender.setText("Gender:");

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "O" }));

        jLabelHeight.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelHeight.setText("Height:");

        jLabelWeight.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelWeight.setText("Weight:");

        jButtonRegister.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(102, 0, 0));
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jLabelLogin.setForeground(new java.awt.Color(0, 102, 255));
        jLabelLogin.setText("Already a account? Login");
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldContact, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldContact, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButtonRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogin)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savedCustomer(String name, String age, String phone, String email, String address, String gender, String height, String weight){
        conn = MysqlConnect.ConnectDB();
        java.sql.Date today= new java.sql.Date(Calendar.getInstance().getTime().getTime());
        String insertCustomerQuery = "INSERT INTO customer (CName, CAge, Phone, Email, Address, Gender, Height, Weight, DateOfMem) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String insertUserQuery = "INSERT INTO users (Roles, Username, Password, emp_ID) VALUES (?, ?, ?, ?)";

        try {
            pst = conn.prepareStatement(insertCustomerQuery);            
            pst.setString(1, name);
            pst.setString(2, age);
            pst.setString(3, phone);
            pst.setString(4, email);
            pst.setString(5, address);
            pst.setString(6, gender);
            pst.setString(7, height);
            pst.setString(8, weight);
            pst.setDate(9, today);
            pst.execute();          
            JOptionPane.showMessageDialog(null, "Customer details saved!");

            pst = conn.prepareStatement("SELECT CID, CName FROM customer WHERE CName = ?");
            pst.setString(1, name);
            ResultSet customerResult = pst.executeQuery();

            if (customerResult.next()) {
                String customerId = customerResult.getString("CID");
                String customerUsername = customerResult.getString("CName");
                String customerPassword = customerUsername + "@";
                String roles = "Customer";

                pst = conn.prepareStatement(insertUserQuery);
                pst.setString(1, roles);
                pst.setString(2, customerUsername);
                pst.setString(3, customerPassword);
                pst.setString(4, customerId);
                pst.execute();

                JOptionPane.showMessageDialog(null, "User account has been created successfully.\nUsername: " + customerUsername + "\nPassword: " + customerPassword);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error occurred while saving customer details or creating user account!");
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
             // Kiểm tra username

//            // Kiểm tra password
//            if (password.length() < 2 || !password.matches(".*[A-Z].*") || !password.matches(".*[!@#$%^&*].*")) {
//                throw new IllegalArgumentException("Invalid Password. It must be greater than 8 characters and contain at least one uppercase letter and one special character.");
//            }
//
//            // Kiểm tra email
//            if (!email.endsWith("@gmail.com")) {
//                throw new IllegalArgumentException("Invalid Email. It must end with '@gmail.com'.");
//            }

            // Kiểm tra address
//            if (address.length() > 100) {
//                throw new IllegalArgumentException("Invalid Address. It must not exceed 100 characters.");
//            }

            // Kiểm tra age
//            if (age < 15 || age > 70) {
//                throw new IllegalArgumentException("Invalid Age. It must be between 15 and 70.");
//            }
//
//            // Kiểm tra contact
//            if (phone.length() < 10 || phone.length() > 12) {
//                throw new IllegalArgumentException("Invalid Contact. It must be between 10 and 12 digits.");
//            }
//
//            // Kiểm tra height
//            if (height < 150 || height > 250) {
//                throw new IllegalArgumentException("Invalid Height. It must be between 150 and 250.");
//            }
//
//            // Kiểm tra weight
//            if (weight < 20 || weight > 200) {
//                throw new IllegalArgumentException("Invalid Weight. It must be between 20 and 200.");
//            }
    
    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelLoginMouseClicked

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        //        String userName = jTextFieldUserName.getText();
        //        String passWord = jTextFieldPass.getText();
        //        String role = "Customer";
        //
        //        conn = MysqlConnect.ConnectDB();
        //
        //        try {
            //            // Insert into 'users' table
            //            String userQuery = "INSERT INTO users (Username, Password, Roles) VALUES (?, ?, ?)";
            //            PreparedStatement userPst = conn.prepareStatement(userQuery);
            //            userPst.setString(1, userName);
            //            userPst.setString(2, passWord);
            //            userPst.setString(3, role);
            //            userPst.executeUpdate();
            //
            //            // Insert into 'customer' table
            //            String cusQuery = "INSERT INTO customer(CName, CAge, Phone, Email, Address, Gender, Height, Weight, DateOfMem,) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,)";
            //            PreparedStatement cusPst = conn.prepareStatement(cusQuery);
            //            // Set values for 'customer' table
            //            cusPst.setString(1, jTextFieldName.getText()); // Replace with appropriate customer name input
            //            cusPst.setString(2, jTextFieldAge.getText()); // Replace with appropriate age input (assuming integer input)
            //            cusPst.setString(3, jTextFieldContact.getText()); // Replace with appropriate phone input
            //            cusPst.setString(4, jTextFieldEmail.getText()); // Replace with appropriate email input
            //            cusPst.setString(5, jTextFieldAddress.getText()); // Replace with appropriate address input
            //            cusPst.setString(6, jComboBoxGender.getSelectedItem().toString()); // Replace with appropriate gender input
            //            cusPst.setString(7, jTextFieldHeight.getText()); // Replace with appropriate height input (assuming integer input)
            //            cusPst.setString(8, jTextFieldWeight.getText()); // Replace with appropriate weight input (assuming integer input)
            //            cusPst.setDate(9, new java.sql.Date(Calendar.getInstance().getTime().getTime())); // Current date as DateOfMem
            //            cusPst.setString(10, userName); // Username to link to 'users' table
            //            cusPst.executeUpdate();
            //
            //            JOptionPane.showMessageDialog(null, "Registered successfully!"); // Success message
            //
            //            conn.close();
            //            userPst.close();
            //            cusPst.close();
            //        } catch (SQLException e) {
            //            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            //        }
        String name = jTextFieldName.getText();
        //        int age = Integer.parseInt(jtxtAge.getText());
        String age = jTextFieldAge.getText();
        try {
            int ageValue = Integer.parseInt(age);
            if (ageValue < 15 || ageValue > 50) {
                // Show an error message or handle the out-of-range age condition
                JOptionPane.showMessageDialog(null, "Age must be between 15 and 50.");

            }
        } catch (NumberFormatException e) {
            // Handle non-numeric input for age
            JOptionPane.showMessageDialog(null, "Please enter a valid age.");

        }

        String phone = jTextFieldContact.getText();
        if (phone.length() != 10) {
            // Show an error message or handle the incorrect phone length
            JOptionPane.showMessageDialog(null, "Phone number must be 10 digits.");

        }

        String email = jTextFieldEmail.getText();
        if (!email.matches(".+@gmail\\.com")) {
            // Show an error message or handle the incorrect email format
            JOptionPane.showMessageDialog(null, "Email must be in the format: example@gmail.com");

        }

        String address = jTextFieldAddress.getText();
        String gender = jComboBoxGender.getSelectedItem().toString();

        //        int weight =Integer.parseInt(jtxtWeight.getText());
        String weight =jTextFieldWeight.getText();
        try {
            int weightValue = Integer.parseInt(weight);
            if (weightValue < 30 || weightValue > 100) {
                // Show an error message or handle the out-of-range weight condition
                JOptionPane.showMessageDialog(null, "Weight must be between 30 and 100.");

            }
        } catch (NumberFormatException e) {
            // Handle non-numeric input for weight
            JOptionPane.showMessageDialog(null, "Please enter a valid weight.");

        }

        //        int height = Integer.parseInt(jtxtHeight.getText());
        String height = jTextFieldHeight.getText();
        try {
            int heightValue = Integer.parseInt(height);
            if (heightValue < 150 || heightValue > 200) {
                // Show an error message or handle the out-of-range height condition
                JOptionPane.showMessageDialog(null, "Height must be between 150 and 200.");

            }
        } catch (NumberFormatException e) {
            // Handle non-numeric input for height
            JOptionPane.showMessageDialog(null, "Please enter a valid height.");

        }

        savedCustomer(name, age, phone, email, address, gender, height, weight);
    }//GEN-LAST:event_jButtonRegisterActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHeight;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelWeight;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldContact;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldHeight;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldWeight;
    // End of variables declaration//GEN-END:variables
}
