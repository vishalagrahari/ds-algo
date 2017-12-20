package com.training;

public class ExceptionHandling {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hi");
			int c = 10/0;
			System.out.println("Result"+c);
			return;
		} catch(Exception e){
			System.out.println("Inside catch");
			throw e;
			//return;
		} finally {
			System.out.println("Inside finally");
			return;
		}
	}

}
