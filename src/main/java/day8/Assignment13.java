package day8;

import java.util.HashMap;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello,World.";
		int count=0;
		char[] ch=str.toCharArray();
		int flag=0;
		HashMap<Integer,Character> m= new HashMap<Integer,Character>();
		for(int i=0;i<ch.length;i++)
		{
		if((ch[i]>11&&ch[i]<65))
		{
			flag=1;
			m.put(count+1,ch[i]);
			count++;
		}
		
		}
		if(flag==1)
		{
	      System.out.println("The number of words in a string is " + m.size());
		}
	}
}
		
	
		
			

	

