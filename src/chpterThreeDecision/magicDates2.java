package chpterThreeDecision;

import java.util.Scanner;

public class magicDates2 {

	public static void main(String[] args) {
		
		int month;
		
		Scanner cannon=new Scanner(System.in);
		System.out.println("Please enter a month in neumeric from");
		month=cannon.nextInt();
		
		int day;
		System.out.println("Please enter a day in neumeric from");
		day=cannon.nextInt();
		
		int year;
		System.out.println("Please enter a month in neumeric from");
		year=cannon.nextInt();
		

if((month*day)==year) {
	
	System.out.println("Date is magic");
   }else {
	   System.out.println("Date is not magic");
   }
}
}
