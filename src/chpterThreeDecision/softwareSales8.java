package chpterThreeDecision;

import java.util.Scanner;

public class softwareSales8 {

	public static void main(String[] args) {
		int numberOfPackage;
		double discountAmount;
		double totalAmountPurchase;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" please enter the number of package purchase");
		numberOfPackage = keyboard.nextInt();
		
		if(numberOfPackage>=10 && numberOfPackage<19) {
			discountAmount=(numberOfPackage*99)*.20;	
		}
		else if(numberOfPackage>=20 && numberOfPackage<49) {
			discountAmount=(numberOfPackage*99)*.30;	
		}
		else if(numberOfPackage>=50 && numberOfPackage<99) {
			discountAmount=(numberOfPackage*99)*.40;	
		}
		else if(numberOfPackage>=100) {
			discountAmount=(numberOfPackage*99)*.50;	
		}	
		
		
		
		keyboard.close();
	}
	
	

}
