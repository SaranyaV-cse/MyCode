package day4;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b=10;
int flag=0;
char ori;
String rev = "";

String original="Saranya";

/*
 * for(int i=0;i<original.length();i++) { for(int j=original.length()-1;j>0;j--)
 * { rev=original.charAt(j); if(rev==original.charAt(i)) { flag=1;
 * System.out.print(rev); } } }
 */
 for(int i=0;i<=original.length()-1;i++)
 {
	System.out.print(original.charAt(i)); 
 }
 
System.out.println();
for(int j=original.length()-1;j>=0;j--)
{
//rev=rev+original.charAt(j);
System.out.print(original.charAt(j));
}
/*
 * if(rev.equals(original)) { System.out.println(rev+" : is palindrome"); } else
 * { System.out.println(rev +"not palindrome"); }
 */
	
}
}
