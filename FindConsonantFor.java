package com.homework;

public class FindConsonantFor {
	public static void main(String[]args) {
		String word="EARTH";
		int consoCount=0;
		int vowelCount=0;
		for(char c:word.toCharArray()) {
			 c=Character.toUpperCase(c);// upper condition for if c==
			 if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				 vowelCount++;
			 }
			 else {
				 consoCount++;
			 }
		}
		System.out.println(consoCount);
	}

}
