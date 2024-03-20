package day8;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		// The number that searches for a specific element in an integer array.
int flag=0;
int arr1[]= {-101,234,500,-346,-475,002,-54,90,-182,-7,62,-33,-500,234};
System.out.println("Enter the number to search: ");
Scanner sc1=new Scanner(System.in);
int num=sc1.nextInt();

for(int x:arr1)
{
	if(x==num)
	{
		flag=1;
	}
	
}
if(flag==1)
{
	System.out.println("The number "+num+" is found");
}
else
	System.out.println("The number "+num+" not found in the list");
	}

}
