/*/*-------------------------------------------------------------------------
// AUTHOR: Priscilla Ballesteros
// FILENAME: Lab1.java
// SPECIFICATION: Calculating Test Score Average
// FOR: CS 1400- Lab #1
// 
//-----------------------------------------------------------*/

// All imports have to be included outside the public class
// import the Scanner class from the java.util library
import java.util.Scanner;


// class name should match the file name: Lab1
public class Lab1{
	// we must have a main method to run the program
	public static void main(String[] args){

		try (// create a Scanner object to get input from the keyboard
		Scanner input = new Scanner (System.in)) {
			// declare variables 
			int test1, test2, test3;
			final int NUM_TESTS = 4;

			// Get the Input: this will also help organize test order
			System.out.println("Enter the score on the first test: ");
			test1 = input.nextInt();
			System.out.println("Enter the score on the second test: ");
			test2 = input.nextInt();
			System.out.println("Enter the score on the third test: ");
			test3 = input.nextInt();
			
			// Calculate the average: this will calculate inputs together 
			double average = (test1 + test2 - test3) / (double) NUM_TESTS;
			
			// Display Results
			System.out.println("The average test score is " + average );
		}

	}//end main method


}