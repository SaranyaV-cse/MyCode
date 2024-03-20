package Collection_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ListofListofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "selenium maven Jenkins testng WebDriver";
		String k = s.replace(" ", "");
		System.out.println(k.length());
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		for (int i = 0; i < k.length(); i++) {
			if (!hs.containsKey(k.charAt(i))) {
				hs.put(k.charAt(i), 1);
			} else {
				hs.put(k.charAt(i), hs.get(k.charAt(i)) + 1);
			}
		}
		//System.out.println(hs);
	for(Entry<Character, Integer> a: hs.entrySet())
	{
		if(a.getValue()>1)
		{
			System.out.println(a);
			
		}
	}
	}

}



