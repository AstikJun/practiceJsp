package com.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
    public static boolean checkUser(String username, String pass) {
        boolean st = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "2283");
            PreparedStatement ps = con.prepareStatement("select * from user where  username=? and pass=?");
            ps.setString(1, username);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            st = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return st;
    }
}
