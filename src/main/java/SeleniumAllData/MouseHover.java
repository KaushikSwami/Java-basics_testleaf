package SeleniumAllData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		/*
		 * WebDriver is an Interface which extends SearchContext public interface
		 * SearchContext contains two unimplemented methods List<WebElement>
		 * findElements(By by); 
		 * WebElement findElement(By by);
		 */

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement hover_element = driver.findElement(By.id("nav-link-accountList"));
		
		/*
		 * To hover onto the elements we can use the Actions class as below
		 */		
		
		Actions a=new Actions(driver);
		a.moveToElement(hover_element).perform();
	}

}
