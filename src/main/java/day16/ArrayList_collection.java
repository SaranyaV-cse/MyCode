package day16;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l=new ArrayList();
l.add("Saranya");
l.add("Sharvil");
l.add("Amma");
l.add("Swamy");
l.add("Bramble");
l.add("Berry");
l.add(5,105);
l.add(6,true);
ArrayList l2 = new ArrayList();
l2.addAll(l);


for(int i=0;i<l.size();i++)
{
boolean j=l.addAll(l2);

}

System.out.println(l2.size());
System.out.println(l2.contains("Berry"));
l2.add(65);



	}

}
