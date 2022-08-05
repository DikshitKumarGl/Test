package com.Library_World;

import java.util.Scanner;

import com.Library_World.controller.Login;
import com.Library_World.controller.Signup;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("--------------Welcome To Library World-----------------");
	System.out.println();
	System.out.println("1.) User-Registration \t 2.) Login \t 3.)CollegeDetails(Admin)");
	System.out.println("Press Any option");
	
	int n=sc.nextInt();
	switch(n)
	{
	case 1:Signup.sign();
	break;
	case 2:if(Login.login())
			{	System.out.println("Welcome To the Home Portal");
					System.out.println();
					System.out.println("1.)Book \t 2.)Previous Year Question Bank");	
			}else {
				System.out.println("-----Wrong Email-Id Or password------------");
				System.out.println("-----------------Try Again----------------- ");
				if(Login.login()) {
					System.out.println("Welcome To the Home Portal");
					System.out.println();
					System.out.println("1.)Book \t 2.)Previous Year Question Bank");	
				}
				
			}
			
	}
	
}
}
