package com.homework;

public class ForMultiAdd {
	public static void main(String[]args) {
		int num=Integer.parseInt(args[0]);
		int multi=1;
		int add=0;
		for(int i=1; i<=num; i++) {
			System.out.println(num);// repeat print
			multi=multi*i; //    Question like this (1)+(1*2)+(1*2*3)+(1*2*3*4)=33
			add=add+multi;
		}
		System.out.println(add);
	}

}
