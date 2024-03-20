package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		boolean urlvalidation=driver.getCurrentUrl().contains("login");
		System.out.println("URL contains Login keyword: "+urlvalidation);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		WebElement emailID=driver.findElement(By.name("email1"));
		WebElement password=driver.findElement(By.id("password1"));
		emailID.sendKeys("admin@email.com");
		password.sendKeys("admin@123");
		WebElement login= driver.findElement(By.className("submit-btn"));
		login.click();
	    Thread.sleep(3000);
		WebElement element=driver.findElement(By.tagName("div"));;
        List<WebElement> ll=element.findElements(By.tagName("span"));
        for(WebElement e: ll)
        {
        	if(e.getText().contains("Manage"))
        	{
        		System.out.println("Text Present: "+e.getText());
        	}
        }

	}

}
