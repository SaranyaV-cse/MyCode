package selenium;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Options {

	public static void main(String[] args) throws InterruptedException {
		
	DesiredCapabilities cap=new DesiredCapabilities();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-infobars");
		opt.setPageLoadTimeout(Duration.ofSeconds(20));
	//	opt.addArguments("start-maximized");
		//opt.addArguments("--headless=new");
		
		opt.merge(cap);
		String userName="admin";
		String password="admin";
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		//driver.close();
		
		Thread.sleep(1000);
		driver.get("https://"+userName+":"+password+"@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(1000);
		opt.addArguments("disable-infobars");
		//driver.quit();

	}

}
