package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://hugelearning.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		creating a webelement for the frame
		
		WebElement frame1 = driver.findElementById("IFrame1");
		
//		using .switchTo() to switch to the frame
		
		driver.switchTo().frame(frame1);
		
		Thread.sleep(2000);
		WebElement first_name = driver.findElementByName("First_Name");
		Thread.sleep(2000);
		first_name.sendKeys("kaushik");
		
//		using .defaultContent() to move back to the original frame 
		
		driver.switchTo().defaultContent();
		WebElement blog = driver.findElementByXPath("//a[text()='Blog']");
		blog.click();
		
	}

}
