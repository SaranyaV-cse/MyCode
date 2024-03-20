package Collection_Programs;

import java.util.LinkedList;

public class StringSort {

	public static void main(String[] args) {
	String s="ACERBTDMOJZXY";
	char[] t=s.toCharArray();
	LinkedList ll= new LinkedList();
	for(int i=0;i<s.length();i++)
	{
	for(int j=i+1;j<s.length();j++)
	{
		if(t[i]>t[j])
		{
			char temp=s.charAt(i);
			t[i]=s.charAt(j);
			t[j]=temp;
			
		}
		
	}
	
}
	System.out.print(t);
	
	}
}
