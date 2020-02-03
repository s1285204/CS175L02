package housePainting;
import java.util.Scanner;

public class housePainting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Accept all dimensions

	    System.out.print("Enter width of the house: ");
		int houseWidth = scan.nextInt();
		System.out.print("Enter the length of the house: ");
		int houseLength = scan.nextInt();
		System.out.print("Enter the height of the house: ");
		int houseHeight = scan.nextInt();
		System.out.print("Enter the number of windows: ");
		int numberOfWindows = scan.nextInt();
		System.out.print("Enter the length of the Window: ");
		int lengthOfWindows = scan.nextInt();
		System.out.print("Enter the width of the Window: ");
		int widthOfWindows = scan.nextInt();
		System.out.print("Enter the number of doors: ");
		int numberOfDoors = scan.nextInt();
		System.out.print("Enter the length of the Door: ");
		int lengthOfDoors = scan.nextInt();
		System.out.print("Enter the width of the Door: ");
		int widthOfDoors = scan.nextInt();
		int windowSquareFeet = (numberOfWindows * lengthOfWindows * widthOfWindows);
		int doorSquareFeet = (numberOfDoors * lengthOfDoors * widthOfDoors);
		
		
        
		
		//Perform Computations
		double houseSqFT = 2*(houseLength * houseWidth) + 2*
				(houseLength*houseWidth + 0.5*(houseLength*(houseHeight-houseWidth)));
		System.out.println(houseSqFT);
		double SqftToPaint = (houseSqFT - (windowSquareFeet + doorSquareFeet));
		System.out.println(SqftToPaint);
		//Print the result
		System.out.println("The square footage is: " + houseSqFT);
		

	}

}
