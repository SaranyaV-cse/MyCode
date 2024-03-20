package selenium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascriptexecutor {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=Utility.startBrowser("https://login.yahoo.com/");
		By usernamelocator=By.id("login-username");
		By usercheck=By.id("persistent");
		//usernamelocator.sendKeys("admin@yahoo.com");
		Utility.type(driver, usernamelocator, "admin@yahoo.com");
	   // Utility.clickElement(driver,usercheck);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style,'border: solid 3px green'');",usernamelocator);
		
 
	}

}
