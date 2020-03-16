package heatIndex;
import java.util.Scanner;
public class HeatIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("                                       NOAA's National Weather Service");
		System.out.println("                                                  Heat Index");
		System.out.println(" ");
		System.out.println("Relative                                        Temperature(F)");
		System.out.println("Humidity(%)");
		
		System.out.printf("       ");
		
		//temperature
		for (int temperature = 80; temperature <= 110; temperature = temperature+2) {
			System.out.printf("%6d", temperature);
		}
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		
		//relative humidity
		for (int humidity = 40; humidity <= 100; humidity = humidity+5) {
			System.out.printf("%3d  | ", humidity);
			
			//heat index
			for(int a = 80; a <= 110; a = a + 2) {
				//calculations 
				String blank = " ";
				
				int calc = (int)(-42.379 + (2.04901523*a) + (10.14333127*humidity) - 
						(.22475541*a*humidity) - (.00683783*a*a) - (.05481717*humidity*humidity) + 
						(.00122874*a*a*humidity) + (.00085282*a*humidity*humidity) - .00000199*a*a*humidity*humidity);
				if (calc <= 137) {
					System.out.printf("%6d", calc);
				}
				else
					System.out.printf("%6s", blank);
			
			}
			System.out.println();
		}
	
		//Ending 
		boolean run = true;
		while(run == true){
			System.out.println("Enter temperature or 0 to end: ");
			double temp2 = in.nextDouble();
			if (temp2 == 0) {
				run = false;
				System.out.println("Program ended");
				break;
			}
		
			//Outcomes
			System.out.println("Enter relative humidity: ");
			double humidity2 = in.nextDouble();
			
			double thi = -42.379 + (2.04901523*temp2) + (10.14333127*humidity2) - 
					(.22475541*temp2*humidity2) - (.00683783*temp2*temp2) - (.05481717*humidity2*humidity2) + 
					(.00122874*temp2*temp2*humidity2) + (.00085282*temp2*humidity2*humidity2) - .00000199*temp2*temp2*humidity2*humidity2;
			System.out.println("The THI for a temperature of " + (int)temp2 + " and relative humidity of " + (int)humidity2 + " is " + (int)thi);
			
			if (thi <= 90) {
				System.out.println("Advisory: Caution");
			}
			else if (thi < 105) {
				System.out.println("Advisory: Extreme Caution");
			}
			else if (thi < 126) {
				System.out.println("Advisory: Danger");
			}
			else {
				System.out.println("Advisory: Extreme Danger");
			}
		}
	}

	}


