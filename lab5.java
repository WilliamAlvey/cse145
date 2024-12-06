//William Alvey
import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		//user inserts a purchase amount
		
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
		
		
		int dollars = key.nextInt();
		
		//Each chocolate bar is worth $1
		int pricePerBar = 1;
	
		//one coupon is given per bar purchase
		int cuoponsPerBar = 1;
		
		//6 coupons can be redeemed for 1 chocolate bar 
		int couponsRequired =6;
		
		//Initial values
		int totalBars = 0;
		int coupons = 0;
		
		totalBars = dollars / pricePerBar;
		coupons = totalBars;
				
		
		
		// calculates the end with coupons and money 
		while (coupons >= couponsRequired)
		{
			int extraBars = coupons / couponsRequired;
			totalBars += extraBars;
			coupons = (coupons % couponsRequired) + extraBars;
		}
		
		//exits code if money is less than or equal to -1
		
		if(dollars <= -1)
		{
			System.out.println("Invalid value for amount! Exiting the Program!");
			System.exit(0);
		}
		
		// output results
		System.out.println("Total Chocholate Bars:" + totalBars);
		System.out.println("Coupons remaining" + coupons);
		
	}
	

}

