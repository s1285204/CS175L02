package carDecisionVersion2;
import java.util.Scanner;
public class CarCostCalculationVersion2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		

		//Accept all inputs 
		
			System.out.println("Enter the info for the regular car (Make, Model, Cost, and MPG: ");
			String regularInfo = in.nextLine();
			
			System.out.println("Enter the info for the hybrid car (Make, Model, Cost, and MPG: ");
			String hybridInfo = in.nextLine();
			
			System.out.print("Enter miles traveled in a year: ");
			double milesTrav = in.nextDouble();
			
			System.out.print("Enter cost per gallon of gas: ");
			double costGal = in.nextDouble();
			
			
			
			//Variables
				String[] arrRegInfo = regularInfo.split(", ");
				        String mmReg = arrRegInfo[0];
				        int costReg = Integer.parseInt(arrRegInfo[1]);
				        int mpgRegular = Integer.parseInt(arrRegInfo[2]);
				String[] arrHybInfo = hybridInfo.split(", ");
				        String mmHyb = arrHybInfo[0];
				        int costHyb = Integer.parseInt(arrHybInfo[1]);
				        int mpgHybrid = Integer.parseInt(arrHybInfo[2]);
				
				
				//Perform Computations
				double yearGasRegular = (milesTrav / mpgRegular) * costGal;
				double yearRegular = costReg + yearGasRegular;
				double year2Regular = yearGasRegular + yearRegular;
				double year3Regular = yearGasRegular + year2Regular;
				double year4Regular = yearGasRegular + year3Regular;
				double year5Regular = yearGasRegular + year4Regular; 
				
				double yearGasHybrid = (milesTrav / mpgHybrid) * costGal;
				double yearHybrid = costHyb + yearGasHybrid;
				double year2Hybrid = yearGasHybrid + yearHybrid;
				double year3Hybrid = yearGasHybrid + year2Hybrid;
				double year4Hybrid = yearGasHybrid + year3Hybrid;
				double year5Hybrid = yearGasHybrid + year4Hybrid;
				
				//Cost Information
				System.out.println("Cost to own after year 1 for " + mmReg + ": " + yearRegular + " for " + mmHyb + ": " + yearHybrid + "");
				System.out.println("Cost to own after year 2 for " + mmReg + ": " + year2Regular + " for " + mmHyb + ": " + year2Hybrid + "");
				System.out.println("Cost to own after year 3 for " + mmReg + ": " + year3Regular + " for " + mmHyb + ": " + year3Hybrid + ""); 
				System.out.println("Cost to own after year 4 for " + mmReg + ": " + year4Regular + " for " + mmHyb + ": " + year4Hybrid + ""); 
				System.out.println("Cost to own after year 5 for " + mmReg + ": " + year5Regular + " for " + mmHyb + ": " + year5Hybrid + "");
			
				
				//Prius pays back in 5 years
				if (year5Hybrid < year5Regular)
				{System.out.println("The " + mmHyb + " pays back after 5 years");}
				
	}

}
