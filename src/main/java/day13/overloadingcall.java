package day13;

public class overloadingcall extends overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  overloading o1 =new overloading(0,"BE",711); 
		  overloading o2 =new overloading("Sharvil",12,"BE1",171);
		 
          overloading o3=new overloadingcall( );
          o1.StudentUG();
          o2.StudentUG();
          o3.Student();
          
         
/*
 * o1.StudentUG("Saranya",101,"BE",71); o1.StudentUG(102, "Bcom",82);
 * o1.StudentUG("Sharvil", "BE Robotics", 93);
 */
	}
	 public void StudentUG() {
   		System.out.println("overriden method");
   		
   		
   		  }
	 public void Student1() {
			System.out.println("Child class method");
			
			
			  }

}
