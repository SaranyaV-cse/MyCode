package day7;

public class StudentNew {
	private static String fName;
	private String lName;
	private String id;
	private String emailId;
	private String course[];
public StudentNew()
{
	this.fName=fName;
	this.lName=lName;
	this.id=id;
	this.emailId=emailId;
	this.course=course;
}
public static String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String[] getCourse() {
	return course;
}
public void setCourse(String[] course) {
	this.course = course;
}
public void studentDetails() {
	
	System.out.println("Student First Name: "+fName);
	System.out.println("Student Last Name: "+lName);
	System.out.println("Student Email Id: "+emailId);
	System.out.println("Student id: "+id);
	System.out.println("Student Course:" +course);
	/*
	 * for(int i=0;i<courses.length;i++) {
	 * System.out.println("Student Course:"+(i+1)+" "+courses[i]);
	 * 
	 * }
	 */
	
}
}
