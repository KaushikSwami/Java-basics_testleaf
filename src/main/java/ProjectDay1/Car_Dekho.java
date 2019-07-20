package ProjectDay1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Car_Dekho {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.cardekho.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement by_brand = driver.findElementByXPath("//i[text()='By Brand']");
		by_brand.click();
		
		WebElement bybrand = driver.findElementById("bmvBrand");
		bybrand.click();
//		
		
		 WebElement hyundai_cars = driver.findElementByXPath("//li[text()=' Hyundai']");
		 hyundai_cars.click();
		 
		 WebElement model_id = driver.findElementById("bmvModel");
		 model_id.click();
		 
		 WebElement i20_car = driver.findElementByXPath("//li[@data-value='Elite i20']");
		 i20_car.click();
		 

	}

}
