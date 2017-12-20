package com.training;

import java.util.Arrays;
import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args) {
		
		String unitList[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String teenList[] = {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
		String TenList[] = {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer Number upto 5 digits :: ");
		int number=sc.nextInt();
		if(number==0) {
			System.out.println("Number In Words is :: "+"Zero");
			return;
		}
		int noOfDigits = 1;
		int remainder = 0;
		//ArrayList<Integer> listDigits = new ArrayList<Integer>();
		int listDigits[] = new int[6];
		String numberInWords = "";
		while(number!=0) {
			remainder = number%10;
			number = number/10;
			listDigits[noOfDigits] = remainder;
			//listDigits.add(noOfDigits, remainder);
			noOfDigits++;
		}
		System.out.println("Array Place of Digits::"+Arrays.toString(listDigits));
		for(int i=listDigits.length;i>=0;i--) {
			if(i==5 && listDigits[4]==0 && listDigits[5]!=0) {
				numberInWords = numberInWords + TenList[listDigits[i]] + " Thousand ";
			}else if(i==5 && listDigits[4]!=0 && listDigits[5]<2 && listDigits[5]!=0) {
				numberInWords = numberInWords + teenList[listDigits[4]] + " Thousand ";
			}else if(i==5 && listDigits[4]!=0 && listDigits[5]>=2) {
				numberInWords = numberInWords + TenList[listDigits[5]] + unitList[listDigits[4]] + " Thousand ";
			}else if(i==4 && listDigits.length==4 && listDigits[4]!=0) {
				numberInWords = numberInWords + unitList[listDigits[i]] + " Thousand ";
			} else if(i==3 && listDigits[i]!=0) {
				numberInWords = numberInWords + unitList[listDigits[i]] + " Hundred ";
			} else if(i==2 && listDigits[i]!=0 && listDigits[1]==0) {
				numberInWords = numberInWords + TenList[listDigits[i]];
			} else if(i==2 && listDigits[2]!=0 && listDigits[1]!=0 && listDigits[2]<2) {
				numberInWords = numberInWords + teenList[listDigits[2]];
			} else if(i==2 && listDigits[2]!=0 && listDigits[1]!=0 && listDigits[2]>=2) {
				numberInWords = numberInWords + TenList[listDigits[2]] + unitList[listDigits[1]];
			} else if(i==1 && listDigits[2]==0) {
				numberInWords = numberInWords + unitList[listDigits[1]];
			}
		}
		
		System.out.println("Number In Words is::"+numberInWords);
	}

}
