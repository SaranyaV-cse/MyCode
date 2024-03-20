package selenium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;

import day8.TakeScreenshot;
public class Utility2 {


	public static WebDriver startBrowser(String url)
	{

		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
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
			System.out.println("unable to click webelement and hence using javascript click"+ e.getMessage());
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",locator);
		}
	}


}
