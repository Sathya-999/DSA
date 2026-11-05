package com.tap.programming;

import java.util.Scanner;

class Professor {

    private String name;
    private float age;
    private long phoneNumber;

    public Professor() {

    }

    public Professor(String name, float age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}

public class Program34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter How Many Professors You Want:");
        int n = scan.nextInt();

        // clearing buffer
        scan.nextLine();

        // array creation
        Professor p1[] = new Professor[n];

        // storing objects inside array
        for (int i = 0; i < n; i++) {

            System.out.println("Enter Professor Name:");
            String name = scan.nextLine();

            System.out.println("Enter Professor Age:");
            float age = scan.nextFloat();

            System.out.println("Enter Professor Phone Number:");
            long phone = scan.nextLong();

            scan.nextLine();

            // object creation
            p1[i] = new Professor(name, age, phone);
        }

        System.out.println("\nProfessor Details:");

        // printing objects
        for (int i = 0; i < n; i++) {

            System.out.println("Professor " + (i + 1));

            System.out.println("Name : " + p1[i].getName());

            System.out.println("Age : " + p1[i].getAge());

            System.out.println("Phone : " + p1[i].getPhoneNumber());

            System.out.println();
        }

    }

}