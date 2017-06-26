package p3;

import p1.Employee;

public class PEmployee extends Employee {
	private  double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public PEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
		
	}

	
public	 void display()
	{
		super.display();
		System.out.println( "Salary "+salary);
	}

@Override
public void absMethod() {
	
	
}

}
