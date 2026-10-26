package com.tap.programming;

public class Program13 {

    public static void main(String[] args) {

        Program12 instance = Program12.getInstance();
        Program12 instance2 = Program12.getInstance();
        if(instance == instance2) {
        	System.out.println("ref are equal..");
        }
        else {
        	System.out.println("ref are not equal!!");
        }

    }
}