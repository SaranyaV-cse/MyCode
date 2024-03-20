package studentPackageSys;

public class Student {

	private String fName;
	private  String lName;
	private int id;
	private  String emailId;
	private String []courses;
	
	public Student(String fName,String lName,int id,String emailId,String[] courses)
	{
		this.fName=fName;
		this.lName=lName;
		this.id=id;
		this.emailId=emailId;
		this.courses=courses;
		
		
	}
	
	public String getfName()
	{
		return fName;
	}

	public String getlName() {
		return lName;
	}

	
	public int getId() {
		return id;
	}

	

	public String getEmailId() {
		return emailId;
	}

	

	public String[] getCourses() {
		return courses;
	}


	public void studentDetails() {
		
		System.out.println("Student First Name: "+fName);
		System.out.println("Student Last Name: "+lName);
		System.out.println("Student Email Id: "+emailId);
		System.out.println("Student id: "+id);
		
		for(int i=0;i<courses.length;i++)
		{
		System.out.println("Student Course:"+(i+1)+" "+courses[i]);
		
		}
		
	}
	
}
