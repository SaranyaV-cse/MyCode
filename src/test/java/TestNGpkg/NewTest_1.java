package TestNGpkg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest_1 {
  @Test
  public void test1() 
  {
	  System.out.println("Hello my first TestNG1");
	  Reporter.log("Thread id: "+Thread.currentThread().getId(),true);
  }
  @Test
  public void test2() 
  {
	  System.out.println("Hello my first TestNG2");
	  Reporter.log("Thread id: "+Thread.currentThread().getId(),true);
  }
  @Test
  public void test3() 
  {
	  System.out.println("Hello my first TestNG3"); 
	  Reporter.log("Thread id: "+Thread.currentThread().getId(),true);
	  
  }
  @Test
  public void test4() 
  {
	  System.out.println("Hello my first TestNG4");
	  Reporter.log("Thread id: "+Thread.currentThread().getId(),true);
  }
  @Test
  public void test5() 
  {
	  System.out.println("Hello my first TestNG5");
	  Reporter.log("Thread id: "+Thread.currentThread().getId(),true);
  }
}
