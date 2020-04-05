package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoveBalls {

	public static void main(String[] args) {
		try {
	        System.out.println("Enter no of balls ");
	        Scanner scanner = new Scanner(System.in);
	        int balls = scanner.nextInt();
	        System.out.println("Total balls removed : " + removeBalls(balls));
	    } catch (InputMismatchException e) {
	        throw new InputMismatchException("wrong input.");
	    }

	}
	
	//recursive method to remove balls 
	private static int removeBalls(int b) {
	    switch (b) {
	        case 0:
	            return 0;
	        case 1:
	            return 1;
	        case 2:
	            return 2;
	        default:
	            return removeBalls(b - 1) + removeBalls(b - 2);
	    }
	}

}
