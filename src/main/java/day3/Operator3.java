package day3;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Relational Operator
		//>,<,>=,<=,!=,==
int a=10;
int b=5;
int c=8;
if((a>b)&& (a>c))
{
	System.out.println("a is greater ");
	
}else if(b>c)
{

	System.out.println("b is greater");
}
else
	System.out.println("c is greatest");
	
String s="apple";
String t="apple ";
	int marks=101;
	if(marks<35)
	{
		System.out.println("Fail");
	}
	else if(marks>=35 && marks<50)
	{
		System.out.println("E Grade");
	}else if(marks>=50 && marks<60)
	{
		System.out.println("D Grade");
		
	}
	else if(marks>=61&&marks<70)
	{
		System.out.println("C Grade");
	}
	else if(marks>=71&&marks<80)
	{
		System.out.println("B Grade");
	}
	else if(marks>=81&&marks<90)
	{
		System.out.println("A Grade");
	}
	else if(marks>=91&&marks<100)
	{
		System.out.println("A1 Grade");
	}
	else if (marks==100)
	{
		System.out.println("Excellent !! Topper");
	}
	else
		System.out.println(s==t);
	
}
}

