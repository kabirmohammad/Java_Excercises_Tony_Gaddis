package chpterThreeDecision;

import java.util.Scanner;

public class shortedNames7 {

	public static void main(String[] args) {
		String name1;
		String name2;
		String name3;
		Scanner cannon = new Scanner(System.in);
		
		System.out.println("please enter the first name:");
		name1=cannon.nextLine();
		
		System.out.println("please enter the second name:");
		name2=cannon.nextLine();
		
		System.out.println("please enter the third name:");
		name3=cannon.nextLine();
		
		if(name1>name2) {
			System.out.println("name1 is bigger");
		}
			
		
		

	}

}
