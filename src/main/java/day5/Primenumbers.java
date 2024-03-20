package day5;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100,i,j;
//To Print the Prime numbers from 1 to 10
int sum=0;double avg=0;
for (i=1;i<=a;i++)
{
	
	int count=0;

	for(j=1;j<=i;j++)
	{
	if(i%j==0)
	{
	count++;

	//System.out.println(count);
     }
	}
	//maximum divisible count=2;
	if (count==2)
	{
     System.out.println("Prime numbers are:"+i);
   //To find the sum of Prime numbers
     sum= i+sum;
     //To find the average of Primenumbers
     avg=sum/2;
	}
	



}
System.out.println("Sum of Prime numbers:"+sum);
System.out.println("Average of Prime numbers:"+avg);
}
}

