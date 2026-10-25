package com.tap.programming;

public class Program103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bitwise Masking ok 
		int a = 45;
		int i = 4;
		int OffMask = ~(1<<i);
		System.out.println(a & OffMask);
		int OnMask = 1<<i;
		System.out.println( a | OnMask);
//		Checking toggling
		System.out.println(a ^ OnMask);
//		checking the final one wheather a bit is on or off
		System.out.println(a & OffMask);
	}

}
