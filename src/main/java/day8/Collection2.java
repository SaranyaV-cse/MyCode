package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.exec.launcher.Java13CommandLauncher;

public class Collection2 {
	public static int numneed=1000;
	static
	{
		System.out.println("Hello Selenium");
	}
	static
	{
		System.out.println("Hello Saranya");
	}
	public void setconcept()
	{
		// TODO Auto-generated method stub
		
Scanner sc= new Scanner(System.in);
System.out.println("How many numbers you want to Add?");

int num=sc.nextInt(); 
System.out.println("Enter "+numneed+" numbers");
Set<Integer> al= new HashSet<Integer>();
al.add(90);
al.add(12);
al.add(45);
al.add(65);
//al.add(65);
al.add(null);
al.add(null);

//System.out.println(al);

int b=0;
for(int i=0;i<al.size();i++)
{

	System.out.println(al);	
	
}
System.out.println(al);
	}
	public void mapconcept()
	{
System.out.println(numneed);
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(1, "Coimbatore");
	map.put(2, "Madurai");
	map.put(3, null);
	map.put(3, "Chennai");
	map.put(4, null);
	map.put(3, "Cuddalore");
	
	for(Map.Entry m: map.entrySet())
	{
		System.out.println(m.getKey() + " "+m.getValue());
	}
	
	



	}

}
