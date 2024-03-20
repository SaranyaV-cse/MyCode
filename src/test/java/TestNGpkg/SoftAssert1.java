package TestNGpkg;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;


public class SoftAssert1 {
  @Test(groups="smoke")
  public void test1() 
  {
String expectedmsg="This is an Apple";
String actualmsg="This is an Apple";
		 SoftAssert assertsft= new SoftAssert();
		 assertsft.assertEquals(20,20);
		 assertsft.assertEquals(true, true);
		 assertsft.assertEquals(expectedmsg,actualmsg);
		 assertsft.assertAll();
	  
  }
}
