package com.homework;

public class UseMattress {
	public static void main(String[]args) {
		String[] a=args[0].split(",");
		Mattress matt=new Mattress();
		matt.brand=a[0].toUpperCase();
		matt.colour=a[1].toUpperCase();
		matt.price=Integer.parseInt(a[2]);
		matt.isWarranty=Boolean.parseBoolean(a[3]);
		matt.frs=matt.brand.charAt(0);
		matt.lst=matt.colour.charAt(matt.colour.length()-1);
		System.out.println("brand="+matt.brand+" color="+matt.colour+" price="+matt.price+" warr="+matt.isWarranty+" firt="+matt.frs+" lst="+matt.lst);
		
		
		
	}
	}
		