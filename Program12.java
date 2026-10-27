package com.tap.programming;

public class Program12 {
	private static Program12 obj = null;
	private  Program12() {
		System.out.println("obj created sucessfully...");
	}
	public static Program12 getInstance() {
		if(obj == null) {
			obj = new Program12();
		}
		return obj;
		
	}
}
