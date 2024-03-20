package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		List<WebElement>dates= driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//a"));
		for(WebElement ele:dates)
		{
			String desdate=ele.getText();
			if(desdate.equalsIgnoreCase("25"))
			{
				ele.click();
				break;
			}
		}
	}

}
