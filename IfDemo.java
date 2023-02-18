
package com.homework;
import java.util.Scanner;

public class IfDemo {
	public static void main(String[]args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=scanner.nextInt();
		if(num > 0) {
			System.out.println(num+ " is positive");
		}
		else if (num==0) {
			System.out.println(num+" is neutral");
		}
		else {
			System.out.println(num+" is negative");
		}
	}

}
