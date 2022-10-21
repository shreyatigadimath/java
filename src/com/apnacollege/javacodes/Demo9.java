package com.apnacollege.javacodes;

import java.util.*;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
//previous prg using switch statement
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int button=sc.nextInt();
		
		switch(button) {
		case 1 : System.out.println("hello");
		break;
		case 2 : System.out.println("namaste");
		break;
		case 3 : System.out.println("bonjour");
		break;
		default : System.out.println("invalid");
		}
		

	}

}
