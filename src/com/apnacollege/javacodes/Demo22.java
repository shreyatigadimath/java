package com.apnacollege.javacodes;

public class Demo22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pattern printing {solid rectangle)
		
		int n=4;
		int m=5;
		
		// outer loop
		for(int i=1; i<=n; i++) {
			// inner loop
			for(int j=1; j<=m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}