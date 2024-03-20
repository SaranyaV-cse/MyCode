package day6;

public class Array_day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a[]= {11.5,-25,93.9,-32.3,30,79.9,-25};
//double i=a[0];
//double j=a[1];
double l=a[0];
for(double s: a)
{
	if(l<s)
	{
		l=s;
	

	}


	}
System.out.println(l);
	}
}
