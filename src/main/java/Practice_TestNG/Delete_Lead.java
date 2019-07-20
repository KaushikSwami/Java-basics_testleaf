package Practice_TestNG;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.Read_Excel;

public class Delete_Lead extends Base_Execution {
	
	@Test(priority=2)
	public void delete_lead() throws InterruptedException
	{
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone1']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Delete").click();
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
		return Read_Excel.read_data("testdata");
		
	}

}
