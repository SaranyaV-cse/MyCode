package day8;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to read a weekday number between 1-7 and print weekday name using switch statement Input: 1 Output: Monday Input : 7 Output: Sunday
		System.out.println("Enter the weekday: ");
		Scanner sc1=new Scanner(System.in);
		int weekday=sc1.nextInt();
		switch(weekday)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid weekday "+weekday);
			break;
			
			
			
		}
	
	}

}
