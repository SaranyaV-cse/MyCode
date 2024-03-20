package Collection_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ListofList_eg {

	public ListofList_eg() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
	
	List<EmployeeDetails> m1= new ArrayList<EmployeeDetails>();
	Map<List<EmployeeDetails>,Integer> map= new LinkedHashMap<List<EmployeeDetails>,Integer>();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number of Employees");
	int noofemp= sc.nextInt();
	
	for( int i=0;i<noofemp;i++)
	{
	
	
	System.out.println("Enter the Employee: "+(i+1));
	System.out.println("Enter the Employee Name: ");
	String EmpName=sc.next();
	System.out.println("Enter the Employee Id: ");
	int EmpId=sc.nextInt();
	System.out.println("Enter the Salary: ");
	double salary= sc.nextDouble();
	System.out.println("Enter the Location: ");
	String location=sc.next();
	EmployeeDetails emp= new EmployeeDetails(EmpName,EmpId,salary,location);
	
	m1.add(emp);
	map.put(m1,EmpId);
	}
	
	System.out.println("Enter ID to be Searched: "  );

	int empID= sc.nextInt();

for(int j=0;j<map.size();j++)
	
{
	if(empID==(m1.get(j).getEmployeeId()))
	{
		System.out.println(m1.get(j).getEmployeeName());
		System.out.println(m1.get(j).getEmployeeId());
		System.out.println(m1.get(j).getLocation());
		System.out.println(m1.get(j).getSalary());
	}
}

	}
}


	/*for(EmployeeDetails e :m1)
	{
		if( e.getEmployeeId()==empID)
		{
		System.out.println(e.getEmployeeName());
		System.out.println(e.getEmployeeId());
		System.out.println(e.getSalary());
		System.out.println(e.getLocation());
	}
	*/
	
	
	
	
	/*
 * Iterator iter= m1.iterator(); while(iter.hasNext()) { Object t=iter.next();
 * System.out.println(t.); }
 */

	


