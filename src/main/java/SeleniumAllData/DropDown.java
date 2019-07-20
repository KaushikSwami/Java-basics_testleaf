package SeleniumAllData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

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
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		/*
		 * Select class to select the drop down We can select the drop down using 3
		 * different types as below
		 */
		
    	Select s=new Select(dropdown);
    	
		/*
		 * s.selectByVisibleText("Apps & Games");
		 * s.selectByValue("search-alias=appliances");
		 * s.selectByIndex(6);
		 */
    	
		System.out.println("done");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

}
