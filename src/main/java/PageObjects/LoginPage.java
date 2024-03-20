package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 WebDriver driver;
	public LoginPage( WebDriver driver)
	{
		this.driver=driver;
	}

	private By userName=By.id("email1");
	private By password=By.id("password1");
	private By submitBtn=By.xpath("//button[@type='submit']");
	
	public void loginToApplicationAsAdminUser(String username,String password1)
	{
		driver.findElement(userName).sendKeys(username);
		driver.findElement(password).sendKeys(password1);
		driver.findElement(submitBtn).click();
		
	}


}
