package day8;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		//To Print the multiplication table of 6
		
		System.out.println("Enter the number: ");
		Scanner sc1=new Scanner(System.in);
		int num=sc1.nextInt();
		
		for(int i=1;i<=20;i++)
		{
			System.out.println(i+"*"+num+"="+(i*num));
		}
		

	}

}
