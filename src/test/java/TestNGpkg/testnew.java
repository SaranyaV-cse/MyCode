package TestNGpkg;

import org.testng.annotations.Test;

public class testnew {
@Test(description="This is test1",invocationCount=1)
public void login()
{
	System.out.println("Login");
}
@Test(description="This is test2",enabled=true,priority=-3,groups="Regression")
public void createcourse()
{
	System.out.println("Test2 Last");
}
@Test(priority=-1,dependsOnMethods="login")
public void createcategory()
{
	System.out.println("Create Category");
}
@Test(groups="Regression")
public void deletecategory()
{
	System.out.println("delete category");
}
@Test
public void deletecourse()
{
	System.out.println("delete course");
}
}
