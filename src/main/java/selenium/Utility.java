package selenium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import day8.TakeScreenshot;
public class Utility {


	public static WebDriver startBrowser_remote(String url) throws MalformedURLException
	{
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
      WebDriver  driver= new RemoteWebDriver(huburl,browserOptions);
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	public static WebDriver startBrowser(String url) 
	{
		
		WebDriver  driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	public static WebDriver startBrowser(String browser,String url) 
	{
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("Chrome"))
		{
		 driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
		driver= new EdgeDriver();	
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}



	public static String capturedateTime()
	{

		String date=new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss").format(new Date());
		return date;
	}



	public static void captureScreenshot(WebDriver driver)
	{
		try
		{

			FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE)),new File("./screenshot/screenshot1_"+capturedateTime()+".png"));

			System.out.println("Screenshot captured");	    
		}
		catch(WebDriverException e)
		{
			System.out.println("CaptureScreenshot of WebDriver Failed"+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("CaptureScreenshot of WebDriver Failed"+e.getMessage());
		}
	}
	public static void captureWebElementScreenshot(WebDriver driver,WebElement element) 
	{
		try
		{
			FileHandler.copy(element.getScreenshotAs((OutputType.FILE)),new File("./JavaSelenium/screenshot/screenshot_"+capturedateTime()+".png"));
		}    

		catch(IOException e)
		{
			System.out.println("CatureScreenshot of WebElement Failed"+e.getStackTrace());
		}
	}
	public static void waitforDOMLoad(WebDriver driver) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("return document.readyState").equals("complete");
	}
	public static void waitforElement(WebDriver driver,WebElement element) 
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	
	public static void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	public static void verifyAlert(WebDriver driver) 
	{
		try
		{
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.alertIsPresent());
		}
		catch(Exception e)
		{
			e.getMessage();
			System.out.println("Alert not found/verified");
		}
	}
	public void dropdown(String element,WebDriver driver)
	{
		WebElement State1=driver.findElement(By.name(element));
		Select s1= new Select(State1); 
		List<WebElement> l=s1.getOptions();
		ArrayList originalAL= new ArrayList(l);


		for(WebElement k:s1.getOptions())
		{
			originalAL.add(k.getText());
			System.out.println(originalAL);
		}

		ArrayList duplicateAL= new ArrayList();
		//Set duplicateAL=(Set) originalAL;

		Set s= new TreeSet();
		s.addAll(duplicateAL);

		System.out.println(s);

		System.out.println(originalAL);
		System.out.println(duplicateAL);
		if(originalAL==duplicateAL) {
			System.out.println("The elements are sorted"); 
		} 
		else
		{
			System.out.println("The elements are not sorted"); 
		}
		/*
		 * for(int i=0;i<l.size();i++) { if(originalAL==duplicateAL) {
		 * System.out.println("The elements are sorted"); } }
		 */
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public static void type(WebDriver driver,By locator,String value)

	{
		try
		{
			driver.findElement(locator).sendKeys(value);
			
		}
		catch(Exception e) {
			System.out.println("unable to input through Sendkeys and using Javascript type "+ e.getMessage());
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].value=arguments[1]",locator,value);
			System.out.println("successfully typed "+value+" into the WebElement");
		}
	}

	public static void clickElement(WebDriver driver, By locator)

	{
		try
		{
			driver.findElement(locator).click();
		
		}
	    catch(Exception e) {
			//System.out.println("unable to click webelement and hence using javascript click"+ e.getMessage());
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",locator);
		}
	}


}
