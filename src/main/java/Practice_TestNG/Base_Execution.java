package Practice_TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.Read_Excel;

public class Base_Execution {
	
	public String workbookname;
	ChromeDriver driver;
	@Parameters({"username","password"})
	@BeforeMethod
	public void login(String uName,String pwd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(pwd);
		WebElement submit = driver.findElementByClassName("decorativeSubmit");
		submit.click();
		WebElement crmsfa = driver.findElementByLinkText("CRM/SFA");
		crmsfa.click();
		
		WebElement leads = driver.findElementByLinkText("Leads");
		leads.click();
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

	@DataProvider(name="fetchdata")
	public String[][] getData() throws IOException
	{
//		String[][] data=new String[2][3];
//		data[0][0]="amazon";
//		data[0][1]="venkat";
//		data[0][2]="s";
//		
//		data[1][0]="amazon";
//		data[1][1]="ram";
//		data[1][2]="s";
		return Read_Excel.read_data(workbookname);
	}
	
}
