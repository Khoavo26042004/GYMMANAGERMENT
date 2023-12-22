package gympackageFix;
import gympackage.*;
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import gympackageview.*;
import java.awt.event.KeyEvent;
public class FixClass extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
PreparedStatement pst1=null;
    public FixClass() {
        initComponents();
        //getStaffName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jButtonSearchClassID = new javax.swing.JButton();
        body = new javax.swing.JPanel();
        cost = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jtxtTitle = new javax.swing.JTextField();
        jtxtCost = new javax.swing.JTextField();
        jbtnReset = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldClassID = new javax.swing.JTextField();
        header = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButtonSearchClassID.setText("Class ID:");
        jButtonSearchClassID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchClassIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButtonSearchClassID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_search)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchClassID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

        back.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jbtnUpdate.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jbtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/update icon.png"))); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/delete_16x16.gif"))); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel1.setText("Class ID");

        jTextFieldClassID.setEditable(false);
        jTextFieldClassID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldClassID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtCost, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(jTextFieldClassID))
                                    .addComponent(jtxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jbtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))))
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextFieldClassID))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(back)
                .addContainerGap())
        );

        header.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        header.setText("Fix Class");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ////----------thực hiện trở lại----------------------
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        //new FixClass().setVisible(true);
    }//GEN-LAST:event_backActionPerformed
    
    //----------thực hiện làm trống----------------------
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtTitle.setText(null);
        jtxtCost.setText(null);

    }//GEN-LAST:event_jbtnResetActionPerformed

    //=============thực hiện cập nhật============
    
    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        String classID = jTextFieldClassID.getText();
        String title = jtxtTitle.getText();

        int cost = Integer.parseInt(jtxtCost.getText());

        this.updatedClass(title, cost,classID);
    }//GEN-LAST:event_jbtnUpdateActionPerformed
    private void updatedClass(String title,int cost,String classID) {
    conn = MysqlConnect.ConnectDB();
    String sql = "UPDATE class SET  Title = ? ,Cost = ? WHERE CLID = ?";

    try {
        pst = conn.prepareStatement(sql);
        pst.setString(1, title);
        pst.setInt(2, cost);
        pst.setString(3,classID);

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Class updated successfully!");
        pst.close();
            conn.close();
        // Các xử lý khác sau khi cập nhật lớp học thành công
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error while updating class!");
    }finally{
        try {
            
        } catch (Exception e) {
        }
    }
}
    
    //==============thực hiện xóa================
    
    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        String title = jtxtTitle.getText();       
        String classID = jTextFieldClassID.getText();
        int check = checkClass(classID);
        if(classID.equals(""))
            JOptionPane.showMessageDialog(this,"The title is not empty!");
        else{
            if(check == 1){
                int ret = JOptionPane.showConfirmDialog(this,"Would you like to delete?","Confirm",0);
                //Tạo biến để gán 2 giá trị là Cancel và Ok bên dưới
                if(ret == JOptionPane.CANCEL_OPTION)
                    return;//nếu bấn cancel nghĩa là không xóa thì chỉ việc return về thôi
                else if(ret == JOptionPane.OK_OPTION){
                    deleteClass(classID);//Nếu bấm ok thì thực hiện ham xóa bên dưới
                    JOptionPane.showMessageDialog(this,"Delete is successful!");//xóa xog thì hiện dòng này ra  
                    this.updateTableViewClass();
                } 
            }else{
                JOptionPane.showMessageDialog(this,"This custome is not exist,please press submit button to add!");
            }
        }
        
    }//GEN-LAST:event_jbtnDeleteActionPerformed
   
    protected void deleteClass(String classID) {
    conn = MysqlConnect.ConnectDB();
    String sql = "delete from class where CLID = ?";
    try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, classID);
            pst.executeUpdate();
            System.out.println("class deleted successfully!");
            pst.close();
            conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this,"Can't delete this class");
        e.printStackTrace();
    }
}

     private int checkClass(String classID){
        conn = MysqlConnect.ConnectDB();
        int exist = 0;
        String sql   = "select * FROM class where CLID= ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,classID);
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

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButtonSearchClassID.doClick();
        }
    }//GEN-LAST:event_txt_searchKeyPressed

    private void jButtonSearchClassIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchClassIDActionPerformed
        conn=MysqlConnect.ConnectDB();
        String sql = "Select CLID, Title, Cost from class WHERE CLID = ?";
        //String sql = "Select c.CID as 'CustomerID',c.CName as 'Name',c.CAge as 'Age (in years)',c.Gender,c.Height as 'Height(in cms)',c.Weight as'Weight(in kgs)',c.Phone,c.Email,c.Address from customer c WHERE CID = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String classID = rs.getString("CLID");
                jTextFieldClassID.setText(classID);
                String title = rs.getString("Title");
                jtxtTitle.setText(title);

                String cost = rs.getString("Cost");
                jtxtCost.setText(cost);

            }
        }  catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Don't exist this class!");
        }
    }//GEN-LAST:event_jButtonSearchClassIDActionPerformed

    private void jTextFieldClassIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClassIDActionPerformed
    
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
    
    //=============làm nút sự kiện cho khi click vô=============
    public String getClassID(){
        return jTextFieldClassID.getText();
    }
    public void setClassID(String classID){
        jTextFieldClassID.setText(classID);
    }
    public String getTilte(){
        return jtxtTitle.getText();
    }
    public void setTitle(String title){
        jtxtTitle.setText(title);
    }
    public String getCost(){
        return jtxtCost.getText();
    }
    public void setCost(String cost){
        jtxtCost.setText(cost);
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
            java.util.logging.Logger.getLogger(FixClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FixClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FixClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FixClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FixClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel body;
    private javax.swing.JLabel cost;
    private javax.swing.JLabel header;
    private javax.swing.JButton jButtonSearchClassID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldClassID;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JButton jbtnView;
    private javax.swing.JTextField jtxtCost;
    private javax.swing.JTextField jtxtTitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

}
