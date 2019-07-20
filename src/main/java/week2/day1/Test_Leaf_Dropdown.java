package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Leaf_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		// xpath //tag[@attribute='value']

		   WebElement drop_down1 = driver.findElementByXPath("//select[@id='dropdown1']");
		//List<WebElement> dropList = driver.findElementsByXPath("//select[@id='dropdown1']");

		//WebElement drop_down1 = driver.findElementById("dropdown1");
		Select s1=new Select(drop_down1);
		List<WebElement> list = s1.getOptions();

		int size = s1.getOptions().size();
		 
		 
		 for(int i=0;i<size;i++) 
		 {
		  System.out.println(drop_down1.getText()); 
		  break; 
		 }




		/*
		* for (WebElement webElement : list)
		*  {
		* System.out.println(webElement.getText());
		*  }
		*/

		//s1.selectByVisibleText("Appium");
		// s1.selectByValue("4");
		s1.selectByIndex(1);

		
		
	}

}
