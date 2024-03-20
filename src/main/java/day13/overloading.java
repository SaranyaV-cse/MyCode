package day13;

public class overloading {
	
	private String name="Swamy";
	private int id=104;
	private String course="MFC";
	private double marks=80;
	    overloading(String name,String course,double marks){
		
	    this.name=name;
	    this.course=course;
	    this.marks=marks;
	   // System.out.println("cons3"+"Name: "+name+"course: "+course+" marks: "+marks);
	    }
	
	    overloading(String name,int id,String course,double marks){
		
		this.name=name;
		this.id=id;
		this.course=course;
		this.marks=marks;
		//System.out.println("cons1"+"Name: "+name+" id: "+id +"course: "+course+" marks: "+marks);
		}
        overloading(int id,String course,double marks){
		
		this.name=name;
		this.id=id;
		this.course=course;
		this.marks=marks;
		//System.out.println("cons2 "+" id: "+id +"course: "+course+" marks: "+marks);
		}

        overloading(){
        	System.out.println("Default");
        }
	
	public void StudentUG() {
		System.out.println(name + id +course +marks);
		
		
		  }
	
	public void Student() {
		System.out.println("Base class method");
		
		
		  }
	/*
	 * public void StudentUG(String name,int id,String course,double marks) {
	 * System.out.println("cons1"+"Name: "+name+" id: "+id
	 * +"course: "+course+" marks: "+marks); }
	 * 
	 * public void StudentUG(int id,String course,double marks) {
	 * System.out.println("cons2 "+" id: "+id +"course: "+course+" marks: "+marks);
	 * } public double StudentUG(String name,String course,double marks) {
	 * System.out.println("cons3"+"Name: "+name+"course: "+course+" marks: "+marks);
	 * return marks; }
	 */
	
	
}
