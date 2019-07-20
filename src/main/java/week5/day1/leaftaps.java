package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class leaftaps {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		WebElement submit = driver.findElementByClassName("decorativeSubmit");
		submit.click();
		WebElement crmsfa = driver.findElementByLinkText("CRM/SFA");
		crmsfa.click();
		
		WebElement leads = driver.findElementByLinkText("Leads");
		leads.click();
		
		//create lead
		WebElement create_lead = driver.findElementByLinkText("Create Lead");
		create_lead.click();
		
		WebElement company = driver.findElementById("createLeadForm_companyName");   
		company.sendKeys("AMAZON");
		WebElement first_name = driver.findElementById("createLeadForm_firstName");
		first_name.sendKeys("venkatesh");
		WebElement second_name = driver.findElementById("createLeadForm_lastName");
		second_name.sendKeys("swaminathan");
		
		WebElement create_lead_button = driver.findElementByXPath("//input[@value='Create Lead']");
		create_lead_button.click();
		
		String text2 = driver.findElementById("viewLead_companyName_sp").getText();
		 System.out.println(text2);
		 
		 String text3 = text2.replaceAll("\\D", "");
		 System.out.println(text3);
		
		// merge leads
		WebElement merge_lead = driver.findElementByLinkText("Merge Leads");
		merge_lead.click();
		Thread.sleep(2000);
		WebElement icon1 = driver.findElementByXPath("(//img[@alt='Lookup'])[1]");
		icon1.click();
		Thread.sleep(2000);
		
		Set<String> windows = driver.getWindowHandles();
		List<String>allwindows=new ArrayList<>(windows);
		
		
		driver.switchTo().window(allwindows.get(1));
		
		System.out.println(driver.getTitle());
		
		WebElement findID = driver.findElementByXPath("//input[@name='id']");
		findID.sendKeys(text3);
		
		WebElement find_leads = driver.findElementByXPath("//button[text()='Find Leads']");
		find_leads.click();
		Thread.sleep(1000);
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		WebElement lead_ID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		lead_ID.click();
		driver.switchTo().window(allwindows.get(0));
		
		WebElement icon2 = driver.findElementByXPath("(//img[@alt='Lookup'])[2]");
		icon2.click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		WebElement first_name_1 = driver.findElementByXPath("//input[@name='firstName']");
		first_name_1.sendKeys("vekatesh");
		find_leads.click();
		Thread.sleep(1000);
		lead_ID.click();
		driver.switchTo().window(allhandles2.get(0));
		WebElement merge = driver.findElementByXPath("//a[text()='Merge']");
		merge.click();
		driver.switchTo().alert().accept();
		find_leads.click();
		
		
		
		
		
		
	}

}
