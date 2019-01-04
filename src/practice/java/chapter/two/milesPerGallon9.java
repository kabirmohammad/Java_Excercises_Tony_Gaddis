package practice.java.chapter.two;
import java.util.Scanner;

public class milesPerGallon9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double userMiles;
		double userGallons;
		double milesPerGallon;
		
		System.out.println("please enter the miles:");
		userMiles=scan.nextDouble();
		
		System.out.println("please enter the gallon of used gas:");
		userGallons=scan.nextDouble();
		
		milesPerGallon=userMiles/userGallons;
		
		System.out.println("miles per gallon is "+milesPerGallon);
		
	}

}
