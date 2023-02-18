package com.homework;

public class UseCasio {
	public static void main(String[]args) {
		Casio calci = new Casio();
		System.out.println(calci.sub(78, 34));
		System.out.println(calci.add());
		calci.multi(33, 23);
		calci.divide();
		
	}
	
	

}

