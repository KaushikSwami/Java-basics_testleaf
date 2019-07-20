package SeleniumAllData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			/*
			 * WebDriver is an Interface which extends SearchContext public interface
			 * SearchContext contains two unimplemented methods List<WebElement>
			 * findElements(By by); 
			 * WebElement findElement(By by);
			 */

			WebDriver driver=new ChromeDriver();
			driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
			driver.manage().window().maximize();
			
			WebElement sourceelement_1 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
			WebElement destination = driver.findElement(By.id("trash"));
			
			Actions a=new Actions(driver);
            a.dragAndDropBy(sourceelement_1, 200, 250);	

	}

}
