package learn.java.chapter4Loop;

import java.util.Scanner;

public class sumOfNumber1 {

	public static void main(String[] args) {
		int userNumber=-1;
		int sum=0;
		Scanner scan =new Scanner(System.in);
		
		while(userNumber<1) {
			System.out.println("please enter a nonzero integer value:");
			userNumber=scan.nextInt();
			
	}
		
		for(int number=1;number<=userNumber;number++) {
		sum=sum+number;
				
	}
    	System.out.println("The sum of numbers from 1 to "+userNumber+" is "+ sum);
    	
	}
}