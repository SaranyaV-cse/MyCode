package selenium;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitAssignment {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver= Utility.startBrowser("https://freelance-learn-automation.vercel.app/login");

		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='social-btns']//a"));

		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2)); //

		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='social-btns']//a"), elements.size()));

		if(elements.size()>=9)
		{
			System.out.println("Social Media icons count is: "+elements.size());
			driver.findElements(By.xpath("//div[@class='social-btns']//a")).get(3).click();
		}
		else
		{
			System.out.println("Social Media icons count is: "+elements.size());
		}
         driver.quit();
	}

}
