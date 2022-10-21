package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print all even numbers till n
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter n");
		 int n = sc.nextInt();
		 
		 for(int i=1; i<=n; i++) {
			 if(i%2 != 0) {
				 System.out.println(i);
			 }
		 }

	}

}
