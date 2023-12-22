package gympackageCreate;
import gympackage.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import gympackageview.*;
public class CreateACustomer extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
DefaultTableModel dtm = null;
    public CreateACustomer() {        
        initComponents();  
        id_AutoIncreate();
        jtxtCustomerID.setEnabled(false);
    }
    private void id_AutoIncreate(){
        try {
            conn = MysqlConnect.ConnectDB();
            String sql = "SELECT MAX(CID) from customer";
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                int id = rs.getInt(1);
                int n = id+1;
                jtxtCustomerID.setText(Integer.toString(n));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        emailid = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        jtxtAge = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtHeight = new javax.swing.JTextField();
        jtxtWeight = new javax.swing.JTextField();
        jtxtPhone = new javax.swing.JTextField();
        jbtnCreate = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jtxtEmail = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        jButtonViewCustomer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtxtCustomerID = new javax.swing.JTextField();
        CustomerID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        body.setBackground(new java.awt.Color(255, 255, 255));

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

        phone.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        phone.setText("Phone");

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

        jbtnCreate.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jbtnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/Save-icon.png"))); // NOI18N
        jbtnCreate.setText("Create");
        jbtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCreateActionPerformed(evt);
            }
        });

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

        back.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButtonViewCustomer.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButtonViewCustomer.setText("List of customer");
        jButtonViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewCustomerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Create new customer");

        jtxtCustomerID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtCustomerID.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        CustomerID.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        CustomerID.setText("CustomerID");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(emailid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtxtWeight, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtHeight, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bodyLayout.createSequentialGroup()
                                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtxtPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtxtAge)
                                        .addComponent(jtxtAddress)
                                        .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1))))
                        .addGap(174, 174, 174))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(241, 241, 241))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonViewCustomer)
                .addGap(137, 137, 137))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(jtxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(CustomerID))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(emailid))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtPhone))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(height)
                    .addComponent(jtxtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(back))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //----------thực hiện làm mới ô----------------------
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtName.setText(null);
        jtxtAge.setText(null);
        jtxtAddress.setText(null);
        jComboBoxGender.setSelectedIndex(0);
        jtxtEmail.setText(null);
        jtxtPhone.setText(null);
        jtxtHeight.setText(null);
        jtxtWeight.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    //----------thực hiện đăng kí----------------------
    private void jbtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCreateActionPerformed
        String name = jtxtName.getText();
//        int age = Integer.parseInt(jtxtAge.getText());
        String age = jtxtAge.getText();
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

        String phone = jtxtPhone.getText();
        if (phone.length() != 10) {
            // Show an error message or handle the incorrect phone length
            JOptionPane.showMessageDialog(null, "Phone number must be 10 digits.");
            
        }

        String email = jtxtEmail.getText();
        if (!email.matches(".+@gmail\\.com")) {
            // Show an error message or handle the incorrect email format
            JOptionPane.showMessageDialog(null, "Email must be in the format: example@gmail.com");
            
        }

        String address = jtxtAddress.getText();
        String gender = jComboBoxGender.getSelectedItem().toString();

//        int weight =Integer.parseInt(jtxtWeight.getText());
        String weight =jtxtWeight.getText();
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
        String height = jtxtHeight.getText();
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
    }//GEN-LAST:event_jbtnCreateActionPerformed
    
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
    
    //-----------thực hiện quay trở lại--------------------
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        //new MgrPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed
    
         
    //--------------thực hiện hiện view----------------------
    private void jButtonViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewCustomerActionPerformed
        this.DisplayCustomerTable();
        this.dispose();
    }//GEN-LAST:event_jButtonViewCustomerActionPerformed
    
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
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                               
                new CreateACustomer().setVisible(true);
                 // Create an instance of ListOfCustomer                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerID;
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JButton back;
    private javax.swing.JPanel body;
    private javax.swing.JLabel emailid;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel height;
    private javax.swing.JButton jButtonViewCustomer;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnCreate;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtAge;
    private javax.swing.JTextField jtxtCustomerID;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtHeight;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtPhone;
    private javax.swing.JTextField jtxtWeight;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel weight;
    // End of variables declaration//GEN-END:variables

    

}