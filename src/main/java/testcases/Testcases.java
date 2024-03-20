package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import selenium.Utility;

public class Testcases {
	
	@Test
    public void Login()
	{
		
		
	WebDriver	driver=Utility.startBrowser("chrome","https://freelance-learn-automation.vercel.app/login");
	LoginPage login= new  LoginPage(driver);	
	login.loginToApplicationAsAdminUser("admin@email.com", "admin@123");
	}

}
