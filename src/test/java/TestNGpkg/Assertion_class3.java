package TestNGpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_class3 {
  @Test(groups="smoke")
  public void test1() {
	  String expectedmsg="Hello java";
	  String actualmsg="Hello java";
  Assert.assertEquals(expectedmsg,actualmsg);
  Assert.assertEquals(true, true);
  Assert.assertEquals(0, 0);
  }
  @Test
  public void test2() {
	  String expectedmsg="Hello java";
	  String actualmsg="Hello Java";
  Assert.assertTrue(actualmsg.equalsIgnoreCase(expectedmsg));
  Assert.assertFalse(true);
 
  }
}
