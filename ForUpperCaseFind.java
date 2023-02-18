package com.homework;

public class ForUpperCaseFind {
	public static void main(String[]args) {
		String word=args[0];//args="GoPiNATh"
		String word2=word.toUpperCase();
		int count=0;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==word2.charAt(i)) {
				count++;
			}
		}
			System.out.println(count);
		
		
	}

}
