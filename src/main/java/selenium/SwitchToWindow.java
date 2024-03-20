package selenium;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToWindow {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
Utility ul= new Utility();
WebDriver driver= ul.startBrowser("https://freelance-learn-automation.vercel.app/login");

String parentWindow= driver.getWindowHandle();
System.out.println("Parent Window Handle"+parentWindow);

List<WebElement>allwindows1=driver.findElements(By.xpath("//div[@class='social']//div//a"));

for(WebElement handle :allwindows1)
{
	handle.click();
}

Set<String >allwindows=driver.getWindowHandles();
Iterator itr= allwindows.iterator();
while(itr.hasNext())
{
	String child=(String) itr.next();
	if(!(parentWindow==child))
	{
		driver.switchTo().window(child);
		System.out.println(driver.switchTo().window(child).getTitle());

		driver.close();
	}
}
driver.switchTo().window(parentWindow);
	}

}

