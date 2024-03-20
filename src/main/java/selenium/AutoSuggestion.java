package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import day8.TakeScreenshot;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
		driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys("C");
		Thread.sleep(3000);
		List<WebElement> ul=driver.findElements(By.xpath("//ul[contains(@class,'autocomplete')]//div"));
		for(WebElement el:ul)
		{
			
			System.out.println(el.getText());
			if(el.getText().equalsIgnoreCase("ColdFusion"))
			{
				el.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		  driver.get("https://freelance-learn-automation.vercel.app/login");
		  driver.manage().window().maximize(); try { Thread.sleep(3000); } catch
		  (InterruptedException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); } WebElement
		  emailID=driver.findElement(By.xpath("//input[@name='email1']")); WebElement
		  password=driver.findElement(By.xpath("//input[@name='password1']"));
		  emailID.sendKeys("admin@email.com"); password.sendKeys("admin@123");
		  WebElement login= driver.findElement(By.className("submit-btn"));
		  login.click(); try { Thread.sleep(5000); } catch (InterruptedException e) {
		  // TODO Auto-generated catch block e.printStackTrace(); }
		  
		  WebElement managebtn=
		  driver.findElement(By.xpath("//span[text()='Manage']"));
		  
		  
		  //Instantiating Actions class Actions actions = new Actions(driver);
		  
		  //Hovering on main menu actions.moveToElement(managebtn);
		  
		  // Locating the element from Sub Menu WebElement subMenu =
		  driver.findElement(By.
		  xpath("//span[text()='Manage']/parent::div//a[text()='Manage Courses']"));
		  
		  //To mouseover on sub menu actions.moveToElement(subMenu);
		  
		  //build()- used to compile all the actions into a single step
		 // actions.click().build().perform();
		  driver.findElement(By.xpath("//button[contains(text(),'Add New Course')]")).
		  click(); driver.getTitle().contains("ADD NEW COURSE"); {
		  driver.findElement(By.xpath("//input[@id='thumbnail']")).sendKeys(
		  "D:\\Java_Training\\screenshots\\test.png"); driver.findElement(By.
		  xpath("//h3[text()='Course Name']//following::input[@id='name']")).sendKeys(
		  "NewAPIAutomation1"); driver.findElement(By.xpath(
		  "//h3[text()='Description']//following::textarea[@name='description']")).
		  sendKeys("TestABC"); driver.findElement(By.xpath(
		  "//h3[text()='Instructor']//following::input[@name='instructorName']")).
		  sendKeys("TestABC"); driver.findElement(By.xpath(
		  "//h3[text()='Price']//following::input[@name='price']")).sendKeys("1000");
		  driver.findElement(By.xpath("//div[text()='Select Category']")).click();
		  driver.findElement(By.
		  xpath("//div[text()='Select Category']//parent::button//following::div//button[contains(text(),'RestAssured')]"
		  )).click();
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		 
		 
	    		
	    /* EmailAddress="test1@gmail.com";
		driver.findElement(By.id("email")).sendKeys(EmailAddress);
		 * 
		 * //driver.findElement(By.id("password")).sendKeys(password);
		 * driver.findElement(By.xpath("//button[contains(text(),'Add New Course')]")
		 * ).click();
		 * 
		 * driver.findElement(By.xpath("//label[text()='Female']/preceding::input[1]")).
		 * click();
		 * 
		 * WebElement state1=driver.findElement(By.name("state")); Select statesel=new
		 * Select(state1); statesel.selectByVisibleText("Karnataka");
		 * 
		 * WebElement hobbies=driver.findElement(By.id("hobbies")); Select hobby=new
		 * Select(hobbies); hobby.selectByVisibleText("Playing");
		 * hobby.selectByVisibleText("Dancing"); //Thread.sleep(5000);
		 * if(driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled()) {
		 * System.out.println("The Signup button is Enabled");
		 * 
		 * driver.findElement(By.xpath("//button[text()='Sign up']")).click(); } else {
		 * System.out.println("The Signup button is disabled"); }
		 * driver.navigate().to("https://freelance-learn-automation.vercel.app/login");
		 * 
		 * //driver.findElement(By.id("name1")).sendKeys("Test1"); //String
		 * EmailAddress="test1@gmail.com";
		 * driver.findElement(By.id("email1")).sendKeys(EmailAddress);
		 * 
		 * //driver.findElement(By.id("password1")).sendKeys(password);
		 * 
		 * driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		 * 
		 * try { Thread.sleep(6000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		
	    WebElement mgtxt=driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div/div[2]/div[1]/span"));
		boolean managetxt=mgtxt.getText().equalsIgnoreCase("manage");
	    System.out.println("Manage button Present: "+managetxt);
	    TakeScreenshot ts= (TakeScreenshot)driver;
	    File src= ((TakesScreenshot) ts).getScreenshotAs(OutputType.FILE);
	    File dest=new File("");
	    
	  //  Select s=new Select(emailID);
	    
	  /*  try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    */
	  

	}

		  }
		  }
	}
