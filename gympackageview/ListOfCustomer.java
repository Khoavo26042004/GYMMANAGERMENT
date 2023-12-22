package gympackageview;
import gympackage.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import gympackageFix.FixCustomers;
import java.awt.event.KeyEvent;

public class ListOfCustomer extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;

    public ListOfCustomer() {
        initComponents();
        DisplayCustTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        custtable = new javax.swing.JTable();
        back = new javax.swing.JButton();
        header = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
        });

        jButtonSearch.setText("CustomerID:");
        jButtonSearch.setBorder(null);
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonSearch)
                        .addGap(3, 3, 3)
                        .addComponent(txt_search))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonReset)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_search)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        custtable.setBackground(new java.awt.Color(204, 204, 255));
        custtable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        custtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        custtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(custtable);

        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        header.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        header.setText("View Customer Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(back))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(header)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
//        new MgrPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void custtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custtableMouseClicked
    FixCustomers ad = new FixCustomers();    
    int row = custtable.getSelectedRow();
    DefaultTableModel dtm = (DefaultTableModel) custtable.getModel();
    //String Name = (dtm.Khoa   Khoa@KgetValueAt(row, 0).toString());
        //System.out.println((dtm.getValueAt(row, 7).toString()));    
        //System.out.println(Address);
        int cusID = Integer.parseInt(dtm.getValueAt(row, 0).toString());
        String Name = (dtm.getValueAt(row, 1).toString());
        String Age =(dtm.getValueAt(row, 2).toString());
        String Gender = (dtm.getValueAt(row, 3).toString());
        String Height = (dtm.getValueAt(row, 4).toString());
        String Weight = (dtm.getValueAt(row, 5).toString());
        String Contact = (dtm.getValueAt(row, 6).toString());
        String Email = (dtm.getValueAt(row, 7).toString());
        String Address = (dtm.getValueAt(row, 8).toString());
        String date = (dtm.getValueAt(row, 9).toString());

        ad.setCusID(cusID);
        ad.setName(Name);
        ad.setAge(Age);
        ad.setGender(Gender);
        ad.setheight(Height);
        ad.setWeight(Weight);
        ad.setContact(Contact);
        ad.setEmail(Email);
        ad.setAddress(Address);
        ad.setDate(date);
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_custtableMouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        DefaultTableModel model = (DefaultTableModel) custtable.getModel();
        model.setRowCount(0);
        conn=MysqlConnect.ConnectDB();
        int cusID = Integer.parseInt( txt_search.getText()); 
        String sql = "Select c.CID as 'CustomerID',c.CName as 'Name',c.CAge as 'Age',c.Gender,c.Height as 'Height(in cms)',c.Weight as'Weight(in kgs)',c.Phone,c.Email,c.Address, c.DateOfMem from customer c WHERE CID = ?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setInt(1,cusID);
            rs=pst.executeQuery();            
            custtable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pst.close();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Don't has this customer!");
            
        }
        
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButtonSearch.doClick();
        }
    }//GEN-LAST:event_txt_searchKeyPressed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        new ListOfCustomer().setVisible(true);
    }//GEN-LAST:event_jButtonResetActionPerformed

    
    public void DisplayCustTable(){
        DefaultTableModel model = (DefaultTableModel) custtable.getModel();
        model.setRowCount(0);
        conn=MysqlConnect.ConnectDB();
        String sql = "Select c.CID as 'CustomerID', c.CName as 'Name',c.CAge as 'Age',c.Gender,c.Height as 'Height(cms)',c.Weight as'Weight(kgs)',c.Phone,c.Email,c.Address,c.DateOfMem from customer c";
        try{
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();            
            custtable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pst.close();
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOfCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTable custtable;
    private javax.swing.JLabel header;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
