package chpterThreeDecision;

import java.util.Scanner;
public class romanNumber1 {

	public static void main(String[] args) {
		int number;
		Scanner cannon=new Scanner(System.in);
		
		System.out.println("Enter the number from 1 to 10:");
		number=cannon.nextInt();
		
		if(number<1 || number>10) 
		 {
			System.out.println("Enter a number from 1 to 10");
	     }  
		 else if(number==1) {
			 System.out.println(number+ " in roman numerals is I");
		 }
		 else if(number==2) {
			 System.out.println(number+ " in roman numerals is II");
         }
		 else if(number==3) {
			 System.out.println(number+ " in roman numerals is III");
		 }
		 else if(number==4) {
			 System.out.println(number+ " in roman numerals is IV");
		 }
		 else if(number==5) {
			 System.out.println(number+ " in roman numerals is V");
			 
		 }
		 else if(number==6) {
			 System.out.println(number+ " in roman numerals is VI");
		 }
		 else if(number==7) {
			 System.out.println(number+ " in roman numerals is VII");
		 }
		 else if(number==8) {
			 System.out.println(number+ " in roman numerals is VIII");
		 }
		 else if(number==9) {
			 System.out.println(number+ " in roman numerals is IX");
		 }
		 else if(number==10) {
			 System.out.println(number+ " in roman numerals is X");
			 
		 }
		 
	}	
	

}