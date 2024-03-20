package day8;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the 1st number: ");
Scanner sc1=new Scanner(System.in);
int firstnum=sc1.nextInt();//25
System.out.println("Enter the 2nd number: ");
Scanner sc2=new Scanner(System.in);
int secondnum=sc2.nextInt();//78
System.out.println("Enter the 3rd number: ");
Scanner sc3=new Scanner(System.in);
int thirdnum=sc3.nextInt();//87

if((firstnum>secondnum)&&(firstnum>thirdnum))
{
	
		System.out.println("Firstnumber "+firstnum+" is greatest number");
}
else if(secondnum>thirdnum)
{
		System.out.println("Second number "+secondnum+" is greatest number");
	
}else 
{
	System.out.println("Thirdnumber "+thirdnum+" is greatest number");
}

}
}

