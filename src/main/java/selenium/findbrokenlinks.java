package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.mail.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findbrokenlinks {

	public static void main(String[] args) throws EmailException  {
		WebDriver driver=Utility.startBrowser("https://www.yahoo.com/");
		List<WebElement> alllinks= driver.findElements(By.tagName("a"));
		alllinks.addAll(driver.findElements(By.tagName("img")));
		List<WebElement> activelinks=new ArrayList<WebElement>();
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++)
		{
			System.out.println(alllinks.get(i).getAttribute("href"));
			if(alllinks.get(i).getAttribute("href")!=null)
			{
				activelinks.add(alllinks.get(i));
			}
			
		}
		System.out.println("All Active Links: "+activelinks.size() );
		
		for(int j=0;j<activelinks.size();j++)
		{
		try {
			HttpURLConnection connection	=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			if(response.contains("OK"))
		
			{
				System.out.println("Pass: "+activelinks.get(j).getAttribute("href")+"------>"+response);
			}
			else
			{
				System.out.println("Test---------------------");
				Email email = new SimpleEmail();
				email.setHostName("smtp.gmail.com");
				email.setSmtpPort(465);
				email.setSSLOnConnect(true);
				email.setAuthenticator(new DefaultAuthenticator("saranyav.cse@gmail.com", "kgql wrfe nqyg vpep"));
				
				email.setSSLOnConnect(true);
				email.setFrom("saranyav.cse@gmail.com");
				email.setSubject("TestMail");
				email.setMsg("This is a test mail ... :-)");
				email.addTo("saranyav.cse@gmail.com");
			
				email.send();
				
				
				System.out.println("Fail: "+activelinks.get(j).getAttribute("href")+"------>"+response);
			}
			
		} catch (MalformedURLException e) {
			
			System.out.println("Malformed URL"+e.getMessage());
			;
		} catch (IOException e) {
			
			System.out.println("IO Exception"+e.getMessage());
		}
			
		}
	}

}
