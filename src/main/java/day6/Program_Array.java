package day6;

public class Program_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a="saranya Java";
      String j[]=a.split("");
      int count=0;
      int flag=0;
		//char n[] = {'a', 'b', 'c', 'd', 'e'};
		for (String g: j)
		{
			if(g.equals("a"))
			{
			
				count++;
				
			}
			if(g.equals("c"))
			{
				flag++;
			}
		}
			System.out.println(count +" Count of a");  
		   System.out.println(flag +" Count of c");
		}
}


