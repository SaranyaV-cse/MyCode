package day3;

import java.util.Scanner;

public class Operators_conditional_stmt_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double age;
		String degree;
		double marks_Percentage;
		String offer;
		
		System.out.println("Please Enter your Age?");
		Scanner sc1=new Scanner(System.in);
		age= sc1.nextDouble();
		
		if(age<21)
		{
			System.out.println("Sorry, minimum age to apply for Interview is 21.");
		}
		else if(age>=21)
		{
		System.out.println("Please Enter your Degree");
		Scanner sc3=new Scanner(System.in);
		degree= sc3.next();
		if(degree.equalsIgnoreCase("BTech")||degree.equalsIgnoreCase("BE"))
		{
		System.out.println("Please Enter your Percentage of Marks?");
		Scanner sc2=new Scanner(System.in);
		marks_Percentage= sc2.nextDouble();
		
		if(marks_Percentage>70)
		{
			System.out.println("Do you hold an offer?");
			Scanner sc4=new Scanner(System.in);
			offer=sc4.next();
			if(offer.equals("yes"))
			{
				System.out.println("\"You are on hold. We have received your offer.\"");
			}
			else
				if(offer.equals("no"))
				{
					System.out.println("\"Congratulations! You are selected for an interview.\"");
				}
			
		}
		else if(marks_Percentage<70)
		{
			System.out.println("\"Sorry, your percentage is below 70%. Application rejected.\"");
		}
		
		
	}
		else if(!(degree.equalsIgnoreCase("BTech")||degree.equalsIgnoreCase("BE")))
		{
			System.out.println("\"Sorry, we only accept BTech graduates.\"");
		}

}
	}
}
