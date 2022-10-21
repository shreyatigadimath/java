package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print the table of a number input by the user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n =sc.nextInt();
		
		System.out.println("table of n is ");
		
		for(int i=1; i<=10; i++) {
			System.out.println(n*i);
		}

	}

}
