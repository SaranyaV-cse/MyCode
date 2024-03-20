package day6;

import java.util.Scanner;

public class Array_Assignment {

public static void main(String[] args) {

//Program to find the value entered from a list of int array
int arrdata[]= {200,160,326,85,40,300,326,120,299,25,88,3688};

int flag=0;
System.out.println("Enter the number to be searched");
Scanner sc1=new Scanner(System.in);
int Numtosearch=sc1.nextInt();
for(int x:arrdata )
{
	if(Numtosearch==x)
	{
	
		flag=1;
    }
	else
	{
	x++;
	
	
	
	}


}
if(flag==1)
{
System.out.println("Search Value found:"+Numtosearch);
}
else

System.out.println("Value not found:"+Numtosearch);

	
}
	
}

