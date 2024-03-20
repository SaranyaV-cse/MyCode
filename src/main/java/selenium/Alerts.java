package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert al= driver.switchTo().alert();
		String txt= al.getText();
		if (txt.contains("JS Alert"))
		{
			System.out.print("Alert verified");
			al.accept();
		}
		else
		{
			System.out.print("Alert not verified");
		}
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert al1= driver.switchTo().alert();
		String txt1= al1.getText();
		al1.dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert al2=driver.switchTo().alert();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.alertIsPresent()).sendKeys("Hello jjjj");
		/*
		 * String txt2= al2.getText(); System.out.println(txt2);
		 */
		Thread.sleep(3000);
		al2.sendKeys("Hello");
		Robot rb = new Robot();
		  //First set the username value to the system clipboard
		  StringSelection username = new StringSelection("your-user-name");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null); 
		  // Perform a control+v to paste the content into username field.           
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_CONTROL);

		  //tab to navigate to password field
		  rb.keyPress(KeyEvent.VK_TAB);
		  rb.keyRelease(KeyEvent.VK_TAB);
		  Thread.sleep(2000);
		  al2.accept();



   


		/*
		 * List<WebElement>
		 * ul=driver.findElements(By.xpath("//ul[contains(@class,'autocomplete')]//div")
		 * ); for(WebElement el:ul) {
		 * 
		 * System.out.println(el.getText());
		 * if(el.getText().equalsIgnoreCase("ColdFusion")) { el.click(); break; } }
		 */
		
		
		
		

	}

}
