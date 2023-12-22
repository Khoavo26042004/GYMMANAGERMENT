package gympackage;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
public static String username,password;
    public Login() {
        initComponents();
        //dùng để chỉnh màn hình ra giữa
        Toolkit tk = getToolkit();
        Dimension size = tk.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        gymnametitle = new javax.swing.JLabel();
        im3 = new javax.swing.JLabel();
        im2 = new javax.swing.JLabel();
        im4 = new javax.swing.JLabel();
        im6 = new javax.swing.JLabel();
        im5 = new javax.swing.JLabel();
        im9 = new javax.swing.JLabel();
        im7 = new javax.swing.JLabel();
        im8 = new javax.swing.JLabel();
        im10 = new javax.swing.JLabel();
        moto = new javax.swing.JLabel();
        sep = new javax.swing.JSeparator();
        form = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        uname = new javax.swing.JLabel();
        jtxtunamev = new javax.swing.JTextField();
        pwd = new javax.swing.JLabel();
        jtxtpwdv = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxRoles = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelRegisterUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        gymnametitle.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        gymnametitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/gymlogo.jpg"))); // NOI18N
        gymnametitle.setText("POWER GYM");

        im3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/3.jpg"))); // NOI18N

        im2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/2.jpg"))); // NOI18N

        im4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/4.jpg"))); // NOI18N

        im6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/6.jpg"))); // NOI18N

        im5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/5.jpg"))); // NOI18N

        im9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/9.jpg"))); // NOI18N

        im7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/7.jpg"))); // NOI18N

        im8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/8.jpg"))); // NOI18N

        im10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/10.jpg"))); // NOI18N

        moto.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        moto.setText("....A vision to change");

        form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1000, 1220));
        bg.setMinimumSize(new java.awt.Dimension(1000, 1220));
        bg.setOpaque(false);
        bg.setPreferredSize(new java.awt.Dimension(1000, 1300));
        bg.setLayout(null);

        uname.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        uname.setText("Username");
        bg.add(uname);
        uname.setBounds(640, 70, 97, 22);

        jtxtunamev.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtunamev.setText("Enter username");
        jtxtunamev.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtxtunamev.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtunamevFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtunamevFocusLost(evt);
            }
        });
        bg.add(jtxtunamev);
        jtxtunamev.setBounds(770, 70, 150, 22);

        pwd.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        pwd.setText("Password");
        bg.add(pwd);
        pwd.setBounds(640, 100, 97, 22);

        jtxtpwdv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtpwdv.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtxtpwdv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtpwdvKeyPressed(evt);
            }
        });
        bg.add(jtxtpwdv);
        jtxtpwdv.setBounds(770, 100, 150, 22);

        login.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        bg.add(login);
        login.setBounds(640, 190, 273, 25);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Show password");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        bg.add(jRadioButton1);
        jRadioButton1.setBounds(630, 160, 120, 21);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel2.setText("Roles");
        bg.add(jLabel2);
        jLabel2.setBounds(640, 130, 97, 22);

        jComboBoxRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer" }));
        bg.add(jComboBoxRoles);
        jComboBoxRoles.setBounds(770, 130, 150, 22);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        jLabel1.setText("Login");
        bg.add(jLabel1);
        jLabel1.setBounds(710, 0, 124, 46);

        jLabelRegisterUser.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelRegisterUser.setText("Don't have account?Register");
        jLabelRegisterUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterUserMouseClicked(evt);
            }
        });
        bg.add(jLabelRegisterUser);
        jLabelRegisterUser.setBounds(650, 220, 250, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dazzling\\OneDrive\\Pictures\\customized-gym-wallpaper-1000x1000.jpg")); // NOI18N
        bg.add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 994);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(bg, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        conn = MysqlConnect.ConnectDB();
        String sql = "SELECT Username, Password, Roles FROM users WHERE Username = ? AND Password = ? AND Roles = ?";
        String enteredRole = jComboBoxRoles.getSelectedItem().toString();

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jtxtunamev.getText());
            pst.setString(2, jtxtpwdv.getText());
            pst.setString(3,jComboBoxRoles.getSelectedItem().toString());
            rs = pst.executeQuery();

            boolean userFound = false;

            while (rs.next()) {
                String storedRole = rs.getString("Roles");
                String storedUsername = rs.getString("Username");

                if (storedRole.equals(enteredRole) && storedUsername.equals(jtxtunamev.getText())) {
                    userFound = true;
                    switch (storedRole) {
                        case "Admin":
                            MgrPanel j = new MgrPanel();
                            j.setVisible(true);
                            this.dispose();
                            break;
                        case "Customer":
                            UserPanel u = new UserPanel();
                            u.setVisible(true);
                            this.dispose();
                            break;
//                        case "Staff":
//                            StaffPanel s = new StaffPanel();
//                            s.setVisible(true);
//                            this.dispose();
//                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Invalid role!");
                            break;
                    }
                    break;
                }
            }

            if (!userFound) {
                JOptionPane.showMessageDialog(null, "Incorrect username, password, or role!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    
    private void jtxtpwdvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtpwdvKeyPressed

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    conn = MysqlConnect.ConnectDB();
            String sql = "SELECT Username, Password, Roles FROM users WHERE Username = ? AND Password = ?";
            String enteredRole = jComboBoxRoles.getSelectedItem().toString();

            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, jtxtunamev.getText());
                pst.setString(2, jtxtpwdv.getText());
                rs = pst.executeQuery();

                boolean userFound = false;

                while (rs.next()) {
                    String storedRole = rs.getString("Roles");
                    String storedUsername = rs.getString("Username");

                    if (storedRole.equals(enteredRole) && storedUsername.equals(jtxtunamev.getText())) {
                        userFound = true;
                        switch (storedRole) {
                            case "Admin":
                                MgrPanel j = new MgrPanel();
                                j.setVisible(true);
                                this.dispose();
                                break;
                            case "Customer":
                                UserPanel u = new UserPanel();
                                u.setVisible(true);
                                this.dispose();
                                break;
//                            case "Staff":
//                                StaffPanel s = new StaffPanel();
//                                s.setVisible(true);
//                                this.dispose();
//                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid role!");
                                break;
                        }
                        break;
                    }
                }

                if (!userFound) {
                    JOptionPane.showMessageDialog(null, "Incorrect username, password, or role!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (pst != null) {
                        pst.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jtxtpwdvKeyPressed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
                                        
        if (jRadioButton1.isSelected())
        jtxtpwdv.setEchoChar((char) 0);
        else {
            jtxtpwdv.setEchoChar('*');
        }
    
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jtxtunamevFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtunamevFocusGained
        if(jtxtunamev.getText().equals("Enter username")){
            jtxtunamev.setText("");
        }
    }//GEN-LAST:event_jtxtunamevFocusGained

    private void jtxtunamevFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtunamevFocusLost
        if(jtxtunamev.getText().equals("")){
            jtxtunamev.setText("Enter username");
        }
    }//GEN-LAST:event_jtxtunamevFocusLost

    private void jLabelRegisterUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterUserMouseClicked
        new RegisterCus().setVisible(true);
    }//GEN-LAST:event_jLabelRegisterUserMouseClicked
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel form;
    private javax.swing.JLabel gymnametitle;
    private javax.swing.JLabel im10;
    private javax.swing.JLabel im2;
    private javax.swing.JLabel im3;
    private javax.swing.JLabel im4;
    private javax.swing.JLabel im5;
    private javax.swing.JLabel im6;
    private javax.swing.JLabel im7;
    private javax.swing.JLabel im8;
    private javax.swing.JLabel im9;
    private javax.swing.JComboBox<String> jComboBoxRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelRegisterUser;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPasswordField jtxtpwdv;
    private javax.swing.JTextField jtxtunamev;
    private javax.swing.JButton login;
    private javax.swing.JLabel moto;
    private javax.swing.JLabel pwd;
    private javax.swing.JSeparator sep;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables


}
