package calcMyGPA;
import java.util.Scanner;
import java.text.DecimalFormat;
public class CalcMyGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		String courseInfo;
		
		
		System.out.println("Enter total # of courses: ");
		double Courses = in.nextDouble();
		
		
		double totHours = 0;
		double totPoints = 0;
		for(int c=1; c<=Courses; c++) {
		
			double gradePoints = 0;
			
			
			System.out.println("Enter course information separated by commas (title,credit hours,letter grade) or type Q to quit");
			courseInfo = in.next();
			
			if (courseInfo.equals("Q")) {
				System.out.println("You Quit");
				break;
			}
			
			String array1[] = courseInfo.split(",");
			String title = array1[0].trim();
			String credHours = array1[1].trim();
			double numCredHours = Integer.parseInt(credHours);
			String letter = array1[2].trim();
			totHours += numCredHours;
			
			System.out.println("Course Title: " + title);
			System.out.println("Credit Hours: " + numCredHours);
			System.out.println("Letter Grade: " + letter);
		
			
			if (letter.equals("A")) {
				gradePoints = numCredHours * 4.00;
				totPoints += gradePoints;
			}
			else if (letter.equals("A-")) {
				gradePoints = numCredHours * 3.70;
				totPoints += gradePoints;
			}
			else if (letter.equals("B+")) {
				gradePoints = numCredHours * 3.33;
				totPoints += gradePoints;
			}
			else if (letter.equals("B")) {
				gradePoints = numCredHours * 3.00;
				totPoints += gradePoints;
			}
			else if (letter.equals("B-")) {
				gradePoints = numCredHours * 2.70;
				totPoints += gradePoints;
			}
			else if (letter.equals("C+")) {
				gradePoints = numCredHours * 2.30;
				totPoints += gradePoints;
			}
			else if (letter.equals("C")) {
				gradePoints = numCredHours * 2.00;
				totPoints += gradePoints;
			}
			else if (letter.equals("C-")) {
				gradePoints = numCredHours * 1.70;
				totPoints += gradePoints;
			}
			else if (letter.equals("D+")) {
				gradePoints = numCredHours * 1.30;
				totPoints += gradePoints;
			}
			else if (letter.equals("D")) {
				gradePoints = numCredHours * 1.00;
				totPoints += gradePoints;
			}
			else if (letter.equals("D-")) {
				gradePoints = numCredHours * 0.70;
				totPoints += gradePoints;
			}
			else if (letter.equals("WF") || letter.equals("F")) {
				gradePoints = numCredHours * 0;
				totPoints += gradePoints;
			}
			else {
				gradePoints = 0;
			}
			System.out.println(" ");
			System.out.println("Total Grade Points: " + totPoints);
			System.out.println("Total Credit Hours: " + totHours);
			System.out.println("");
			
		}
		double gpa = (totPoints / totHours);
		System.out.println("Your GPA is " + df.format(gpa));
		
		
		
		
		

	}

}
