package thenewpackage;

import java.util.Scanner;

public class Lab2 {

	// Start program
	//first post commit comment

	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		int myNumber = 0; //just added this to add something to commit
		Scanner scanner = new Scanner(System.in);
		Boolean shouldContinue = true;

		while (shouldContinue) {
			// Length
			System.out.println("Enter length:");
			double roomLength = scanner.nextDouble();

			// Width
			System.out.println("Enter width:");
			double roomWidth = scanner.nextDouble();

			// Area
			double roomArea = roomLength * roomWidth;
			System.out.println("Area: " + roomArea);

			// Perimeter
			double roomPerimeter = (roomLength * 2) + (roomWidth * 2);
			System.out.println("Perimeter: " + roomPerimeter);

			// Ask if program should continue
			System.out.println("Continue? (y/n):");
			String userInput = scanner.next();
			String userInputLowerCase = userInput.toLowerCase();
			if (userInputLowerCase.equals("n")) {
				shouldContinue = false; // This will interrupt the while loop, terminating the calculation
			}
		}
		scanner.close();
		System.out.println("The End");
	}
}
