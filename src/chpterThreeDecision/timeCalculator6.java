package chpterThreeDecision;

import java.util.Scanner;

public class timeCalculator6 {

	public static void main(String[] args) {
		double userSecond;
		double minutes;
		double hours;
		double day;
   Scanner keybord = new Scanner(System.in);
   
   System.out.println(" please enter the number of second");
   userSecond = keybord.nextDouble();
   
   minutes = userSecond/60;
   hours= userSecond/3600;
   day= userSecond/86400;
   
   if(userSecond>=60 && userSecond<3600) {
	   System.out.println(" The number of minute is :" + minutes);
   }
   else if(userSecond>=3600 && userSecond<86400) {
	   System.out.println(" The number of hours is :" + hours);
   }
   else if(userSecond>=86400) {
	   System.out.println(" The number of days is :" + day);
   }
   else {
	     System.out.println("invalid number of second");
	     
	   }
   }
   
   
   
	
}
