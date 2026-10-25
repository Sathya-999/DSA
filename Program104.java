package com.tap.programming;

import java.util.Scanner;

public class Program104 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int res = findRMSB(n);
		System.out.println(res);
	}
//	Creating the Helping Method
	public static int findRMSB(int n) {
		int mask = 1;
		int pos = 0 ;
		if((n & mask) == 0) {
			mask = mask << 1;
			pos++;
		}
		return pos+1;
	}
}
