package com.homework;

import java.util.ArrayList;
import java.util.Optional;

public class Oclass {
	public static void main(String[] args) {
		Laptop l1=new Laptop("Del",50000,"Grey");
		Laptop l2=new Laptop("Asus",40000,"Black");
		Laptop l3=new Laptop("Hp",70000,"White");
		Laptop l4=new Laptop("Lenovo",20000,"Silver");
		ArrayList<Laptop>laps=new ArrayList<>();
		ArrayList<Laptop>lap=new ArrayList<>();
		
		laps.add(l1);
		laps.add(l2);
		laps.add(l3);
		laps.add(l4);
		Optional<String>check=Optional.ofNullable(l1.brand);
		if(check.equals("Del")) {
			System.out.println(laps+" Available");
		}
		else {
		System.out.println("Not Avail");
		}
	}

}
class Laptop {
	String brand;
	int price;
	String color;
	public Laptop(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	
}
