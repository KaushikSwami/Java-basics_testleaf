package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		//driver..findElementById("ext-gen589").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("AMAZON");
		driver.findElementById("createLeadForm_firstName").sendKeys("venkatesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("swaminathan");
		/*
		 * driver.findElementByClassName("smallSubmit").click(); driver.close();
		 */
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select s=new Select(source);
		s.selectByVisibleText("Employee");
		
		
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select s1=new Select(market);
		List<WebElement> options = s1.getOptions();
		int size = options.size();
		String text = options.get(size-2).getText();
		System.out.println(text);
		
		WebElement Createlead = driver.findElementByXPath("//input[@name='submitButton']");
		Createlead.click();
		 
		 String text2 = driver.findElementById("viewLead_companyName_sp").getText();
		 System.out.println(text2);
		 
		 String text3 = text2.replaceAll("\\D", "");
		 System.out.println(text3);
		 
		 driver.findElementByLinkText("Delete").click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElementByLinkText("Find Leads").click();
		 //driver.findElementByXPath("//button[text()='Find Leads']").click();	
		 
		 driver.findElementByXPath("//input[@name='id']").sendKeys(text3);
		 
		 driver.findElementByXPath("//button[text()='Find Leads']").click();	
		 
		
		 
		
		
		
		
		
	}

}
