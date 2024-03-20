package day4;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// that takes a string as input and prints its reverse
int b=10;
int flag=0;
char ori;
String rev = "";

System.out.println("Enter the String: ");
Scanner sc1=new Scanner(System.in);

String original=sc1.next();
//int originaldata=original.length;


  for(int i=0;i<=original.length()-1;i++) 
  { System.out.print(original.charAt(i));
  }
 

 
System.out.println();
for(int j=original.length()-1;j>=0;j--)
{

System.out.print(original.charAt(j));
}

	
}
}
