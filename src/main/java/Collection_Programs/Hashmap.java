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

public class Hashmap {

	public Hashmap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
	
		int EmpId=0;
	Map<EmployeeDetails,Integer> map= new LinkedHashMap<EmployeeDetails,Integer>();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number of Employees");
	int noofemp= sc.nextInt();
	
	for( int i=0;i<noofemp;i++)
	{
	
	
	System.out.println("Enter the Employee: "+(i+1));
	System.out.println("Enter the Employee Name: ");
	String EmpName=sc.next();
	System.out.println("Enter the Employee Id: ");
	EmpId=sc.nextInt();
	System.out.println("Enter the Salary: ");
	double salary= sc.nextDouble();
	System.out.println("Enter the Location: ");
	String location=sc.next();
	EmployeeDetails emp= new EmployeeDetails(EmpName,EmpId,salary,location);
	
	
	map.put(emp,EmpId);
	}
	
	System.out.println("Enter ID to be Searched: "  );

	int empID= sc.nextInt();

for(int j=0;j<map.size();j++)
	
{
	if(empID==EmpId)
	{
		System.out.println(map.entrySet());
		
		
	}
}

	}
}


	
	


