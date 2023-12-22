/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gympackage;
import java.sql.*;

public class MysqlConnect {
    public static Connection ConnectDB() { 
        Connection conn = null;
        String uRL = "jdbc:sqlserver://localhost:1433;databaseName=GYMMANAGERMENT;encrypt=true;trustServerCertificate=true;";//"jdbc:sqlserver://;databaseName=QLSACH";
        String userName = "sa";
        String passWord = "123456";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //com.microsoft.sqlserver.jdbc.SQLServerDriver
            conn = DriverManager.getConnection(uRL, userName, passWord);
            System.out.println("Ket noi CSDL thanh cong");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Khong ket noi duoc voi CSDL");
        }
        return conn;
    }
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        //KetNoiMSSQL kn = new KetNoiMSSQL();
        ConnectDB();
    }
}