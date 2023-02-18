package com.homework;

public class UseCalculator {
	public static void main(String[]args) {
		Calculator calci = new Calculator();
		System.out.println(calci.add(15,20));
		System.out.println(calci.sub());
		calci.multi(10,5);
		calci.divide();
	}

}
