package com.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort bSort = new BubbleSort();
		int unsortedList[] = new int[] {5,1,12,-5,16};
		bSort.bubbleSort(unsortedList);
		
		unsortedList = new int[]{4, 2, 9, 6, 23, 12, 34, 0, 1};
		bSort.bubbleSort(unsortedList);
		
		unsortedList = new int[]{100, 78, 89, 6, 0, 1, 340, 0, -5};
		bSort.bubbleSort(unsortedList);
	}
	
	public void bubbleSort(int unsortedList[]) {
		System.out.println("Unsorted Array::"+Arrays.toString(unsortedList));
		int arraySize = unsortedList.length;
		int counter = 0;
		for(int i=0;i<arraySize;i++) {
			for(int j=i+1;j<arraySize;j++) {
				if(unsortedList[i]>unsortedList[j]) {
					int temp = unsortedList[i];
					unsortedList[i]=unsortedList[j];
					unsortedList[j] = temp;
				}
				counter++;
				System.out.println("Array after Iteration number "+counter+":: "+Arrays.toString(unsortedList));
			}
			
		}
		System.out.println("Final Sorted Array::"+Arrays.toString(unsortedList));
		
	}

}
