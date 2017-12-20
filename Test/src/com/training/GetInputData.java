package com.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Difference between Scanner and BufferedReader class 1. Scanner is a much more
 * powerful utility than BufferedReader. It can parse the user input and read
 * int, short, byte, float, long and double apart from String. On the other hand
 * BufferedReader can only read String in Java. 2. BuffredReader has
 * significantly large buffer (8KB) than Scanner (1KB). 3. BufferedReader is
 * older than Scanner. It's present in Java from JDK 1.1 onward but Scanner is
 * only introduced in JDK 1.5 release. 4. Scanner uses regular expression to
 * read and parse text input. while BufferedReader can only read and store
 * String using readLine() method. 5. BufferedReader is synchronized while
 * Scanner is not. This synchronization also makes BufferedReader little bit
 * slower in single thread environment as compared to Scanner, but the speed
 * difference is compensated by Scanner's use of regex, which eventually makes
 * BufferedReader faster for reading String.
 * 
 * @author Vishal
 *
 */

public class GetInputData {
	public static void main(String args[]) throws NumberFormatException, IOException {
		GetInputData testInput = new GetInputData();
		// testInput.testScanner();
		testInput.testBufferedReader();
	}

	public void testScanner() {
		int num;
		float fnum;
		String str;

		Scanner in = new Scanner(System.in);

		// Get input String
		System.out.println("Enter a string: ");
		str = in.nextLine();
		System.out.println("Input String is: " + str);

		// Get input Integer
		System.out.println("Enter an integer: ");
		num = in.nextInt();
		System.out.println("Input Integer is: " + num);

		// Get input float number
		System.out.println("Enter a float number: ");
		fnum = in.nextFloat();
		System.out.println("Input Float number is: " + fnum);
	}

	public void testBufferedReader() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter a String");
		String b = br.readLine();
		System.out.printf("You have entered:- " + a + " and name as " + b);
	}
}
