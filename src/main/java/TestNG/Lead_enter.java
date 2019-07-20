package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lead_enter extends Base_class{
	
	@Test
	public void createlead()
	{
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		
	}

}
