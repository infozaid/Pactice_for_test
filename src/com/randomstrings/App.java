package com.randomstrings;


public class App {

	public static void main(String args[]) {

		int flag=0;
		for(int i=1;i<=100;i++) {
			for(int j=2;j<i;j++) {
				if(i%j!=0) {
					flag=1;
				}else {
					flag=0;
					break;
				}
			}
			if (flag==1) {
				System.out.println(i+": is prime number ");
			}
		}
		
	}
}
