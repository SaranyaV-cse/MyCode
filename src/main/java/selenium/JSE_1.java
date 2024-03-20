package selenium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSE_1 {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=Utility.startBrowser("https://login.yahoo.com/");
		Utility.type(driver, By.id("login-username"), "admin@yahoo.com");
		Utility.clickElement(driver, By.xpath("//label[@for='persistent']"));
		
		

	}

}
