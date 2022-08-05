package com.Library_World.DBConn;

import java.sql.*;

import com.Library_World.Model.User;

public class DBConnect {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
		return con;
		
	}
//---------------------------------------------------------------Signing user----------------
	public String insert(User u) 
	{	try{
		String Query="insert into user values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=getConnection().prepareStatement(Query);
		ps.setString(1,u.getName());
		ps.setString(2,u.getGender());
		ps.setString(3,u.getEmail());
		ps.setString(4,u.getPassword());
		ps.setString(5, u.getDob());
		ps.setString(6,u.getDept());
		ps.setInt(7, u.getClgcode());
		ps.setString(8, u.getUnivRoll());
		ps.executeUpdate();
		return "SuccessFully Registerd";
		}catch(Exception e)
	{
			e.printStackTrace();
			return "Registration Failed";
	}
}
	
//	-----------------------------------User Login-------------------------------------------
	public String logged(User u) {
		String k="false";
	 try {
		 
		 String Query="Select * from user where Email=? AND password=?";
		 PreparedStatement ps=getConnection().prepareStatement(Query);
		 
		 ps.setString(1, u.getEmail());
		 ps.setString(2, u.getPassword());
		 ResultSet rs=ps.executeQuery();
		 if(rs.next()!=false)
		 {
			 k="true";
		 }
		 //System.out.println(i);
	 }catch(Exception E)
	 {
		 
	 }
	
	return k;
	}
	
}
