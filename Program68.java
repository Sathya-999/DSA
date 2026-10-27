package com.tap.programming;

import java.util.Scanner;

public class Program68 {
	public static void main(String[] args) {
//		Creating the jagged arrays
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the N value ");
		int n = scan.nextInt();
		int ar [][] = new int [n][];
		ar[0] = new int [5];
		ar[1] = new int [3];
		for(int i = 0;i<ar.length;i++) {
			for(int j = 0 ;j<ar[i].length;j++) {
				System.out.println("Class "+i+"Student "+j);
				ar[i][j] = scan.nextInt();
			}
		}
		System.out.println("The Ages Are : ");
		for(int i =0 ;i<ar.length;i++) {
			for(int j = 0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
