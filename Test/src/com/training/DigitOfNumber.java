package com.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DigitOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer Number::");
		int number=sc.nextInt();
		System.out.println("You have intered::"+number);
		ArrayList<Integer> listDigits = new ArrayList<Integer>();
		HashMap<Integer,Integer> mapDigits = new HashMap<Integer,Integer>();
		int noOfDigits = 0;
		int remainder = 0;
		while(number!=0) {
			remainder = number%10;
			number = number/10;
			listDigits.add(noOfDigits, remainder);
			mapDigits.put(noOfDigits, remainder);
			noOfDigits++;
			
		}
		System.out.println("No of digits in the Number::"+noOfDigits);
		System.out.println("Array Place of Digits::"+listDigits.toString());
		System.out.println("Map Place of Digits::"+mapDigits.toString());
	}

}
