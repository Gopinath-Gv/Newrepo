package com.homework;

public class OddIndexPrint {
	public static void main(String[]args) {
		String name="Gopinath";
		char[] val=name.toCharArray();
		int odd=0;
		for(int i=0; i<val.length; i++) {
			if(i%2!=0) {
				System.out.println("odd letters= "+val[i]);
				
			}
			if(i%2==0) {
				System.out.println("Even letters= "+val[i]);
			}
				
		}
	}

}
