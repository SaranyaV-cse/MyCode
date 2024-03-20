package day13;

public class Employee2 {


	String CEO="Paul";
	
	int empId=1; //0
	
	int salary=7878; // 0
	
	String email="email@email.com"; // null
	
	String depart="testing"; //null
	
	public static void main(String[] args) {
		
		Employee2 emp1=new Employee2(100, 50000, "emp@email.com");
		
		Employee2 emp2=new Employee2(200, 60000, "emp2@email.com");
		
		Employee2 emp3=new Employee2(300, 70000, "emp3@email.com");
		
		
		System.out.println(emp1.empId);
		
		System.out.println(emp2.salary);
		
		System.out.println(emp3.email);
		
		System.out.println(emp2.depart);
		
		emp1.depart="dev";
		
		emp2.depart="qa";
		
		emp3.depart="devops";
		
		System.out.println(emp2.depart);
		
		
		
	}
	
	public Employee2(int eid,int sal,String mail)
	{
		System.out.println("Cons Called");
			empId=eid;
			salary=sal;
			email=mail;
	}
}
