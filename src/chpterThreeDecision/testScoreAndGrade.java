package chpterThreeDecision;

import java.util.Scanner;

public class testScoreAndGrade {

	public static void main(String[] args) {
		Scanner keybord =new Scanner(System.in);
		
		double testScore1;
		double testScore2;
		double testScore3;
		double average;
		System.out.println("please enter the first test score:");
		testScore1 = keybord.nextDouble();
		
		System.out.println("please enter the second test score:");
		testScore2 = keybord.nextDouble();
		
		System.out.println("please enter the third test score:");
		testScore3 = keybord.nextDouble();
		
		average = (testScore1 + testScore2 + testScore3)/3;
		
     if(average <60) {
		System.out.printf("The average score is:"+ average + ".That is a grade F");
		
	}else if(average <70) {
		System.out.printf("The average score is:"+ average + ".That is a grade D");
			
	}if(average <80) {
		System.out.println("The average score is:"+ average + ".That is a grade C");
			
	}if(average <90) {
		System.out.println("The average score is:"+ average + ".That is a grade B");
			
	}if(average <=100) {
		System.out.println("The average score is:"+ average + ".That is a grade A");
			}
	else {
		System.out.println("The average score is:" + average +
					" That is an invalid grade.");
		}
		

	}

}
