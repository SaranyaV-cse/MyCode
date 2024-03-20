package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class anagram {

	public static void main(String[] args) {
		String s1="icemane";
		char[] s11=s1.toCharArray();
		String s2="cinemas";
		char[] s22=s2.toCharArray();
		int count=0;
		
		HashMap<Character,Integer> hm1= new HashMap<Character,Integer>();
		HashMap<Character,Integer> hm2= new HashMap<Character,Integer>();
		
		Arrays.sort(s11);
		Arrays.sort(s22);
	 boolean Status=Arrays.equals(s11, s22);
		System.out.println(Status);
		count=1;
		  String s3[]; List<Character> lc= new ArrayList<Character>(); 
		  for(int i=0;i<=(s11.length-1);i++) 
		  { 
		    if(hm1.get(s11[i])==null) 
		     { 
		    	hm1.put(s11[i],1) ;
		    	System.out.println("hm1 :"+hm1);
		    	}
		    else
		    {
		    	hm1.put(s11[i], ++count);
		    	System.out.println("hm1++ :"+hm1);
		    }
		    
		    } 
		  for(int j=0;j<=(s22.length-1);j++) 
		  { 
		    if(hm2.get(s22[j])==null) 
		     { 
		    	hm2.put(s22[j],1) ;
		    	System.out.println("hm2: "+hm2);
		    	}
		    else
		    {
		    	hm2.put(s22[j], ++count);
		    	System.out.println("hm2:"+hm2);
		    }
		    if(hm1.equals(hm2))
		    {
		    	System.out.println("The strings are anagram");
		    }
		    else
		    System.out.println("The strings are not anagram");
		  }
		   
		    
		  
		   
		  
	}
	
}
