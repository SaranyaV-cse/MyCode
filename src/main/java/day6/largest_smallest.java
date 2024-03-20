package day6;

public class largest_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] d= {-6.8,88,-95.7,-46.9,22,-35,76.0,55,-38.4};
double small=d[0];
for(double h: d)
{
	if(small>h)
	{
		small=h;
		
	}
	
}
System.out.println(small);
	}

}
