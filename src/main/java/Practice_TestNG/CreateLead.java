package Practice_TestNG;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.Read_Excel;

public class CreateLead extends Base_Execution {

	@BeforeClass
	public void data()
	{
		workbookname="testdata";
	}
	@Test(invocationCount=2,dataProvider="fetchdata")
	public void create_lead(String cName,String fName,String lName) throws InterruptedException
	{
		
		WebElement create_lead = driver.findElementByLinkText("Create Lead");
		create_lead.click();
		
		WebElement company = driver.findElementById("createLeadForm_companyName");   
		company.sendKeys(cName);
		WebElement first_name = driver.findElementById("createLeadForm_firstName");
		first_name.sendKeys(fName);
		WebElement second_name = driver.findElementById("createLeadForm_lastName");
		second_name.sendKeys(lName);
		
		WebElement create_lead_button = driver.findElementByXPath("//input[@value='Create Lead']");
		create_lead_button.click();
		
		String text2 = driver.findElementById("viewLead_companyName_sp").getText();
		 System.out.println(text2);
		 
		 String text3 = text2.replaceAll("\\D", "");
		 System.out.println(text3);
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
