package CarDecision;
import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Accept all inputs 
		
		System.out.print("Enter cost of regular car: ");
		double costOfRegularCar = scan.nextDouble();
		System.out.print("Enter mpg of regular car: ");
		double mpgOfRegularCar = scan.nextDouble();
		System.out.print("Enter cost of hybrid car: ");
		double costOfHybridCar = scan.nextDouble();
		System.out.print("Enter mpg of hybrid car: ");
		double mpgOfHybridCar = scan.nextDouble();
		System.out.print("Enter miles traveled in a year: ");
		double milesTraveledInYear = scan.nextDouble();
		System.out.print("Enter cost per gallon of gas: ");
		double costPerGallonOfGas = scan.nextDouble();
		
		
		
		//Perform Computations
		double yearGasRegular = (milesTraveledInYear / mpgOfRegularCar) * costPerGallonOfGas;
		double yearRegular = costOfRegularCar + yearGasRegular;
		double year2Regular = yearGasRegular + yearRegular;
		double year3Regular = yearGasRegular + year2Regular;
		double year4Regular = yearGasRegular + year3Regular;
		double year5Regular = yearGasRegular + year4Regular;
		
		double yearGasHybrid = (milesTraveledInYear / mpgOfHybridCar) * costPerGallonOfGas;
		double yearHybrid = costOfHybridCar + yearGasHybrid;
		double year2Hybrid = yearGasHybrid + yearHybrid;
		double year3Hybrid = yearGasHybrid + year2Hybrid;
		double year4Hybrid = yearGasHybrid + year3Hybrid;
		double year5Hybrid = yearGasHybrid + year4Hybrid;
		
		
		//Cost Information
		System.out.println("Cost to own after year 1 of regular car: " + yearRegular + " for hybrid car: " + yearHybrid);
		System.out.println("Cost to own after year 2 of regular car: " + year2Regular + " for hybrid car: " + year2Hybrid);
		System.out.println("Cost to own after year 3 of regular car: " + year3Regular + " for hybrid car: " + year3Hybrid);
		System.out.println("Cost to own after year 4 of regular car: " + year4Regular + " for hybrid car: " + year4Hybrid);
		System.out.println("Cost to own after year 5 of regular car: " + year5Regular + " for hybrid car: " + year5Hybrid);
		
		
		//Hybrid car cheaper than Regular car
		if (year5Hybrid < year5Regular)
		{System.out.println("The hybrid car pays back after 5 years");}
		
		
		
	}

}
