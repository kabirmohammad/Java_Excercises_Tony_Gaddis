package chpterThreeDecision;

import java.util.Scanner;

public class massAndWeight5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mass;
		double weight;
		
		System.out.println(" Please enter an objects mass ");
		mass= scan . nextDouble();
		
		weight= mass * 9.8;
   if(weight > 1000) {
	    System.out.println(" The object weights "+ weight+ " is too heavy.");
		}
   else if(weight < 10) {
		System.out.println(" The object weights "+ weight+ " is too light.");
	}
   else {
	System.out.println(" The object weights "+ weight+ " is not too heavy or light.");
		
	}
	
	}

}
