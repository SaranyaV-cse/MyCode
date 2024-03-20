package day5;

import java.util.Scanner;

public class Primenumbers_orNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Enter the number to verify:");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int k=num/2;
int flag=0;
if(num==0||num==1)
{
	System.out.println("The number you entered is not a Prime number:"+num );
}
//int sum=0;double avg=0;

else
{
for (int i=2;i<=k;i++)
{
	if(num%i==0){      
	System.out.println( num+" is not a prime number"); 
	flag=1;
    break;	
     }
}
	//maximum divisible count=2;
	if (flag==0)
	{
     System.out.println(num +"is a prime number");
   
	}
	


}
}
}


