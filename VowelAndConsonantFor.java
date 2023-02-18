package com.homework;

public class VowelAndConsonantFor {
	public static void main(String[]args) {
		String name="GOPINATH";
		int vowelCount=0;
		int consonantCount=0;
		for(char c : name.toCharArray()) {
			
			c=Character.toLowerCase(c);
			if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
				vowelCount++;
			}
			else {
				consonantCount++;
			}
		}
		System.out.println(vowelCount);
		System.out.println(consonantCount);

	}
	}