package chpterThreeDecision;

import java.util.Scanner;

public class bodyMassIndex3 {

	public static void main(String[] args) {
		
		Scanner keybord = new Scanner(System.in);
		
		double userWeight;
		double userHeight;
		double bmi;
		
		System.out.println("Please enter your weight");
		userWeight=keybord.nextDouble();
		
		System.out.println("Please enter your Height");
		userHeight=keybord.nextDouble();
	
		bmi=(userWeight*703)/(userHeight*userHeight);
		
		
		if(bmi<18.5) {
		   System.out.println("underWeight");
		   
		}else if(bmi<26) {
		 
		   System.out.println("overWeight");
		}
		
		
	}

}
