package com.apnacollege.javacodes;

public class Demo27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //print half pyramid with number
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
