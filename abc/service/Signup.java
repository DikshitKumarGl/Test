package com.abc.service;

import java.sql.Connection;
import java.util.Scanner;

import com.abc.DAO.DBCON;
import com.abc.model.Student;
import com.abc.validation.Validat;

public class Signup {
	public static void signup() {
		Scanner sc= new Scanner(System.in);
		Validat vali=new Validat();
		DBCON db=new DBCON();
		 try{
			  Connection con=db.getConnection();
			  System.out.println("Enter Roll No : ");
			  int rollno=sc.nextInt();
			  int k=rollno;
			  if(vali.ROllValid(rollno)<=4)  // for validating roll No
			  {
				  rollno=k;
			  }else
			  {
				  System.out.println("Roll Number Out of Range Should Be in Below 4 length");
				  System.out.println("Pls Try Again");
				  rollno=sc.nextInt();
			  }
			  sc.nextLine();
			  System.out.println("Enter Student Name : ");
			  String studentname=sc.nextLine();
			  System.out.println("Enter Class Standard in Roman (I to X) :");
			  String standard=sc.nextLine();
			  String st=standard;
			  if(vali.StValid(st)<=3) ///Standard Validation
			  {
				  standard=st;
			  }
			  else
			  {
				  System.out.println("Enter Valid Standard");
				  System.out.println("Enter Standard Again");
				  standard=sc.nextLine();
			  }
			  System.out.println("Enter Date of Birth yyyy-mm-dd");
			  String dob=sc.nextLine();
			  System.out.println("Enter fees");
			  double fees=sc.nextDouble();
			  Student s=new Student(rollno,studentname.toUpperCase(),standard.toUpperCase(),dob,fees);
			  System.out.println(db.insert(s));
		  }catch(Exception e) {
				 
		  }
		  
		 
	}
}
