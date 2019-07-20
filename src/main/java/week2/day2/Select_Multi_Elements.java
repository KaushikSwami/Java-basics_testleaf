package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Multi_Elements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		
		Actions builder=new Actions(driver);
	    builder.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).keyUp(Keys.CONTROL).perform();
		//builder.clickAndHold(item3).release().perform();
		builder.clickAndHold(item1).clickAndHold(item2).clickAndHold(item3).release().perform();

		
	}
	

}
