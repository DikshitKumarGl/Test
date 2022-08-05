package com.Library_World.controller;

import java.util.Scanner;

import com.Library_World.DBConn.DBConnect;
import com.Library_World.Model.User;

public class Signup {
	public static void sign() {
		System.out.println("---------------Welcome to User Registration Page-----------------");
		System.out.println();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter UserName");
		String name=sc.nextLine();
		System.out.println("Enter Gender");
		String gender=sc.nextLine();
		System.out.println("Enter user Email");
		String Email=sc.nextLine();
		System.out.println("Enter password");
		String password=sc.nextLine();
		System.out.println("Enter Dob in YYYY-MM-DD");
		String date=sc.nextLine();
		System.out.println("Enter Your Department");
		String dept=sc.nextLine();
		System.out.println("Enter your College Code");
		int clgcode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enetr your University Roll no");
		String Univroll=sc.nextLine();
		User u=new User(name,gender,Email,password,date,dept,clgcode,Univroll);
		DBConnect db=new DBConnect();
		System.out.println(db.insert(u));
	}
}
