package Practice_TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Merge_Lead extends Base_Execution{

	@Test(priority=1)
	public void merge_lead() throws InterruptedException
	{
		
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
		findID.sendKeys("1244");
		
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
