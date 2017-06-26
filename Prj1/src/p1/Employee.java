package p1;

import p5.IAttn;

public abstract class Employee implements IAttn {

	private int id;
	private String name;
	private static String company;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public  abstract void absMethod();
	static
	{
		company="ABC LTD";
	}
	
	public static void showCompany()
	{
		System.out.println("Company "+company);
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

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println( " Id "+id+" Name "+name);
	}
	public void markAttn()
	{
		System.out.println(" Online Attn");
	}
	
}
