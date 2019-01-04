package practice.java.chapter.two;

import java.util.Scanner;

public class restqaurantBill13 {

	public static void main(String[] args) {
		
	Scanner cannon = new Scanner(System.in);
    double mealCost;
    double tax;
    double totalCost;
    double tip;
    double totalBill;
    System.out.print(" please enter the cost of the meal: ");
    mealCost = cannon.nextDouble();
    
    tax=0.0675*mealCost;
    totalCost = mealCost+tax;
    
    tip = 0.2* totalCost;
    totalBill= totalCost + tip;
    System.out.println(" cost of the meal: $ " +mealCost);
    System.out.println(" tax: $ " + tax);
    System.out.println(" tip: $ " + tip);
    System.out.println(" total bill: $ " + totalBill);
    
	}

}
