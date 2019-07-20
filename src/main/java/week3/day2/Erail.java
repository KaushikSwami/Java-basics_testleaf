package week3.day2;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Erail {

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
		 * WebElement table = driver.findElement(By.
		 * xpath("//table[@class='DataTable TrainList TrainListHeader']")); //All Row
		 * List<WebElement> rows = table.findElements(By.tagName("tr"));
		 * System.out.println("total rows are : " + rows.size()); //First Row WebElement
		 * firstRow = rows.get(0);
		 */
		
		//All columns
		
		List<WebElement> train = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		
		int size = train.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			System.out.println(train.get(i).getText());
			
		}
		
		WebElement sort_train = driver.findElement(By.xpath("//a[@title='Click here to sort on Train Number']"));
		sort_train.click();
		
		System.out.println("after sorting o/p as below");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(sort_train));
		
		

		
		for(int i=0;i<size;i++)
		{
			System.out.println(train.get(i).getText());
			
		}
	
		
	
		
	}
}
	


