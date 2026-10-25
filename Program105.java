package com.tap.programming;

public class Program105 {
	public static void main(String[] args) {
		int ar [] = {10,20,30,40,50,60};
		int key = 60;
		int res = secondLargestElement(ar);
		System.out.println(res);
	}
//	Creating the Helper Method 
	public static int linearSearch(int [] ar,int key) {
		for(int i = 0;i<ar.length;i++) {
			if(ar[i] == key) {
				return ar[i];
			}
		}
		return -1;
		
	}
//	Creating the Helper Method
	public static int spanOfArray(int ar[]) {
		int max = ar[0];
		int min = ar[0];
//		Sub Method of finding the maximum value
		for(int i = 1 ;i<ar.length;i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
//		sub method of finding the minimum value
		for(int i = 1;i<ar.length;i++) {
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		int res = max - min;
		return res;
	}
//	finding the largest and second leargest element 
	public static int secondLargestElement(int ar []) {
		int max1;
		int max2;
		if(ar[0] > ar[1]) {
			 max1 = ar[0];
			 max2 = ar[1];
		}else {
			max2 = ar[0];
			max1 = ar[1];
		}
		for(int i = 2;i<ar.length;i++) {
			if(ar[i]>max1) {
				max2 = max1;
				max1 = ar[i];
			}else if(ar[i] > max2 && ar[i] != max1) {
				max2 = ar[i];
			}
		}
		return max2;
	}
}
