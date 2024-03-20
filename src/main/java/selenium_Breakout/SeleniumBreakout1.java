package selenium_Breakout;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBreakout1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		if(driver.getCurrentUrl().contains("login"))
		{
			System.out.println("The URL contains Login keyword");
		}
		else
		{
			System.out.println("The URL do not contain Login keyword");
		}

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//h2[text()='Email and Password is required']")).getText().contains("Email and Password is required"))
		{
			System.out.println("The Error message is displayed");
		}

		else
		{
			System.out.println("The Error message is not displayed");
		}
		driver.findElement(By.xpath("//a[text()='New user? Signup']")).click();

		Thread.sleep(2000);

		if(driver.getCurrentUrl().contains("signup"))
		{
			System.out.println("The URL contains signup keyword");
		}
		else
		{
			System.out.println("The URL do not contain signup keyword");
		}

		
		if(!driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled())
		{
			System.out.println("The Signup button is disabled");
		}
		else
		{
			System.out.println("The Signup button is enabled");
		}
		
		driver.findElement(By.id("name")).sendKeys("Test1");
		String EmailAddress="test1@gmail.com";
		driver.findElement(By.id("email")).sendKeys(EmailAddress);
		String password="test123";
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//label[text()='Selenium']/preceding::input[1]")).click();
		
		driver.findElement(By.xpath("//label[text()='Female']/preceding::input[1]")).click();
		
		WebElement state1=driver.findElement(By.name("state"));
		Select statesel=new Select(state1);
		statesel.selectByVisibleText("Karnataka");
		
		WebElement hobbies=driver.findElement(By.id("hobbies"));
		Select hobby=new Select(hobbies);
		hobby.selectByVisibleText("Playing");
		hobby.selectByVisibleText("Dancing");
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled())
		{
			System.out.println("The Signup button is Enabled");
			
			driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		}
		else
		{
			System.out.println("The Signup button is disabled");
		}
		driver.navigate().to("https://freelance-learn-automation.vercel.app/login");
		
		//driver.findElement(By.id("name1")).sendKeys("Test1");
		//String EmailAddress="test1@gmail.com";
		driver.findElement(By.id("email1")).sendKeys(EmailAddress);
		
		driver.findElement(By.id("password1")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Thread.sleep(6000);
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Learn Automation Courses"))
		{
			System.out.println("The title contains Learn Automation Courses");
		}
		else
		{
			System.out.println("The title do not contains Learn Automation Courses");
		}
		
		/***************************************************************************/
		List<WebElement> Totalcourses=driver.findElements(By.xpath("//div[@class='home']//child::div[1]/div[@class='course-card row']"));
		System.out.println(Totalcourses);
		int count=0;
		for(WebElement tutor :Totalcourses)
		{
			//System.out.println(tutor.getText());
			
			/*
			 * System.out.println(Totalcourses.get(count).getText());
			 * System.out.println(Totalcourses.get((Totalcourses.size()-1)-count).getText())
			 * ; count++;
			 */
			String data="date";
			List<WebElement> Tutors=driver.findElements(By.xpath("//div[@class="+data+"]"));
			System.out.println(Tutors.get(1).getText());
			count++;
			
		}
		
		
		
		
       driver.quit();
        
	}

}
