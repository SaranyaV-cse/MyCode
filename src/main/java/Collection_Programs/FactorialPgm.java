package Collection_Programs;

import java.util.Scanner;

public class FactorialPgm {

	public static void main(String[] args) {
	 System.out.println("Enter the number");
	 Scanner sc=new Scanner(System.in);
	int x= sc.nextInt();
	
	
	 for(int i=(x-1);i>=1;i--)
	 {
	x=x*(i-1);
	 
	
	}
	 System.out.println(x); 
	}

}
