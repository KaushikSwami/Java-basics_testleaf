package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_Login {

	public static void main(String[] args) throws InterruptedException {

		
		

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.flipkart.com/");
			

			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			WebElement close_button = driver.findElementByXPath("//button[text()='✕']");
			close_button.click();
			
			WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
			
			Actions a=new Actions(driver);
			a.moveToElement(electronics).perform();
			
			WebElement mi = driver.findElementByXPath("//a[text()='Mi']");
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(mi));
			mi.click();
			
			WebElement mi_mobiles = driver.findElementByXPath("//h1[text()='Mi Mobiles']");
			String text = mi_mobiles.getText();
			System.out.println(text);
			
			List<WebElement> listOfNames = driver.findElementsByClassName("_3wU53n");
//			int size = listOfNames.size();
			
			for (WebElement allmobileNames : listOfNames) {
				//System.out.print("the mobiles present in MI are : ");
				
				System.out.println( allmobileNames.getText());
				
			}
			
			List<WebElement> rate_mobiles = driver.findElementsByXPath("//div[@class='_1uv9Cb']/div");
			for (WebElement cost : rate_mobiles) {
				System.out.println(cost.getText());
			}
			
			driver.close();
			
			
			
		}
		
	}
	


