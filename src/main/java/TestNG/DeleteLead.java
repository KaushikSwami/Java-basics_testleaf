package TestNG;

import org.testng.annotations.Test;

public class DeleteLead extends Base_class{
	@Test
	public void delete_lead()
	{
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}

}
