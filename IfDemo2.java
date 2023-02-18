package com.homework;
import java.util.Scanner;;
public class IfDemo2 {
	public static void main(String[]args) {   /// scanner method
		int mark;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter mark: ");
		mark=scanner.nextInt();
		if(mark<=34) {
			System.out.println(mark+" is D fail grade");
		}
		else if(mark<=50) {
			System.out.println(mark+" is C garde");
		}
		else if (mark<=75) {
			System.out.println(mark+" is B grade");
		}
		else if (mark<=100) {
			System.out.println(mark+" is A garde");
		}
		else if (mark<=101) {
				System.out.println("entered a wrong mark");
			}
		
		else {
			System.out.println("Not attend the exam");
		}
	
	}

}
