package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail_1 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MS",Keys.TAB);
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("tpj",Keys.TAB);
		WebElement checkBox = driver.findElement(By.id("chkSelectDateOnly"));
		checkBox.click();
		
		/*
		 * WebElement sort_train = driver.findElement(By.
		 * xpath("//a[@title='Click here to sort on Train Number']"));
		 * sort_train.click();
		 */
		
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		
		System.out.println(rowCount.size());
		
		/*
		 * for (int i = 1; i <rowCount.size()-1; i++) {
		 * 
		 * WebElement text = driver.findElement(By.
		 * xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[\\\\\\\"+i+\\\\\\\"]/td\\\\\\"
		 * )); System.out.println(text); }
		 */
	}

}
