package selenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import day8.TakeScreenshot;

public class Selenium_Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		boolean urlvalidation=driver.getCurrentUrl().contains("login");
		System.out.println("URL contains Login keyword: "+urlvalidation);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String title= driver.getTitle();
		boolean titleValidation=title.contains("Automation");
		System.out.println("Title contains Automation: "+titleValidation);
		WebElement emailID=driver.findElement(By.name("email1"));
		WebElement password=driver.findElement(By.id("password1"));
		emailID.sendKeys("admin@email.com");
		password.sendKeys("admin@123");
		
		WebElement login= driver.findElement(By.className("submit-btn"));
		login.click();
	    Thread.sleep(3000);
	    WebElement mgtxt=driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div/div[2]/div[1]/span"));
		boolean managetxt=mgtxt.getText().equalsIgnoreCase("manage");
	    System.out.println("Manage button Present: "+managetxt);
	    TakeScreenshot ts= (TakeScreenshot)driver;
	    File src= ((TakesScreenshot) ts).getScreenshotAs(OutputType.FILE);
	    File dest=new File("");
	    
	    Select s=new Select(emailID);
	    
	    try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  
	}

}
