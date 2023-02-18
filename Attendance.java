package com.homework;
import java.util.Scanner;
public class Attendance {
	public static void main(String[]args) {
		int ovr=200;
		int prs;
		float percent;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("No of days present 200 out of: ");
	
		prs=scanner.nextInt();
		percent=(prs/ovr)*100;
		scanner.nextLine();
	
		if (percent > 75) {
			System.out.println(percent+" allowed to class");
		}
		else if(percent < 75) {
			System.out.println(percent+"Not allowed to class");
		}
		
	}

}
