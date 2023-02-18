package com.homework;

public class OddTotalAndEvenTotal {
	public static void main(String[]args) {
		int num=10;
		int evenTotal=0;
		int oddTotal=0;
		for(int i=0; i<=num; i++) {
			if(i%2==0) {
				evenTotal=evenTotal+i;
			}
			else if(i%2!=0) {
				oddTotal=oddTotal+i;
			}
		}
		System.out.println(evenTotal);
		System.out.println(oddTotal);
	}

}
