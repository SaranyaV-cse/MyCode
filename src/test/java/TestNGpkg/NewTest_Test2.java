package TestNGpkg;

import org.testng.annotations.Test;

public class NewTest_Test2 {
  @Test(priority=4)
  public void loginApp() {
	  System.out.println("Hello Login");
  }
  @Test(priority=2)
  public void createcourse() {
	  System.out.println("User able to create course");
  }
  @Test(priority=1)
  
  public void deletecourse() {
	  System.out.println("user able todelete course");
  }
  @Test(priority=3)
  
  public void oklogout() {
	  System.out.println("Hello logout");
  }
}
