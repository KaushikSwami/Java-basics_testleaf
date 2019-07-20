package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String window = driver.getWindowHandle();
		
		WebElement follow_twitter = driver.findElementByXPath("//a[@title='Follow @seleniumeasy on Twitter']");
		follow_twitter.click();
		
//		.getWindowHandles() are collection of multiple window references which returns a set
		
		Set<String> windows = driver.getWindowHandles();
		
//		now since set will not have get method so we convert set to list as below
		
		List<String>allwindows=new ArrayList<>(windows);
		
//		switching to the new window
		
		driver.switchTo().window(allwindows.get(1));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement username = driver.findElementByName("session[username_or_email]");
		username.sendKeys("kaushik");
		
		driver.switchTo().defaultContent();
		
		System.out.println("back to : " + driver.getTitle());
		
//		WebElement facebook = driver.findElementByXPath("//a[text()='  Like us On Facebook ']");
//		facebook.click();

	}

}
