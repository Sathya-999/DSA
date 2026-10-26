package com.tap.programming;

import java.util.Scanner;
class Bolerao{
	String name;
	float cost;
}
public class Program70 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bolerao[] b1 = new Bolerao[3];
		for(int i = 0;i<b1.length;i++) {
//			Object 0	
			b1[i] = new Bolerao();
			System.out.println(b1[i].name);;
			System.out.println(b1[i].cost);;
		}
		

		
	}
}
