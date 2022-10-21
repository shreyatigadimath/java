package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // print hello for 1, namaste for 2, bonjour for 3 using if else
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int button = sc.nextInt();
		
		if(button == 1) {
			System.out.println("hello");
			
		}else if(button == 2) {
			System.out.println("namaste");
			
		}else if(button == 3) {
			System.out.println("bonjour");
			
		}else {
			System.out.println("default");
		}
	}

}
