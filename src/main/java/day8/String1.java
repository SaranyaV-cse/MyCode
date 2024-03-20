package day8;

import java.util.Scanner;

import day7.Twodarray;

public class String1 extends Twodarray {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Basic Calculator");
		String operator=null;
		int flag=1;
		double result=0;
		String s=null;
		
		
	    while(flag==1)
	    {
		System.out.println("Enter the Number1");
		double num1=sc.nextDouble();
		System.out.println("Enter the Number2");
		double num2=sc.nextDouble();
		System.out.println("Enter the Operator");
		operator= sc.next();
		double result1= calc(num1,num2,operator);
		System.out.println("Do you wish to continue");
		//Scanner sc1=new Scanner(System.in);
	    s = sc.next();
	    
	    if(s.equalsIgnoreCase("Yes"))
	    flag=1;
	    
	    else break;
	    }
	    System.out.println("Thank you");
	}	
	
	   
	public static double calc(double num1, double num2, String operator) {
		 boolean s1 = false;
		 double result = 0;
		
		// TODO Auto-generated method stub
		if(operator.equals("+"))
		{
			result = num1+num2;
			System.out.println("The addition of 2 numbers: "+result);
			
		}
		else if(operator.equals("-"))
		{
			result = num1-num2;
			System.out.println("The Subtraction of 2 numbers: "+result);
			
		}
		else if(operator.equals("*"))
		{
			result = num1*num2;
			System.out.println("The Multiplication of 2 numbers: "+result);
			
		}
		else if(operator.equals("/"))
		{
			result = num1/num2;
			System.out.println("The Division of 2 numbers: "+result);
			
		}
		else
			System.out.println("Invalid Operator");
		return result;
		
	    
   }
	
}

