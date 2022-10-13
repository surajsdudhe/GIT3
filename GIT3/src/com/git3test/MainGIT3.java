package com.git3test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainGIT3 {

	public static void main(String[] args) {
		System.out.println("hello git 3 test + jdbc ");
		//online changes by user 234423
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql:3306/suraj","root","root");
				PreparedStatement ps = conn.prepareStatement("UPDATE user2 SET name = ? WHERE id=7");
				ps.setString(1, "updateBolu");
				ps.executeUpdate();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		

	}

}
 
