package com.apnacollege.javacodes;

public class Demo26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inverted half pyramid (rotated by 180 degree)
		
		int n=4;
		
		for(int i=1; i<=n; i++) {		// outer loop
			
			for(int j=1; j<=n-i; j++) {		//inner loop(print space)
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {		//inner loop(print star)
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
