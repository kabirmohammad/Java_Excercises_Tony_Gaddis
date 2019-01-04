package practice.java.chapter.two;

import java.util.Scanner;

public class wordGame16 {

	public static void main(String[] args) {
		String name, age,city,collegeName,profession,animalType,petName;
		Scanner keyboard = new Scanner(System.in);
		
        System.out.println("please enter the name " + name);
         name = keyboard.nextLine();
         
         System.out.println("please enter the age " + age);
         age = keyboard.nextLine();
         
         System.out.println("please enter the city name " + city);
         city = keyboard.nextLine();
         
         System.out.println("please enter the college name " + collegeName);
         collegeName = keyboard.nextLine();
         
         System.out.println("please enter the profession " + profession);
         profession = keyboard.nextLine();
         
         System.out.println("please enter the animal type " + animalType);
         animalType = keyboard.nextLine();
         
         System.out.println("please enter the petName " + petName);
         petName = keyboard.nextLine();
     
         
         System.out.println("There was a person named"+ name +"who lived in "+ city +
        		 ".At the age of ");
	}

}
