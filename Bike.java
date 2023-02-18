package com.homework;

public class Bike {
	String brand;
	int price;
	String color;
	int taxPercent;
	int netPrice;
	
	public int netPrice(int a, int b) {
		int price=(a+(a*b)/100);
		return price;
	}
	

}
