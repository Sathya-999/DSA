package com.tap.programming;

import java.util.Scanner;

public class Program42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want : ");
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i = 0;i<ar.length;i++) {
			ar[i] = scan.nextInt();
		}
		int res  = bitonicSearch(ar);
		System.out.println("The bitonic element is present "+res );
	}
//	bitonic search array
	public static int bitonicSearch(int ar[]) {

	    int low = 1;
	    int high = ar.length -2;

	    while (low <= high) {

	        int mid = (low + high) / 2;

	        if (ar[mid] > ar[mid - 1] && ar[mid] > ar[mid + 1]) {
	            return ar[mid];
	        }
	        else if (ar[mid] > ar[mid - 1] && ar[mid] < ar[mid + 1]) {
	            high = mid +1 ;
	        }
	        else {
	            low = mid -1  ;
	        }
	    }

	    return -1;
	}

}
