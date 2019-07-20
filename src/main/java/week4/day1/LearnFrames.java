package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement frame_click = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame(frame_click);
		
		WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
		Thread.sleep(2000);
		tryIt.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("venkatesh");
		alert.accept();
		
		WebElement text = driver.findElement(By.id("demo"));
		System.out.println(text.getText());
		
		

	}

}
