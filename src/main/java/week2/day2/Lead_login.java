package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lead_login {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(3000);
		
		WebElement create_lead = driver.findElementByLinkText("Create Lead");
		create_lead.click();
		
		WebElement company_name = driver.findElementById("createLeadForm_companyName");
		company_name.sendKeys("amazon");
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("10367");
		Thread.sleep(3000);
		WebElement id_tab = driver.findElementByXPath("//input[@name='id']");
		String id = id_tab.getAttribute("value");
		System.out.println(id);
		
        driver.findElementByXPath("//button[text()='Find Leads']").click();		
		 //WebElement company_name = driver.findElementById("viewLead_companyName_sp");
        
        driver.findElementByXPath("//class[text()='10367']").click();
		
	}

}

