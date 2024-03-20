package day13;
class prevcons{
	prevcons(){
		System.out.println("Super class");
	}
}
public class Constructor1 extends prevcons{
Constructor1()
{
	System.out.println("Child class");
	
}
	
public static void main(String[] args) {
	Constructor1 c1=new Constructor1();
	

	}

}
