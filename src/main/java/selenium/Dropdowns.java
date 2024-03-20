package selenium;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		Utility day= new Utility();
		WebDriver driver=day.startBrowser("https://freelance-learn-automation.vercel.app/login");
		//day.dropdown("state");
	Utility.captureScreenshot(driver);
	
	Thread.sleep(5000);
	Utility.captureScreenshot(driver);
	Thread.sleep(2000);
	Utility.captureScreenshot(driver);
	Thread.sleep(2000);
	Utility.captureScreenshot(driver);
	Thread.sleep(2000);
	}

}
