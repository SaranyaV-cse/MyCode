package day8;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// a Java program that uses a do-while loop to calculate the sum of the first 10 natural numbers.

//int i=10;
int sum=0;
System.out.println("Enter the natural number: ");
Scanner sc1=new Scanner(System.in);
int i=sc1.nextInt();//10

		do {
			//System.out.println("The natural number starts from 1: ");
			if (i==0)
			{
			System.out.println("The number "+i+" is not a natural number");
			break;
			}
			else
			{
			sum=sum+i; 
			
			i--;
			}
		 }while(i>=1);
		System.out.println(" The sum of natural numbers: " +sum);
		
		
		
	}

}
