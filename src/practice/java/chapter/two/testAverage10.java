package practice.java.chapter.two;
import java.util.Scanner;

public class testAverage10 {

	public static void main(String[] args) {
		double firstScore;
		double secondScore; 
		double thirdScore;
		double average;
		
		Scanner cannon=new Scanner(System.in);
		
		System.out.print("please enter the first Score: ");
		firstScore=cannon.nextDouble();
		
		System.out.print("please enter the second Score: ");
		secondScore=cannon.nextDouble();
		
		System.out.print("please enter the third Score: ");
		thirdScore=cannon.nextDouble();
		
		average=(firstScore + secondScore + thirdScore)/3;
		
		System.out.println("\nThe average score is : "+ average);
		
		cannon.close();

	}

}
