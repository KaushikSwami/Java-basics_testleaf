package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		
		WebElement drag_Element = driver.findElementById("draggable");
		Actions builder =new Actions(driver);
		builder.dragAndDropBy(drag_Element, 100, 100).perform();
	}

}
