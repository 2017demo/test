package p2;
import p1.Employee;
import p3.PEmployee;
import p5.IAttn;
import p6.Student;


public class Test {

	public static void main(String[] args) {
		PEmployee.showCompany();
		// TODO Auto-generated method stub
			Employee e;
		//	e=new Employee(100, "AA");
			//e.display();
			//System.out.println(e.getName());
		//	e.setName("BB");
			//System.out.println(e.getName());
			
			PEmployee p;
			
			p=new PEmployee(300, "CCC", 5000.50);
		//	p.display();
			//System.out.println(p.getSalary());
			
			// public private  default  protected  =   default+child
			//  static
			 //final
				// class
				// method
				// member 
				// local var
			
			Employee ee=new PEmployee(200, "DDD", 9000);
			
			ee.display();
			ee.markAttn();
			
			// downcast
			PEmployee t=(PEmployee)ee;
			
			System.out.println(t.getSalary());
			
			
	//	Employee ee10=new Employee(100,"kkkk");
			
			Student s=new Student();
			
			s.markAttn();
			
			
			IAttn at=new PEmployee(800, "lll", 999);
			
			at.markAttn();
			
			
			
	}

}
