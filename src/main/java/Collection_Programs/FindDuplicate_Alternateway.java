package Collection_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class FindDuplicate_Alternateway {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) 
	{
		String s = "selenium maven Jenkins testng WebDriver";
		String k = s.replace(" ", "");
		//System.out.println(k.length());
        int flag=1;
        List<Character> a1= new ArrayList<Character>();
        for (char c : s.toCharArray()) {
        	if(!a1.contains(c))
        	{
        	  a1.add(c);
        	  flag=1;
        	}
        	else {flag=0;}
        }
        if (flag==1)
        {
        	System.out.println(a1 );
        }
        //if
        	
        List<Character> a2= new ArrayList<Character>();
        
        System.out.println(a1);
        for (int i=0;i<a1.size();i++)
        {
      
        	a2.add((char) a1.get(i));

       
        	
        }
        
       
	}
	
}



