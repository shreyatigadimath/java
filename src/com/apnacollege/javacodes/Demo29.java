package com.apnacollege.javacodes;

public class Demo29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print floyd's triangle
		
		int n=5;
		int number =1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(number+" ");
				number++;		// number=number+1
			}
			System.out.println();
		}

	}

}
