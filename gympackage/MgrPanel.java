package gympackage;
import gympackageCreate.CreateClass;
import gympackageCreate.AcceptPayment;
import gympackageCreate.CreateAStaff;
import gympackageCreate.CreateACustomer;
import java.sql.*;
import gympackageview.*;
import gympackageFix.*;

public class MgrPanel extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
String thisuser=Login.username;


    public MgrPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        custbackground = new javax.swing.JLabel();
        equipbackground = new javax.swing.JLabel();
        membackground = new javax.swing.JLabel();
        paybackground = new javax.swing.JLabel();
        staffbackground = new javax.swing.JLabel();
        classbackground = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        gymnametitle = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        hometab = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        homebackground = new javax.swing.JLabel();
        custtab = new javax.swing.JPanel();
        fixcustomer = new javax.swing.JButton();
        Listofcustomer = new javax.swing.JButton();
        CreateCus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        stafftab = new javax.swing.JPanel();
        listOfStaff = new javax.swing.JButton();
        addstaff = new javax.swing.JButton();
        jButtonCreateStaff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        classtab = new javax.swing.JPanel();
        jtxtListOfClass = new javax.swing.JButton();
        addclass = new javax.swing.JButton();
        jButtonCreateClass = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        custbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg6.jpg"))); // NOI18N

        equipbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg2.jpg"))); // NOI18N

        membackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg7.jpg"))); // NOI18N

        paybackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg11.jpg"))); // NOI18N

        staffbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg12.jpg"))); // NOI18N

        classbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/bg17.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        header.setBackground(new java.awt.Color(0, 0, 0));

        gymnametitle.setBackground(new java.awt.Color(255, 255, 255));
        gymnametitle.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 60)); // NOI18N
        gymnametitle.setForeground(new java.awt.Color(191, 166, 136));
        gymnametitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/TESTLOGO.png"))); // NOI18N
        gymnametitle.setText("NO PAIN NO GAIN");

        logout.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/Icon/logout.png"))); // NOI18N
        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel2.setText("....A moto to change");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(gymnametitle, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(35, 35, 35))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gymnametitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)))
                .addGap(12, 12, 12)
                .addComponent(logout))
        );

        tabs.setBackground(new java.awt.Color(255, 255, 255));
        tabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 17)); // NOI18N
        tabs.setPreferredSize(new java.awt.Dimension(1120, 520));

        hometab.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(199, 170, 136));
        jPanel2.setLayout(null);

        homebackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/WELCOME TO.png"))); // NOI18N
        jPanel2.add(homebackground);
        homebackground.setBounds(0, 0, 1120, 520);

        javax.swing.GroupLayout hometabLayout = new javax.swing.GroupLayout(hometab);
        hometab.setLayout(hometabLayout);
        hometabLayout.setHorizontalGroup(
            hometabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        hometabLayout.setVerticalGroup(
            hometabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hometabLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabs.addTab("Home", hometab);

        custtab.setLayout(null);

        fixcustomer.setBackground(new java.awt.Color(0, 0, 0));
        fixcustomer.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        fixcustomer.setForeground(new java.awt.Color(255, 255, 255));
        fixcustomer.setText("Fix Customer");
        fixcustomer.setBorder(null);
        fixcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixcustomerActionPerformed(evt);
            }
        });
        custtab.add(fixcustomer);
        fixcustomer.setBounds(590, 310, 160, 40);

        Listofcustomer.setBackground(new java.awt.Color(0, 0, 0));
        Listofcustomer.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        Listofcustomer.setForeground(new java.awt.Color(255, 255, 255));
        Listofcustomer.setText("List of customer");
        Listofcustomer.setBorder(null);
        Listofcustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Listofcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListofcustomerActionPerformed(evt);
            }
        });
        custtab.add(Listofcustomer);
        Listofcustomer.setBounds(770, 310, 160, 40);

        CreateCus.setBackground(new java.awt.Color(0, 0, 0));
        CreateCus.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        CreateCus.setForeground(new java.awt.Color(255, 255, 255));
        CreateCus.setText("Create customer");
        CreateCus.setBorder(null);
        CreateCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCusActionPerformed(evt);
            }
        });
        custtab.add(CreateCus);
        CreateCus.setBounds(680, 260, 160, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/Customer.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1120, 520));
        custtab.add(jLabel3);
        jLabel3.setBounds(0, -20, 1130, 560);

        tabs.addTab("Customers", custtab);

        stafftab.setLayout(null);

        listOfStaff.setBackground(new java.awt.Color(0, 0, 0));
        listOfStaff.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        listOfStaff.setForeground(new java.awt.Color(255, 255, 255));
        listOfStaff.setText("List of staff");
        listOfStaff.setBorder(null);
        listOfStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfStaffActionPerformed(evt);
            }
        });
        stafftab.add(listOfStaff);
        listOfStaff.setBounds(830, 300, 160, 40);

        addstaff.setBackground(new java.awt.Color(0, 0, 0));
        addstaff.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        addstaff.setForeground(new java.awt.Color(255, 255, 255));
        addstaff.setText("Fix Staff");
        addstaff.setBorder(null);
        addstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffActionPerformed(evt);
            }
        });
        stafftab.add(addstaff);
        addstaff.setBounds(650, 300, 160, 40);

        jButtonCreateStaff.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCreateStaff.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButtonCreateStaff.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateStaff.setText("Create staff");
        jButtonCreateStaff.setBorder(null);
        jButtonCreateStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateStaffActionPerformed(evt);
            }
        });
        stafftab.add(jButtonCreateStaff);
        jButtonCreateStaff.setBounds(740, 250, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/staff.jpg"))); // NOI18N
        stafftab.add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 520);

        tabs.addTab("Staff", stafftab);

        classtab.setLayout(null);

        jtxtListOfClass.setBackground(new java.awt.Color(0, 0, 0));
        jtxtListOfClass.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jtxtListOfClass.setForeground(new java.awt.Color(255, 255, 255));
        jtxtListOfClass.setText("List of class");
        jtxtListOfClass.setBorder(null);
        jtxtListOfClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtListOfClassActionPerformed(evt);
            }
        });
        classtab.add(jtxtListOfClass);
        jtxtListOfClass.setBounds(580, 230, 160, 40);

        addclass.setBackground(new java.awt.Color(0, 0, 0));
        addclass.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        addclass.setForeground(new java.awt.Color(255, 255, 255));
        addclass.setText("Fix Class");
        addclass.setBorder(null);
        addclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclassActionPerformed(evt);
            }
        });
        classtab.add(addclass);
        addclass.setBounds(390, 230, 160, 40);

        jButtonCreateClass.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCreateClass.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jButtonCreateClass.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateClass.setText("Create a class");
        jButtonCreateClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateClassActionPerformed(evt);
            }
        });
        classtab.add(jButtonCreateClass);
        jButtonCreateClass.setBounds(490, 180, 160, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gympackage/image/Class.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        classtab.add(jLabel4);
        jLabel4.setBounds(0, 0, 1120, 520);

        tabs.addTab("Class", classtab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login w=new Login();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void jtxtListOfClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtListOfClassActionPerformed
        ListOfClass w=new ListOfClass();
        w.setVisible(true);
    }//GEN-LAST:event_jtxtListOfClassActionPerformed

    private void addstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffActionPerformed
        new FixStaff().setVisible(true);
    }//GEN-LAST:event_addstaffActionPerformed

    private void listOfStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfStaffActionPerformed
        ListOfStaff w= new ListOfStaff();
        w.setVisible(true);

    }//GEN-LAST:event_listOfStaffActionPerformed


    private void CreateCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCusActionPerformed
        new CreateACustomer().setVisible(true);

    }//GEN-LAST:event_CreateCusActionPerformed
