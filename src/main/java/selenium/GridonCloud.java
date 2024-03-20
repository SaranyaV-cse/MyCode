package selenium;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GridonCloud {

	public static void main(String[] args) throws MalformedURLException {
		
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("121.0");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		
		ltOptions.put("username", "saranyav.cse");
		ltOptions.put("accessKey", "fVurmJ5vXt2HSClNgAl12hILtViqXob5afww0LWh5wUyAFA6bG");
		
		ltOptions.put("visual", true);
		ltOptions.put("video", true);
		ltOptions.put("resolution", "1280x1024");
		ltOptions.put("network", true);
		ltOptions.put("project", "Myproject2");
		ltOptions.put("smartUI.project", "Project2");
		ltOptions.put("name", "NewTest2");

		ltOptions.put("console", "true");
		ltOptions.put("selenium_version", "4.15.0");
		ltOptions.put("w3c", true);
		browserOptions.setCapability("LT:Options", ltOptions);
		
       URL huburl=new URL("https://saranyav.cse:fVurmJ5vXt2HSClNgAl12hILtViqXob5afww0LWh5wUyAFA6bG@hub.lambdatest.com/wd/hub");
       WebDriver driver= new RemoteWebDriver(huburl,browserOptions);
       /********************Breakoutcode********************************/
      
		driver.get("https://freelance-learn-automation.vercel.app/login");
		Utility.waitForPageLoad(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement emailID=driver.findElement(By.name("email1"));
		WebElement password=driver.findElement(By.id("password1"));
		emailID.sendKeys("admin@email.com");
		password.sendKeys("admin@123");
		WebElement login= driver.findElement(By.className("submit-btn"));
       login.click();
       
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20)); //
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Manage']")));

		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Manage']"))).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Manage Categories']")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		String parent=driver.getWindowHandle();
       Set<String> windowHandles = driver.getWindowHandles();
		/*
		 * List<String> handlesList = new ArrayList<>(windowHandles);
		 * driver.switchTo().window(handlesList.get(1));
		 */
       
       Iterator itr=windowHandles.iterator();
       while(itr.hasNext())
       {
       	String handle=(String) itr.next();
       	if(!parent.equalsIgnoreCase(handle))
       	{
       		driver.switchTo().window(handle);
       	}
       	{
       		
       	}
       }
		driver.findElement(By.xpath("//button[normalize-space()='Add New Category']")).click();
		Alert ale=driver.switchTo().alert();
		ale.sendKeys("AWSRoom1");
		ale.accept();
		if(driver.findElement(By.xpath("//td[normalize-space()='AWSRoom1']")).isDisplayed())
		{
			System.out.println("AWS Category is created");
		}
		else
		{
			System.out.println("AWS Category is not created");
		}

		WebDriver driver1=Utility.startBrowser("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		if(driver1.findElement(By.xpath("//label[normalize-space()='AWSRoom1']")).isDisplayed())
		{
			System.out.println("AWS Category is found in Signup page");
		}
		else
		{
			System.out.println("AWS Category is not found in signup page");
		}
		driver1.quit();

		WebElement element= driver.findElement(By.xpath("//td[normalize-space()='AWSRoom1']//following::button[contains(normalize-space(),'Update')][1]"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		  wait.until(ExpectedConditions.elementToBeClickable(element));
		 // js.executeScript("arguments[0].click()", element);
		 Utility.clickElement(driver,By.xpath("//td[normalize-space()='AWSRoom1']//following::button[contains(normalize-space(),'Update')][1]"));
       
		wait.until(ExpectedConditions.alertIsPresent());
		Alert ale1=driver.switchTo().alert();
		ale1.sendKeys("GCPRoom1");
		ale1.accept();
		if(driver.findElement(By.xpath("//td[normalize-space()='GCPRoom1']")).isDisplayed())
		{
			System.out.println("GCP Category is updated");
		}
		else
		{
			System.out.println("GCP Category is not updated");
		}

		driver.findElement(By.xpath("//td[normalize-space()='GCPRoom1']//following::button[contains(normalize-space(),'Delete')][1]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='action-btn'][normalize-space()='Delete']")));
		driver.findElement(By.xpath("//button[@class='action-btn'][normalize-space()='Delete']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//td[normalize-space()='GCPRoom1']")));
		if(driver.findElements(By.xpath("//td[normalize-space()='GCPRoom1']")).isEmpty())
		{
			System.out.println("GCP Category is Deleted");
		}
		else
		{
			System.out.println("GCP Category is not Deleted");
		}
		WebDriver driver2=Utility.startBrowser("https://freelance-learn-automation.vercel.app/signup");
		driver2.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		if(driver2.findElements(By.xpath("//label[normalize-space()='GCPRoom1']")).isEmpty())
		{
			System.out.println("GCP Category is not found in Signup page");
		}
		else
		{
			System.out.println("GCP Category is found in signup page");
		}
		driver2.quit();
		driver.quit();
	}

}
