package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print sum of 1st n natural numbers
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n= sc.nextInt();
		
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum =sum + i;
		}
		System.out.println("sum is " + sum);
	}

}
