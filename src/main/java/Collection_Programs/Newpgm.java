package Collection_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Newpgm {

	public static void main(String[] args) {
		String str="5554rrti";
	    boolean t=str.toLowerCase().matches(".*[aeiou].*");
	    int j = 0;
	    System.out.println(t);
		/*
		 * for(int i=0;i<(t.length-1);i++) { if ((t[i] == (('a'))||(t[i] ==
		 * ('e'))||(t[i] == ('i'))||(t[i] == ('o'))||(t[i] == ('u')))) {
		 * System.out.println("The given char has vowels:"+t[i]); }
		 * 
		 * String s1=s.replaceAll("[^0-9]"," ").trim();
		 * System.out.println("The numbers are:"+s1);
		 * 
		 * 
		 * 
		 * }
		 */
		//String str ="aeiaaioooaauuaeiou";
	    Pattern p = Pattern.compile("([aAeEiIoOuU])\\1{0,}");

	    Matcher m =p.matcher(str) ;
	    while (m.find()) {
	        System.out.println(m.group());
	    }
		/*
		 * j=Integer.parseInt(s1); System.out.println("The numbers are:"+j);
		 */

	}

}
