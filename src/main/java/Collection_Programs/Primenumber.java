package Collection_Programs;

public class Primenumber {

	public static void main(String[] args) {
		int x=2;
	    int flag=0;
		if (x==0 && x==1)
		{
			flag=0;
		}
		for(int i=2;i<=x/2;i++)
		{
		if(x%i==0)
		{

flag=0;
		}
		else
		{
			flag=1;
		}

	}
	if(flag==1)
	{
		System.out.println("This is the prime number " +x);
	}
	else
		System.out.println("This is not primenumber");
	}

}
