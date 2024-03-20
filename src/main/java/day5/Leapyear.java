package day5;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("Enter the given year");
		
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		if(x%4==0)
		{
			System.out.println("The given year is a leap year: "+x);
		}
		else
			System.out.println("The given year is not a leap year "+x);
	}

}
