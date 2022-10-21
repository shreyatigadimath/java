package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		 

	}

}
