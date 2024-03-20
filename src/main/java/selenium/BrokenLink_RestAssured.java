package selenium;

import java.io.IOException;
import java.net.URL;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BrokenLink_RestAssured {

	public static void main(String[] args) throws IOException {
		WebDriver driver=Utility.startBrowser("https://www.yahoo.com/");
		List<WebElement> ll=driver.findElements(By.xpath("//a"));
		ll.addAll(driver.findElements(By.tagName("img")));
		List<WebElement> activelinks=new ArrayList<WebElement>();
		System.out.println(ll.size());
		for(int i=0;i<ll.size();i++)
		{
			if(ll.get(i).getAttribute("href")!=null)
			{
			//System.out.println(ll.get(i).getAttribute("href"));
				activelinks.add(ll.get(i));
				
		}
			
		}
		System.out.println("Updated"+activelinks.size());
		for(int i=0;i<activelinks.size();i++)
		{
			String al=activelinks.get(i).getAttribute("href");
			/*
			 * URL urllink=new URL(al); int Responsecode; urllink.openConnection();
			 */
			Response resp=RestAssured.get(al);
			
			int code=resp.statusCode();
			
			System.out.println("URLs: "+resp+": "+code);
		
			
			
		}
			
		}
		{
			}
	
}