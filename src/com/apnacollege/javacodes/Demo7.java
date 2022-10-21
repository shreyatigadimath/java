package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// by using else if statement
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a");
		int a = sc.nextInt();
		
	    System.out.println("enter b");
	    int b = sc.nextInt();
	    
	    if(a==b) {
	    	System.out.println("equal");
	    }else if(a>b) {
	    	System.out.println("a is greater");
	    }else {
	    	System.out.println("a is smaller");
	    }

	}

}
