package learn.java.chapter4Loop;

import java.util.Scanner;

public class rectangularPattern {

	public static void main(String[] args) {
		int rows,columns;
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("How many rows? ");
		rows=keyboard.nextInt();
		
		System.out.println("How many columns? ");
		columns=keyboard.nextInt();
		
		for(int r=0;r<rows;r++) 
		{
			for(int c=0;c<columns;c++) 
			{
			System.out.print("*");
			
			}
			System.out.println();
			}
		}
		
	}
	


