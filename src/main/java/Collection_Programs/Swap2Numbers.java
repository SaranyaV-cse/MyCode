package Collection_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		List al= Arrays.asList(10,20,30,40,70);

//method1
		/*
 int x=20;
 int y=30;
 
 int temp=0;
 temp=x;
 x=y;
 y=temp;
 System.out.println(x);
 System.out.println(y +"\n");*/
//method2
		/*
int arr[]= {10,30,40,50,60};
 int x=10;
 int y=30;
 x=x+y;
 y=x-y;
 x=x-y;
 System.out.println(x +" "+ y);*/
		//To check a number is even or odd
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		
	
			if(x%2==0)
		{
			System.out.println("The number is even number " +x);
		}
			else
				System.out.println("The number is odd number " +x);
	}

}
