package day8;

public class Assignment10 {

	public static void main(String[] args) {
		// program that takes an integer array as input and find the duplicates in the array.
int a[] = { 2,3,4,5,2,4,5,7,8};
int i;
int j;
int count=0;
int flag=0;
int num;
//Print the given array of integers using for loop
System.out.print("The integer Array: ");
for(i=0;i<=a.length-1;i++)
{
num=a[i];
System.out.print(num );
}
System.out.println();
//To compare the repeated numbers and increase count and print 
for(i=0;i<a.length;i++)
{
	
	count=1; 
	for(j=i+1;j<a.length;j++)
	{
		
	if (a[i]==a[j]&&a[i]!=-1)
	{
		 
		 flag=1;
		 count++;
		 a[j]=-1; 			 
	} 
	}
	
     
      if((count>1&&flag==1) ){
    	  System.out.println((a[i]+" occurs "+ count+ " times"));
    	  
    	  
    	  }
	 
}
}
}


