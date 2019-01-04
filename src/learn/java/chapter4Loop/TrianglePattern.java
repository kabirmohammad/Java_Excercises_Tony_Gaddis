package learn.java.chapter4Loop;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		
		int baseSize=0;
    Scanner keyboard=new Scanner(System.in);

    System.out.println("what is the max base size? ");
     baseSize=keyboard.nextInt();

    for(int r=0;r<baseSize;r++) 
      {
	for(int c=0;c<(r+1);c++) 
	{
	System.out.print("*");
	
	}
	System.out.println();
	}
}

}