package com.Library_World.controller;

import java.util.Scanner;

import com.Library_World.DBConn.DBConnect;
import com.Library_World.Model.User;

public class Login {
	public static boolean login() {
		Scanner sc=new Scanner(System.in);
		User u=new User();
		System.out.println("------------------Welcome To User Login Page--------------");
		System.out.println();
		System.out.println("Enter Your User Email Id");
		String username=sc.nextLine();
		u.setEmail(username);
		System.out.println("Enter Your Password");
		String pass=sc.nextLine();
		u.setPassword(pass);
		
		
		DBConnect db=new DBConnect();
		if(db.logged(u).equals("true")) {
			return true;
		}
		return false;
	}
}
