/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hopital.management.system;

import java.sql.*;

/**
 *
 * @author tayyubnaveed
 */
public class connectionProvider {

    public static Connection getcon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/HMS", "root", "");

            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
