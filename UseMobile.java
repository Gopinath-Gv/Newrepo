package com.homework;

public class UseMobile {
	
	public static void main(String[]args) {
		Mobile mob1=new Mobile();
		mob1.brand="One Plus";
		mob1.color="Black";
		mob1.price=40000;
		
		Mobile mob2=new Mobile();
		mob2.brand="Vivo";
		mob2.color="White";
		mob2.price=10000;
		
		Mobile mob3=new Mobile();
		mob3.brand="oppo";
		mob3.color="Grey";
		mob3.price=15000;
		
		Mobile mob4=new Mobile();
		mob4.brand="Samsung";
		mob4.color="Pearl White";
		mob4.price=50000;
		
		Mobile[] mobiles= {mob1,mob2,mob3,mob4};
		Mobile x=null;
		int addPrice=0;
		for(Mobile m:mobiles) {
			addPrice=addPrice+m.price;
		
		}
		//System.out.println(addPrice);// Overall totalPrice
		System.out.println(" ");
		for(int i=0; i<mobiles.length; i++) {//even brand print
			if(mobiles[i].length %2!=0) {
				
				x=mobiles[i];
			}
			
			
		}
		System.out.println(x.brand+" "+x.color+" "+x.price);
		
	}

}
