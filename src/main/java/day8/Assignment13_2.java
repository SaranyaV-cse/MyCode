package day8;

public class Assignment13_2 {

	public static void main(String[] args) {
		String str="Hello,World.";
		
		
	      int count=0;
	      int flag=0;
			    for(int i=0;i<str.length();i++)
			    {
			    	if(str.charAt(i)==','||str.charAt(i)=='.')
			    	{
			    		flag=0;
			    		
			    	}else
			    		if(flag==0)
			    		{
			    			flag=1;
			    			count++;
			    		}
			    }
			    
			    System.out.println("No of words in the given String: "+str +" is: "+count);
			}
}