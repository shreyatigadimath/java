package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a, b checking the condition equal or greater or lesser
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a");
		int a = sc.nextInt();
		
	    System.out.println("enter b");
	    int b = sc.nextInt();
	    
	    if(a==b) {
	    	System.out.println("equal");
	    }else {
	          if(a>b) {
	        	  System.out.print("a is grater than b");
	          }else {
	        	  System.out.print("a is smaller");
	          }
	    }
		
		

	}

}
