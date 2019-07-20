package ProjectDay1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_project {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement close_button = driver.findElementByXPath("//button[text()='✕']");
		close_button.click();
		
		
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		Actions a =new Actions(driver);
		a.moveToElement(electronics).perform();
		
		WebElement mi = driver.findElementByXPath("(//a[text()='Mi'])[1]");
		mi.click();
		
		List<WebElement> mobile_names = driver.findElementsByXPath("(//div[@class='col col-7-12']/div)[1]");
		int mobile_size = mobile_names.size();
		
		
		WebElement mobile_price = driver.findElementByXPath("(//div[@class='_1uv9Cb']/div)[1]");
		
		Map<String,Integer>full_details=new HashMap<String, Integer>();
		
		for(int i=1;i<mobile_size;i++)
		{
			 String m_names = driver.findElementByXPath("(//div[@class='col col-7-12']/div)[1]").getText();
			 String m_cost = driver.findElementByXPath("(//div[@class='_1uv9Cb']/div)[1]").getText();
			 
			 int rate = Integer.parseInt(m_cost.replaceAll("\\D", ""));
			 full_details.put(m_names,rate);
			 System.out.println(full_details);
		}
		
		
	}

}
