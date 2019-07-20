package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement source_1 = driver.findElementByXPath("//span[text()='Draggable 1']");
		WebElement source_2 = driver.findElementByXPath("//span[text()='Draggable 2']");
		WebElement source_3 = driver.findElementByXPath("//span[text()='Draggable 3']");
		
		WebElement target = driver.findElementById("mydropzone");
		//WebElement destination = driver.findElementByXPath("//div[@dropzone='move']");
		
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.dragAndDrop(source_1,target).perform();
		Thread.sleep(1000);
		a.dragAndDrop(source_2,target).perform();
		Thread.sleep(1000);
		a.dragAndDrop(source_3,target).perform();


	}

}
