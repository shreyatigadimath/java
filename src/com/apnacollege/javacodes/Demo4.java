package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// taking input for user  and checking the condition
		// if-else condition
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
	
		
		if(age > 18) {
			
			System.out.println("Adult");
		}else {
		System.out.println("Not Adult");
		}
	}

}
