package day8;

import java.util.HashMap;
import java.util.Map;

public class duplicate {

	public static void main(String[] args) {
		int a[] = { 2,7,4,5,7,4,5,7,8};
		int i=0;
		int j=i+1;
		int count=0;
		int flag=0;
		int num;
		
		
		Map<Integer,Integer>hm= new HashMap<Integer,Integer>();	
		
		
		//Print the given array of integers using for loop
		System.out.print("The integer Array: ");
		/*
		 * for(i=0;i<=a.length-1;i++) {
		 * 
		 * if(a[i]==a[j]) { hm.put(j,-1); } num=a[i]; System.out.print(num ); }
		 * System.out.println();
		 */
		//To compare the repeated numbers and increase count and print 
		for(i=0;i<a.length;i++)
		{
			
			count=1; 
			for(j=i+1;j<a.length;j++)
			{
				
			if (a[i]==a[i+1]&&a[i]!=-1)
			{
				 
				 flag=1;
				 count++;
				 hm.put(a[i+1],-1);; 			 
			} 
			}
			
		     
		      if((count>1&&flag==1) ){
		    	  System.out.println((a[i]+" occurs "+ count+ " times"));
		    	  
		    	  
		    	  }
			 
		}
		}
		}


