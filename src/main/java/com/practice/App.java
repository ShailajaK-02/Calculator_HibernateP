package com.practice;

import java.util.Scanner;

import com.practice.Calculator.Calculator;
import com.practice.UserExist.UserExist;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//This is for practice 
    	Calculator c = new Calculator();
    	UserExist UserE = new UserExist();

    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your name : ");
    	String name = sc.next();
    	
    	boolean running = false;
    	
    	while(!running) {
    		System.out.println("Which Operation do you want to perform ? ");
    		System.out.println("1. Addition ");
    		System.out.println("2. Substraction ");
    		System.out.println("3. Multiplication ");
    		System.out.println("4. Division ");
    		System.out.println("5. Exit ");
    		
    		int choice = sc.nextInt();
    		
    		if (choice == 5) {
    	        System.out.println("Thanks for using calculator.....!");
    	        running = true;
    	        break; // or use continue; if placed differently
    	    }
    		
    		System.out.println("Enter first number : ");
    		double num1 = sc.nextDouble();
    		
    		System.out.println("Enter second number : ");
    		double num2 = sc.nextDouble();
    		
    		double result=0;
    		
    		switch(choice) {
    			
    		case 1 :
    			result = c.addition(num1, num2);
        		System.out.println(" Addition of two numbers is  : " + result);
    			break;
    		
    		case 2 :
    			result = c.substraction(num1, num2);
    			System.out.println("Substraction of two numbers is : " + result);
    			break;
    			
    		case 3:
    			result = c.multiplication(num1, num2);
    			System.out.println("Multiplication of two numbers is : " + result);
    			break;
    			
    		case 4:
    			result = c.division(num1, num2);
    			System.out.println("Division result is : "+ result);
    			break;
    			
//    		case 5 :
//    			System.out.println("Thanks for using calculator.....");
//    			running = true;
//    			break;
    			
    		default :
    			System.out.println("Invalid operation!!");
    		}
    		UserE.userExist(name); 
    	}
    	
    }
}
