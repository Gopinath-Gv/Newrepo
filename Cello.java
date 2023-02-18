package com.homework;

public class Cello {
	public static void main(String[] args) {
	UseMarker m=new UseMarker("Cello",25);
	UseMarker mm=new UseMarker("Rorito",20);
	UseMarker[] markers= {m,mm};
	for(UseMarker x: markers) {
		System.out.println(x);
	}
	}

}
