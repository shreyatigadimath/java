package com.apnacollege.javacodes;

import java.util.Scanner;

public class Demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//make a menu driven prg. the user can enter 2 numbers, either 1 or 0.   if the user enters 1 then keep taking input from the user for a student's marks(out of 100).   if they enter 0 then stop.     if he/she scores:  marks>=90 -> print "this is good".     89>=marks>=60 -> print "this is also good".     59>=marks>=0  -> print "this is good as well"
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		do {
			System.out.println("enter marks");
			int marks =sc.nextInt();
			if(marks >= 90 && marks <=100) {
				System.out.println("this is good");
			}else if (marks >= 60 && marks <=89) {
				System.out.println("this is also good");
			}else if(marks >=0 && marks<=59) {
				System.out.println("this is good as well");
			}else {
				System.out.println("invalid");
			}
			System.out.println("want to continue? (yes(1) or no(0))");
			input= sc.nextInt();
						
		}while(input == 1);


	}

}
