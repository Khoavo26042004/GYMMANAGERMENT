package gympackageCreate;
import gympackage.*;
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import gympackageview.*;
public class CreateClass extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
PreparedStatement pst1=null;
    public CreateClass() {
        initComponents();
        //getStaffName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        cost = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jtxtTitle = new javax.swing.JTextField();
        jtxtCost = new javax.swing.JTextField();
        jbtnReset = new javax.swing.JButton();
        jbtnSubmit = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jbtnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        cost.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        cost.setText("Cost");

        title.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        title.setText("Title");

        jtxtTitle.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jtxtCost.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jtxtCost.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jbtnReset.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jbtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/erase-128.png"))); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnSubmit.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jbtnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/update icon.png"))); // NOI18N
        jbtnSubmit.setText("Create");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });

        header.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        header.setText("Create Class");

        back.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jbtnView.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jbtnView.setText("List of class");
        jbtnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnViewMouseClicked(evt);
            }
        });
        jbtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(53, 53, 53))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(jbtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jbtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(header)
                .addGap(23, 23, 23)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(back))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ////----------thực hiện trở lại----------------------
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        //new CreateClass().setVisible(true);
    }//GEN-LAST:event_backActionPerformed
    
    
   
    
    //----------thực hiện đăng kí----------------------
    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        String title = jtxtTitle.getText();
        String cost = jtxtCost.getText();
    savedClass( title,  cost);
        
    }//GEN-LAST:event_jbtnSubmitActionPerformed
    
    private void savedClass(String title, String cost) {
    conn = MysqlConnect.ConnectDB();
    java.sql.Date today = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    
    String sql = "INSERT INTO class (Title, Cost) VALUES ( ?, ?)";

    try {
        pst = conn.prepareStatement(sql);
        pst.setString(1, title);
        pst.setString(2, cost);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Class saved successfully!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error while saving class!");
    }
}
    
    //----------thực hiện làm trống----------------------
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtTitle.setText(null);
        jtxtCost.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

  
     private int checkClass(String title){
        conn = MysqlConnect.ConnectDB();
        int exist = 0;
        String sql   = "select * from class where title= '" +title+"'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                exist = 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Don't has this class!");
        }
        return exist;
    }
    private void updateTableViewClass() {
        ListOfClass vc = new ListOfClass();
        vc.DisplayClassTable();
    }    
    
    private void jbtnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnViewMouseClicked
        
    }//GEN-LAST:event_jbtnViewMouseClicked

    //=============Thực hiện mở view=============
    
    private void jbtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnViewActionPerformed
        this.displayClass();
        this.dispose();
    }//GEN-LAST:event_jbtnViewActionPerformed
    
    public void displayClass(){
        new ListOfClass().setVisible(true);
    }
    
    
    
    //=============lấy staff cho jComboBoxStaffname
    
//    public void getStaffName(){
//        conn=MysqlConnect.ConnectDB();
//        String Sql="select * from staff";
//        try{
//            pst=conn.prepareStatement(Sql);
//            rs=pst.executeQuery();
//            while(rs.next()){
//                String hello= rs.getString("SName");
//                jComboBoxStaff_name.addItem(hello);
//            }
//            //JOptionPane.showMessageDialog(null,"Entry Successful...!");
//            this.dispose();
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//        }
//    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel body;
    private javax.swing.JLabel cost;
    private javax.swing.JLabel header;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JButton jbtnView;
    private javax.swing.JTextField jtxtCost;
    private javax.swing.JTextField jtxtTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
