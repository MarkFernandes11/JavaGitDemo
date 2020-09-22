package com.javapractice;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
	private static Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean performOperation = true;
		System.out.println("My calculator");

		while (performOperation) {

			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplicaion");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();

			System.out.println("Enter number 1");
			float num1 = scanner.nextFloat();

			System.out.println("Enter number 2");
			float num2 = scanner.nextFloat();

			switch (choice) {
			case 1:
				add2Numbers(num1, num2);
				break;

			case 2:
				subtractionOf2Numbers(num1, num2);
				break;

			case 3:
				multiply2Numbers(num1, num2);
				break;

			case 4:
				divisionOf2Numbers(num1, num2);
				break;

			case 5:
				modulusOf2Numbers(num1, num2);
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
			
			scanner.nextLine();
			System.out.println("Do you want to perform another operation?");
			System.out.println("1. yes");
			System.out.println("2. no");
			
			String decision = scanner.next();
			performOperation = (decision.charAt(0) == 'Y' || decision.charAt(0) == 'y') ? true : false;
			
		}
		
		scanner.close();
	}
	

	private static void add2Numbers(float num1, float num2) {
		double sum = num1 + num2;

		logger.info("The sum of numbers " + num1 + " and " + num2 + " = " + sum);
	}
	

	private static void multiply2Numbers(float num1, float num2) {
		double prod = num1 * num2;

		logger.info("The product of numbers " + num1 + " and " + num2 + " = " + prod);
	}

	
	private static void subtractionOf2Numbers(float num1, float num2) {
		double sub = num1 - num2;

		logger.info("The subtraction of numbers " + num1 + " and " + num2 + " = " + sub);
	}

	
	private static void modulusOf2Numbers(float num1, float num2) {
		try {
			float modulus = num1 % num2;

			logger.info("The remainder of numbers " + num1 + " and " + num2 + " = " + modulus);
		} catch (Exception e) {
			logger.info("Exception has occured : " + e.getMessage());
		}

	}

	
	private static void divisionOf2Numbers(float num1, float num2) {
		try {
			float division = num1 / num2;

			logger.info("The division of numbers " + num1 + " and " + num2 + " = " + division);
		} catch (Exception e) {
			logger.info("Exception has occured : " + e.getMessage());
		}

	}

}
