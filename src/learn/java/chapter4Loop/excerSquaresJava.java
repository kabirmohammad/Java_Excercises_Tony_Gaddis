package learn.java.chapter4Loop;

import java.util.Scanner;

public class excerSquaresJava {

	public static void main(String[] args) {
		
		int number;
		int maxValue;
		
		System.out.println("i will display a table of "+"numbers and their squares ");
		Scanner scan=new Scanner(System.in);
		System.out.println("what is the max number should i go?");
		maxValue=scan.nextInt();
		
		System.out.println("number      number squared ");
		System.out.println("------      ---------------");
		for(number=1;number<=maxValue;number++)
		{
			System.out.println(number + "\t\t"+number*number);	
			
		}
	}

}
