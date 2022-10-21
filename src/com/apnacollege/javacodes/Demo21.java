package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print if a number n is prime or not(input n from the user)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		
		if(n==1) {
			System.out.println("this is neither prime not composite");
		}else if(n%2 != 0) {
			System.out.println("this is prime number");
		}else {
			System.out.println("this is not prime number");
		}

	}

}
