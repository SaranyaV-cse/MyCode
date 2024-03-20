package day8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class NewSelenium extends PageObject {

	public NewSelenium(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	NewSelenium pg = new NewSelenium(driver);

	public static void main(String[] args) throws AWTException, InterruptedException {

		
		WebDriver driver= new FirefoxDriver();
		WebDriver driver2= new EdgeDriver();
		
		WebDriver driver3= new ChromeDriver();
		WebDriver driver1= new SafariDriver();
		/*
		 * ChromeOptions opt=new ChromeOptions();
		 * opt.setExperimentalOption("excludeSwitches",Arrays.asList(
		 * "disable-popup-blocking","enable-automation"));
		 * opt.addArguments("--disable-notifications");
		 * 
		 * WebDriver driver=new ChromeDriver(opt);
		 * //driver.get("https://freelance-learn-automation.vercel.app/signup");
		 * driver.get("https://freelance-learn-automation.vercel.app/login");
		 * driver.manage().window().maximize(); String title=driver.getTitle(); String
		 * url= driver.getCurrentUrl();
		 * System.out.println("URL of the current Application is: "+url);
		 * 
		 * 
		 * WebElement newUser=driver.findElement(By.className("subLink"));
		 * newUser.click();
		 * 
		 * 
		 * 
		 * WebElement uname= driver.findElement(By.id("name"));
		 * 
		 * // pg.userName //.sendKeys("saranyav.cse@gmail.com"); WebElement
		 * emailId=driver.findElement(By.id("email"));
		 * emailId.sendKeys("saranyav.cse@gmail.com");
		 * 
		 * WebElement password=driver.findElement(By.id("password"));
		 * password.sendKeys("Sharvil@2015");
		 * 
		 * WebElement state=driver.findElement(By.id("state"));
		 * 
		 * Select stateDD= new Select(state); List<WebElement> stateLL=
		 * stateDD.getOptions();
		 * 
		 * File src= new File("D:\\Java_Training\\test.png"); File screenshotFile =
		 * ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); String
		 * screenshotBase64 = ((TakesScreenshot)
		 * src).getScreenshotAs(OutputType.BASE64);
		 * 
		 * File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); try {
		 * FileUtils.copyFile(src1,new
		 * File("D:\\Java_Training\\screenshots\\test.png")); } catch (IOException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * 
		 */

		/*
		 * WebElement password= driver.findElement(By.id("password"));
		 * password.sendKeys("Sharvil@2015");
		 */

		/*
		 * System.out.println(uname.isDisplayed());
		 * System.out.println(uname.isEnabled());
		 * System.out.println(uname.isSelected());
		 */

		// WebDriver driver=new ChromeDriver(opt);
		/*
		 * driver.findElement(By.id("Login")).click();
		 * opt.setPageLoadStrategy(PageLoadStrategy.NORMAL); ;
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		 * Thread.sleep(2000); WebElement appl =
		 * driver.findElement(By.className("slds-icon-waffle")); appl.click(); //
		 * driver.quit(); Thread.sleep(2000); WebElement search =
		 * driver.findElement(By.xpath("//*[@class='al-menu-search-bar']"));
		 * 
		 * Thread.sleep(2000); search.sendKeys("Service Console"); Robot rob = new
		 * Robot();
		 * 
		 * rob.keyPress(KeyEvent.VK_ENTER);
		 */
		// driver.quit();
		/*
		 * Robot rob = new Robot(); // create rob object of Robot class
		 * rob.keyPress(KeyEvent.VK_ESCAPE);
		 */ // pressing TAB button to focus on button at notification button
		// clicking on <OK> button on notification pop up
		/*
		 * driver.switchTo().frame(null);
		 * 
		 * tar.dismiss();
		 */
		/*
		 * WebElement state1= driver.findElement(By.id("state")); Select sel= new
		 * Select(state1); //sel.selectByValue("Gujarat"); List<WebElement> alldrp =
		 * sel.getOptions(); for (int i=0;i<alldrp.size();i++) {
		 * 
		 * System.out.println(alldrp.get(i).getText());
		 * 
		 * }
		 */
	}
}
