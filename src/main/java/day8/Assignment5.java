package day8;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a program to input electricity unit charges and calculate total electricity bill
		/*
		 * For first 0 - 50 units Rs. 0.50/unit
		 * 
		 * For 51-100 units Rs. 0.75/unit
		 * 
		 * For 101- 150 units Rs. 1.20/unit
		 * 
		 * For unit above 150 Rs. 1.50/unit
		 * 
		 * Input : Electricity units consumed - 86 Bill - 64.5
		 */
	    int units=0 ;
		double price=0;
		int flag=0;
		System.out.println("Electicity units consumed: ");
		Scanner sc1=new Scanner(System.in);
		int electunits=sc1.nextInt();
		
		if(electunits>0 &&electunits<=50)
		{
			price=electunits*0.50;
			flag=1;
		}
		else if(electunits>=51 &&electunits<=100)
		{
			price=electunits*0.75;
			flag=1;
		}
		else if(electunits>=101 &&electunits<=150)
		{
			price=electunits*1.20;
			flag=1;
		}
		else if(electunits>150)
		{
			price=electunits*1.50;
			flag=1;
				
		}
		
		else
			System.out.println("Invalid unit");
		if(flag==1)
		{
			System.out.println("Bill for "+electunits+" units  Rs."+price);
		}
		
		}

}
