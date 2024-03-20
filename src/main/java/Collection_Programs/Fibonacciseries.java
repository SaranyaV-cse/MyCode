package Collection_Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Fibonacciseries {

	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		 Scanner sc=new Scanner(System.in);
		//int x= sc.nextInt();
		int k=0;
		
		LinkedHashMap<Integer,Integer> hm= new LinkedHashMap<Integer,Integer>();
		int i=0;
		int j=1;
			for(int l=1;l<20;l++)
			{
			
				
				
				k=i+j;
				
		     hm.put(i,k );
		     
		     i=j;
		     j=k;
		     //k=i;
			
			}
			System.out.println(hm.values());	
			}	
       
	
		
}
