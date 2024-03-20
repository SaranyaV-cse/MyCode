package day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import studentPackageSys.Student;

public class MainStudentNew {

static String fName;
static String lName;
static int id;
static String emailId;
static String []courses;
static ArrayList<Object> student= new ArrayList<Object>();
 static int studentId;
	public static void main(String[] args) {
		
System.out.println("Enter the number of Students");
Scanner sc=new Scanner(System.in);
int noofStudents=sc.nextInt();

int noofcourse;
int studentId;

//StudentNew sn=new StudentNew("Saranya","v",100,"saranyav.gmail.com","{BE,BSC}");
for(int i=0;i<noofStudents;i++)
{
	
	System.out.println("Student: "+(i+1));
	System.out.println("Enter the first Name: ");
	student.add(sc.next());
	
    System.out.println("Enter the last Name: ");
	student.add(sc.next());
	System.out.println("Enter the id: ");
	student.add(sc.nextInt());
	System.out.println("Enter the Email id: ");
	student.add(sc.next());
	System.out.println("Enter the Number of Courses: ");
	noofcourse=sc.nextInt();
	
	for(int j=1;j<=noofcourse;j++)
	{
		System.out.println("Enter the Course: "+j);
		student.add(sc.next());
	}
	}
System.out.println("Student size"+student.size());
System.out.println("Enter the ID to search");
studentId=sc.nextInt();

studentDetails(student);

	
	}
	
	public static void studentDetails(ArrayList<Object> student) {
		ArrayList s= new ArrayList(student);
		MainStudentNew ms=new MainStudentNew();
		Iterator iter=s.iterator();
		while(iter.hasNext())
		{
		 iter.next().equals(studentId);
					{
				System.out.println("Student found: ");
			
					
			System.out.println("Student First Name: "+fName);
			System.out.println("Student Last Name: "+lName);
			System.out.println("Student Email Id: "+emailId);
			System.out.println("Student id: "+id);
			//System.out.println("Student course: "+course[]);
			
		}
		}
		
	}
}
	




