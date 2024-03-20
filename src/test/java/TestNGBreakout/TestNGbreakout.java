package TestNGBreakout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import selenium.Utility;

public class TestNGbreakout {
	static WebDriver driver;
	String categoryName;
	String newCategoryName;
	WebDriverWait wait;
	WebElement element;
	@BeforeClass
	public  void setup() throws FileNotFoundException
	{
		System.out.println("Running Before Class-Setting up Browser");
		driver=Utility.startBrowser("chrome","https://freelance-learn-automation.vercel.app/signup");
		System.out.println("Browser is up and Running");
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl().contains("signup"),"signup");
	    sa.assertTrue(driver.findElement(By.xpath("//*[@class='submit-btn']")).isEnabled());
			/****************/
	   
	  
	}
	@Test(dataProvider="Registrationdata",dataProviderClass=TestNGbreakout.class)
	public void test1(String Name,String EmailId,String Password,String Interests,String Gender,String State,String Hobbies,int rowCount,int column) throws InterruptedException
	{
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<column;j++)
			{
				
		driver.findElement(By.id("name")).sendKeys(Name);
	
		driver.findElement(By.id("email")).sendKeys(EmailId);
		
		driver.findElement(By.id("password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//label[text()='"+Interests+"']/preceding::input[1]")).click();
		
		driver.findElement(By.xpath("//label[text()='"+Gender+"']/preceding::input[1]")).click();
		
		WebElement state1=driver.findElement(By.name("state"));
		Select statesel=new Select(state1);
		statesel.selectByVisibleText(State);
		
		WebElement hobbies=driver.findElement(By.id("hobbies"));
		Select hobby=new Select(hobbies);
		hobby.selectByVisibleText(Hobbies);
		
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
			}
		}
	}
	@DataProvider(name="Registrationdata")/**/

	public static Object[][] getDataFromExcel() throws FileNotFoundException
	{
		
		 FileInputStream fis=new FileInputStream(new File("./Testdata/testdata1.xlsx"));
		 XSSFWorkbook wb= new XSSFWorkbook();
		 XSSFSheet ws= wb.getSheet("Sheet1");
		int rowCount=wb.getSheet("Sheet1").getPhysicalNumberOfRows();
		int column=ws.getRow(rowCount).getPhysicalNumberOfCells();
		Object[][] arr=new Object[rowCount-1][column];
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<column;j++)
			{
				String value="";
				Cell cell =wb.getSheet("Sheet1").getRow(i).getCell(j);
				// Cell cell = wb.getSheet("sample").getRow(i).getCell(j);
			       
				
				if(cell.getCellType()==CellType.NUMERIC)
				{
					value=String.valueOf(wb.getSheet("Sheet1").getRow(i).getCell(j).getNumericCellValue());
				}
				else if(cell.getCellType()==CellType.STRING)
				{
					value=wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				}
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					value=String.valueOf(wb.getSheet("Sheet1").getRow(i).getCell(j).getBooleanCellValue());
				}
				else if(cell.getCellType()==CellType.BLANK)
				{
					value="";
				}
				
			arr[i-1][j]=value;
			}
		}
		return arr;
		 
	}

}
