package com.javapractice;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter number 1");
    	int num1 = scanner.nextInt();
    	
    	System.out.println("Enter number 2");
    	int num2 = scanner.nextInt();
    	
//    	add2Numbers(num1, num2);
//    	multiply2Numbers(num1, num2);
//    	subtractionOf2Numbers(num1, num2);
    	modulusOf2Numbers(num1, num2);
    	
    	scanner.close();
    }
    
    
    private static void add2Numbers(int num1, int num2) {
    	long sum = num1 + num2;
    	
    	logger.info("The sum of numbers "+num1+" and "+num2+" = "+sum);
    }

	
    private static void multiply2Numbers(int num1, int num2) {
    	long prod = num1 * num2;
    	
    	logger.info("The product of numbers "+num1+" and "+num2+" = "+prod);
    }

    
    private static void subtractionOf2Numbers(int num1, int num2) {
    	long sub = num1 - num2;
    	
    	logger.info("The subtraction of numbers "+num1+" and "+num2+" = "+sub);
    }
    
    
    private static void modulusOf2Numbers(int num1, int num2) {
    	long modulus = num1 % num2;
    	
    	logger.info("The remainder of numbers "+num1+" and "+num2+" = "+modulus);
    }
}
