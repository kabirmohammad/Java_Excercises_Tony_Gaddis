package practice.java.chapter.two;

public class stockCommission14 {

	public static void main(String[] args) {
		double stockAmount=21.77 * 600;
		double stockCommission=0.2 * stockAmount;
		double totalAmount = stockAmount + stockCommission;
		
		System.out.println("kathryn stock amount is $ " + stockAmount + " and she paid commission to broker $ "+
				        stockCommission + ", total amount she paid $ "+ totalAmount);
		
		

	}

}
