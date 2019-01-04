package practice.java.chapter.two;
import java.util.Scanner;

public class salesTax8 {

	public static void main(String[] args) {
		
		double stateTaxPurcentage=0.04;
		double countyTaxPurcentage=0.02;
		double purchaseAmount;
		double countyTax;
		double stateTax;
		double totalTax;
		double totalSale;
		
		Scanner cannon=new Scanner(System.in);
		 System.out.print("please enter the purchase amount: ");
		 purchaseAmount=cannon.nextDouble();		 
		 
		countyTax= countyTaxPurcentage*purchaseAmount;
		stateTax=stateTaxPurcentage*purchaseAmount;
		
		totalTax=stateTax+countyTax;
		totalSale=totalTax+purchaseAmount;
		
		System.out.println("purchase amount:"+purchaseAmount+"\n State sales tax:"+
							stateTax+"\n County sales tax:"+ countyTax+"\n total sales tax:"+
							totalTax+"\ntotal sale:"+totalSale);
		
		cannon.close();
	}
	

}
