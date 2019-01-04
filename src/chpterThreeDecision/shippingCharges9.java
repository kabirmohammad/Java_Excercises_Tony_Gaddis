package chpterThreeDecision;

import java.util.Scanner;

public class shippingCharges9 {

	public static void main(String[] args) {
		double weight;
		double shippingCharge=0;
		Scanner cannon = new Scanner(System.in);
		
		System.out.println("please enter the packge weight:");
		weight=cannon.nextDouble();
		
		if(weight<=2) {
			shippingCharge=1.10;
			
		}
		else if(weight<=6 && weight>2) {
			shippingCharge=2.20;
		}
		else if(weight<=10 && weight>6) {
			shippingCharge=3.70;
		}
		else if(weight>10) {
			shippingCharge=3.80;
		}
		System.out.println(" For 550 miles,the cherge would be $ " + shippingCharge);
		

	}

}
