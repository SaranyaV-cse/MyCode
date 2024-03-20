package TestNGE2E;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium.Utility;

public class TestNgE2E {

	WebDriver driver;
	String categoryName;
	String newCategoryName;
	WebDriverWait wait;
	WebElement element;
	@BeforeClass
	public void initialsetup()
	{
		System.out.println("Running Before Class-Setting up Browser");
		driver=Utility.startBrowser("chrome","https://freelance-learn-automation.vercel.app/login");
		System.out.println("Browser is up and Running");
			
	}
	
	
	
	@Test(priority=1)
	public void Login()
	{
		WebElement emailID=driver.findElement(By.name("email1"));
		WebElement password=driver.findElement(By.id("password1"));
		emailID.sendKeys("admin@email.com");
		password.sendKeys("admin@123");
		WebElement login= driver.findElement(By.className("submit-btn"));
        login.click();
        Assert.assertTrue(driver.findElement(By.xpath("//h4[@class='welcomeMessage']")).getText().contains("Welcome"),"Welcome message did not appear");
	}
	@Test(priority=2,dependsOnMethods="Login")
	public void createCategory()
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20)); //
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Manage']")));

		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Manage']"))).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Manage Categories']")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		String parent=driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
		Iterator itr=windowHandles.iterator();
        while(itr.hasNext())
        {
        	String handle=(String) itr.next();
        	if(!parent.equalsIgnoreCase(handle))
        	{
        		driver.switchTo().window(handle);
        	}
        	
        }
		driver.findElement(By.xpath("//button[normalize-space()='Add New Category']")).click();
		Alert ale=driver.switchTo().alert();
		categoryName="AWSRoom1";
		ale.sendKeys(categoryName);
		ale.accept();
		Utility.waitforElement(driver, driver.findElement(By.xpath("//td[normalize-space()='"+categoryName+"']")));
		Assert.assertTrue(driver.findElement(By.xpath("//td[normalize-space()='"+categoryName+"']")).isDisplayed(),"Could not create Category");
	}
	@Test(priority=3,dependsOnMethods="createCategory")
	
	public void verifyCategoryOnRegistration()
	{
		WebDriver driver1=Utility.startBrowser("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Assert.assertTrue(driver1.findElement(By.xpath("//label[normalize-space()='"+categoryName+"']")).isDisplayed(),"New Category not displayed on Signup page");
		driver1.quit();
	}
	@Test(priority=4,dependsOnMethods="createCategory")
	public void updateCategory() throws InterruptedException
	{
		Thread.sleep(2000);
		By locator=By.xpath("//td[normalize-space()='AWSRoom1']//following::button[contains(normalize-space(),'Update')][1]");
		Utility.clickElement(driver,By.xpath("//td[normalize-space()='"+categoryName+"']//following::button[contains(normalize-space(),'Update')][1]"));
		/*
		 * JavascriptExecutor js1=(JavascriptExecutor)driver;
		 * js1.executeScript("arguments[0].click()",locator); JavascriptExecutor
		 * js=(JavascriptExecutor) driver; element=driver.findElement(By.xpath(
		 * "//td[normalize-space()='AWSRoom1']//following::button[contains(normalize-space(),'Update')][1]"
		 * )); js.executeScript("arguments[0].scrollIntoView(true);", element);
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(element));
		 */
		
		// Utility.clickElement(driver,By.xpath("//td[normalize-space()='AWSRoom1']//following::button[contains(normalize-space(),'Update')][1]"));
        newCategoryName="GCPRoom1";
		wait.until(ExpectedConditions.alertIsPresent());
		Alert ale1=driver.switchTo().alert();
		ale1.sendKeys( newCategoryName);
		ale1.accept();
		Assert.assertTrue(driver.findElement(By.xpath("//td[normalize-space()='"+newCategoryName+"']")).isDisplayed(),"Category not updated");
		
	}
	@Test(priority=5,dependsOnMethods="updateCategory")
	public void deleteCategory()
	{
		driver.findElement(By.xpath("//td[normalize-space()='"+newCategoryName+"']//following::button[contains(normalize-space(),'Delete')][1]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='action-btn'][normalize-space()='Delete']")));
		driver.findElement(By.xpath("//button[@class='action-btn'][normalize-space()='Delete']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//td[normalize-space()="+newCategoryName+"]")));
		Assert.assertTrue(driver.findElements(By.xpath("//td[normalize-space()= '"+newCategoryName+"']")).isEmpty(),"Category not deleted");
		
	}
	@Test(priority=6,dependsOnMethods="deleteCategory")
	public void verifyDeletionOnSignup()
	{
		WebDriver driver2=Utility.startBrowser("https://freelance-learn-automation.vercel.app/signup");
		driver2.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Assert.assertTrue(driver2.findElements(By.xpath("//label[normalize-space()= "+newCategoryName+"]")).size()==0,"Category found on Registration page not deleted");
		
		driver2.quit();
	}
	@AfterClass
	public void teardown()
	{
		System.out.println("Running After Class-closing Browser");
		driver.quit();
		System.out.println("Browser is closed and quit");
	}
	
}
