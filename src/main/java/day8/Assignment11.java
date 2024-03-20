package day8;

public class Assignment11 {

	public static void main(String[] args) {
		// Count and print the number of uppercase letters, lowercase letters, digits, and special characters (non-alphanumeric) present in the char array.
		char[] arr = {'H', 'e', 'l', 'l', 'o', '1', ' ', 'W', 'o', 'r', 'l', 'd', '!', '@', '#'};
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		char b = 0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i] >=65 &&arr[i]<=90)
			{
			count1++;
				
			}
			else if(arr[i]>= 97&& arr[i]<= 122)
			{
			count2++;
			//System.out.println(arr[i]);
				
			}
			else if(arr[i]>= 48&& arr[i]<= 57)
			{
				count3++;
			}
			else if(arr[i]>= 32&& arr[i]<= 40)
			{
				count4++;
			}
		}
		
		if(count1>0)
		{
			System.out.print("Uppercase letter: "+count1);
		}
		if(count2>0)
		{
			System.out.print(" Lowercase letter: "+count2);
		}
		if(count3>0)
		{
			System.out.print(" The digits are: "+count3);
		}
		if(count4>0)
		{
			System.out.print(" The Special characters are: "+count4);
		}
		}
}	
	
