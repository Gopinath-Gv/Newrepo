package com.homework;

public class UseMarker implements Marker {
private String brand;
private int price;
public UseMarker(String brand,int price) {
	this.brand=brand;
	this.price=price;
}
public void setBrand(String brand) {
	this.brand=brand;
}
public String getBrand() {
	return brand;
}
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
}
public String toString() {
	return brand+price;
}
}
