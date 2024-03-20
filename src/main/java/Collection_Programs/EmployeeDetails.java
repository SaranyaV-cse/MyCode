package Collection_Programs;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeDetails {
	private String employeeName;
	private int employeeId;
	private double salary;
	private String location;
	
	
	
	public EmployeeDetails(String employeeName,int employeeId,double salary,String location) {
		
		this.employeeName=employeeName;
		this.employeeId=employeeId;
		this.salary=salary;
		this.location=location;
		
	}

	public EmployeeDetails(List<EmployeeDetails> m2) {
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public String getLocation() {
		return location;
	}

	
}
