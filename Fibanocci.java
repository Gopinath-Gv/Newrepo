package com.homework;

public class Fibanocci {
	public static void main(String[]args) {
		int num=10;
		int num1=0;
		int num2=1;
		int add=0;
		
		int num3=0;
		for(int i=1; i<=num; i++) {
			num3=num1+num2;
			System.out.println(num1);
			add=add+num1;
			num1=num2;
			num2=num3;
		
			
		}
	
		System.out.println("Total2= "+add);
	
	}

}