//GEN-FIRST:event_viewcustomerActionPerformed
//GEN-LAST:event_viewcustomerActionPerformed
    private void fixcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixcustomerActionPerformed
        new FixCustomers().setVisible(true);

    }//GEN-LAST:event_fixcustomerActionPerformed

    private void ListofcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListofcustomerActionPerformed
        new ListOfCustomer().setVisible(true);

    }//GEN-LAST:event_ListofcustomerActionPerformed

    private void jButtonCreateStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateStaffActionPerformed
        new CreateAStaff().setVisible(true);

    }//GEN-LAST:event_jButtonCreateStaffActionPerformed

    private void jButtonCreateClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateClassActionPerformed
        new CreateClass().setVisible(true);
    }//GEN-LAST:event_jButtonCreateClassActionPerformed

    private void addclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclassActionPerformed
        new FixClass().setVisible(true);
    }//GEN-LAST:event_addclassActionPerformed

   
    public void addClass(){
        new CreateClass().setVisible(true);
    }
    
//===============================================================================//
    
        
    public void addStaff(){
        new CreateAStaff().setVisible(true);
    }
    
    public void acceptPayment(){
        new AcceptPayment().setVisible(true);
    }
    
   

        
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MgrPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateCus;
    private javax.swing.JButton Listofcustomer;
    private javax.swing.JButton addclass;
    private javax.swing.JButton addstaff;
    private javax.swing.JLabel classbackground;
    private javax.swing.JPanel classtab;
    private javax.swing.JLabel custbackground;
    private javax.swing.JPanel custtab;
    private javax.swing.JLabel equipbackground;
    private javax.swing.JButton fixcustomer;
    private javax.swing.JLabel gymnametitle;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homebackground;
    private javax.swing.JPanel hometab;
    private javax.swing.JButton jButtonCreateClass;
    private javax.swing.JButton jButtonCreateStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jtxtListOfClass;
    private javax.swing.JButton listOfStaff;
    private javax.swing.JButton logout;
    private javax.swing.JLabel membackground;
    private javax.swing.JLabel paybackground;
    private javax.swing.JLabel staffbackground;
    private javax.swing.JPanel stafftab;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
