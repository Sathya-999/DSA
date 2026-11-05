package com.tap.programming;
class Charger{
	private int capaccity;
	private String name;
	
	public Charger() {
		// TODO Auto-generated constructor stub
	}
	public Charger(int capaccity, String name) {
		super();
		this.capaccity = capaccity;
		this.name = name;
	}
	public int getCapaccity() {
		return capaccity;
	}
	public void setCapaccity(int capaccity) {
		this.capaccity = capaccity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Os{
	private float capacity;
	private String name;
	public Os() {
		// TODO Auto-generated constructor stub
	}
	public Os(float capacity, String name) {
		super();
		this.capacity = capacity;
		this.name = name;
	}
	public float getCapacity() {
		return capacity;
	}
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Mobile{
//	Creating the tight coupling
	Os O1 = new Os(12.3f,"ANDROID");
	public void ref(Charger c1) {
//
		System.out.println(c1.getName());
		System.out.println(c1.getCapaccity());
	}
}
public class Program79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charger c1 = new Charger(12,"SAMSUNG");
		Mobile m1 = new Mobile();
		System.out.println(m1.O1.getName());
		System.out.println(m1.O1.getCapacity());
		m1.ref(c1);
	}

}
