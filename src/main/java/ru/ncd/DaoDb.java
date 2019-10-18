package ru.ncd;

import java.sql.*;

public class DaoDb {

 //   private static final String SQL_INSERT = "INSERT INTO table () VALUES (?, ?, ?, ?, ?)";

    public void save(DataModel dm){
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:~/test";
        final String USER = "sa";
        final String PASS = "";

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            String sql = "INSERT INTO WWW VALUES ("+ dm.getNumber() + "," + dm.getA() + "," + dm.getB() + "," + dm.getResult() + ")";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
