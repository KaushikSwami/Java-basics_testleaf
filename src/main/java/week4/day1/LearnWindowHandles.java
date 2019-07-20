package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement contact_us = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		System.out.println(driver.getTitle());

		contact_us.click();
		
		/*
		 * Window handling code base
		 *///		String windowHandle = driver.getWindowHandle();
		Set<String> all_windows = driver.getWindowHandles();
		
		List<String> listofwindows=new ArrayList<>(all_windows);
		driver.switchTo().window(listofwindows.get(1));
		driver.switchTo().window("abc");
		System.out.println(driver.getTitle());
		
	
		
		
		
		
		
		
	}

}
