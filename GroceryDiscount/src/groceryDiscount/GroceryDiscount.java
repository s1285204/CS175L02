package groceryDiscount;

import java.util.Scanner;

public class GroceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double moneyspent = 1;
        System.out.print("Please enter the cost of your groceries or '0' to quit: ");
		moneyspent = in.nextDouble();
		
		//Calculations
		if (moneyspent < 10.00) {
			System.out.println("You are not eligible for a coupon at this time.");
		}
		else if (moneyspent >= 10.00 && moneyspent <= 60.00) {
			double discount8 = moneyspent * .08;
			System.out.println("You win a discount coupon of $ " + String.format("%.2f", discount8) + ". (8% of your purchase)");
			}
		else if (moneyspent > 60.00 && moneyspent <= 150.00) {
			double discount10 = moneyspent * .10;
			System.out.println("You win a discount coupon of $ " + String.format("%.2f", discount10) + ". (10% of your purchase)");
			}
		else if (moneyspent > 150.00 && moneyspent <= 210.00) {
			double discount12 = moneyspent * .12;
			System.out.println("You win a discount coupon of $ " + String.format("%.2f", discount12) + ". (12% of your purchase)");
			}
		else if (moneyspent > 210.00) {
			double discount14 = moneyspent * .14;
			System.out.println("You win a discount coupon of $ " + String.format("%.2f", discount14) + ". (8% of your purchase)");
			}
		moneyspent = in.nextInt();	
		
		
		
		
			
		

	}

}
