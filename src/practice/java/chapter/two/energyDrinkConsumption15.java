package practice.java.chapter.two;

public class energyDrinkConsumption15 {

	public static void main(String[] args) {
		
		int surveyedCustomer = 12467;
		double energyDrinkCustomer= 0.14 * surveyedCustomer;
		double citrusFlovorCustomer= 0.64 * energyDrinkCustomer;
		
		
		System.out.print("From "+ surveyedCustomer+ "customer, and "+ energyDrinkCustomer +
				      " customers are puchhase one or more energy.and others" +  citrusFlovorCustomer +
				       "prefer citrus flovored energy drinks");

	}

}
