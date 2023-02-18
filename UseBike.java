package com.homework;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.brand="Hero";
		bike1.price=50000;
		bike1.color="Black";
		bike1.taxPercent=30;
		System.out.println(bike1.netPrice(bike1.price,bike1.taxPercent));
	}

}
