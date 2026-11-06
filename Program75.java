package com.tap.programming;
class Employee{
	private int id;
	private String name;
	private String addres;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		id = 1;
		name = "sathish";
		addres = "anantapur";
	}
	public Employee(int id) {
		this();
		id = 3;
	}
	
	public Employee(int id,String name)
	{
		this();
		id = 2;
		name = "surya";
	}

	public Employee(int id, String name, String addres) {
		this(id,name);
		this.id = id;
		this.name = name;
		this.addres = addres;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	
	
}
public class Program75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(5,"varun,","thopudurthi");
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getAddres());
	}

}
