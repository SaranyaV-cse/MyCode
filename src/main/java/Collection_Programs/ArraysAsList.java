package Collection_Programs;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public ArraysAsList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l= Arrays.asList(10,20,30,40);
List l2= Arrays.asList("Selenium","Java","Maven");
List l3= Arrays.asList('S','A','R','A','N','Y','A');
System.out.println(l3);
int[] arr1= {1,2,3};
int[] arr2= {1,2,3};
System.out.println(arr1==arr2);
int [][]arr3= new int[3][2];
System.out.println(arr3[0]);
String s= "Saranya";
String k="Saranya";
System.out.println(s==k);
	}

}
