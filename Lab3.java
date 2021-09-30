/*------------------------------------------------------------------------- 
// AUTHOR: Augustus Crosby
// FILENAME: Lab3.java
// SPECIFICATION: Pass/fail lab.
// FOR: CSE 110- Lab #3
// TIME SPENT: less than an hour 
 * //-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab3 {
	
	public static void main(String[] args) {
		
		// declaring variables:
		double finalexamGrade = 50.0;
		double midtermGrade = 50.0;
		double homeworkGrade = 0.0;
		double finalGrade = 0.0;
		
		// a character called letterGrade
		char letterGrade = ' ';
		
		// a variable scan of type Scanner 
		Scanner in = new Scanner(System.in);
		
		//Ask for homeworkGrade
		System.out.println("Enter homework grade: ");
		homeworkGrade = in.nextDouble();
		System.out.println("Enter midterm grade: ");
		midtermGrade = in.nextDouble();
		System.out.println("Enter final exam grade:");
		finalexamGrade = in.nextDouble();
		
		//Validate inputs
		if(homeworkGrade >= 0 && homeworkGrade <= 100 && midtermGrade >= 0 && midtermGrade <= 100 && finalexamGrade >= 0 && finalexamGrade <= 200) {
			finalGrade = ((finalexamGrade/200)*50)+(midtermGrade/100*25)+(homeworkGrade/100*25);
			//Check grade
			if(finalGrade >= 50) {
				letterGrade = 'P';
			} else {
				letterGrade = 'F';
			} 
			System.out.println("The letter grade is "+letterGrade);
		} else {
			System.out.println("One or more inputs are invalid. Please check that homework and midterm grades are between 0 and 100 and that the final is between 0 and 200");
		} //end of else statement
		
	}//end of main
}//end of class
