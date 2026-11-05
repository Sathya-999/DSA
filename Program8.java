package com.tap.programming;

class Virat extends Thread{
	@Override
	public void run() {
		try {
			BowlingCoach bbc = new BowlingCoach();
			BattingCoach btc = new BattingCoach();
			bbc.setName("BowlingCoach");
			btc.setName("BattingCoach");
			bbc.setDaemon(true);
			btc.setDaemon(true);
			bbc.start();
			btc.start();
			System.out.println(Thread.currentThread().getName());
			System.out.println("Captain coming into ground...");
			Thread.sleep(3000);
			System.out.println("Captain doing warmup...");
			Thread.sleep(3000);
			System.out.println("Captain playing cricket...");
			Thread.sleep(3000);

			System.out.println("Captain going to hotel...");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class BowlingCoach extends Thread{
	@Override
	public void run() {
		try {
			for(int i=1;i<=20;i++) {
				System.out.println(Thread.currentThread().getName()+" in ground...");
				Thread.sleep(500);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class BattingCoach extends Thread{
	@Override
	public void run() {
		try {
			for(int i=1;i<=20;i++) {
				System.out.println(Thread.currentThread().getName()+" in ground...");
				Thread.sleep(500);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class Program8 {

	public static void main(String[] args) {

		Virat v1 = new Virat();
		v1.setName("Virat");

		v1.start();
	}
}