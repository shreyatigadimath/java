package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calculator 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a");
		int a = sc.nextInt();
		
		System.out.println("enter b");
		int b = sc.nextInt();
		
		System.out.println("enter operator");
		int operator = sc.nextInt();
		
		
		switch(operator) {
		case 1: System.out.println("sum is\n" + a+b);
		break;
		case 2: System.out.println(a-b);
		break;
		case 3: System.out.println(a*b);
		break;
		case 4: if(b == 0) {
					System.out.println("invalid division");
				}else {
					System.out.println(a/b);
				}
		break;
		case 5: if(b == 0) {
					System.out.println("invalid division");
				}else {
					System.out.println(a%b);
				}
		default : System.out.println("invalid operation");
		}
			
		}
		

	}


