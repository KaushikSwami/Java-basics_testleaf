package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement click_1 = driver.findElementByXPath("//button[@onclick='myAlertFunction()']");
		click_1.click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		WebElement click_2 = driver.findElementByXPath("//button[@onclick='myConfirmFunction()']");
		click_2.click();
		Thread.sleep(4000);
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		
		WebElement click_3 = driver.findElementByXPath("//button[@onclick='myPromptFunction()']");
		click_3.click();
		Thread.sleep(4000);
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("venkatesh");
		alert3.accept();
		WebElement demo = driver.findElementById("prompt-demo");
		System.out.println(demo.getText());

		


		
		
	}

}
