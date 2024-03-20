package studentPackageSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StudentMain {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Welcome to Student Program");
		System.out.println("Enter the number of Students");
		
		int noofstudents=sc.nextInt();
		int courses;
		List<Student> student=new ArrayList<Student>();
		

		
		for(int i=0;i<noofstudents;i++)
		{
				System.out.println("Student "+(i+1));
				System.out.println("Enter the firstName: ");
				String fName= sc.next();
				System.out.println("Enter the LastName: ");
				String lName= sc.next();
				System.out.println("Enter the id: ");
				int id= sc.nextInt();
				System.out.println("Enter the EmailId: ");
				String emailId= sc.next();
				System.out.println("No of Courses: ");
				courses= sc.nextInt();
				String studentCourses[]=new String[courses];
				for(int j=0;j<courses;j++)
				 {
					System.out.println("Enter the course Name:"+(j+1));
					studentCourses[j]=sc.next();
				 }
				Student stu=new Student(fName,lName,id,emailId,studentCourses);
				student.add(stu);
				 
		}
				findstudentbyId(student);
				 
	}
				
		static void findstudentbyId(List<Student> student)
		{
			System.out.println("Enter the id to search for the student: ");
			
			int searchID=sc.nextInt();
			boolean found=false;
			for(Student stu1: student)
			{				
			if(searchID==stu1.getId())
			{
				found=true;
				System.out.println("Student found: "+searchID);
			    stu1.studentDetails();
			    break;			
			}
			}
			if(found==false)
			{
				System.out.println("Student not found: "+searchID);
			}
		 }
}

			
		


	

