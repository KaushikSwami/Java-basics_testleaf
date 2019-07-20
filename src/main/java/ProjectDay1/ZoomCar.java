package ProjectDay1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {
  
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement search = driver.findElementByXPath("//a[@class='search']");
		search.click();

		WebElement place = driver.findElementByXPath("//div[contains(text(),' Nelson Manickam Road')]");
		place.click();

		WebElement next = driver.findElementByXPath("//button[@class='proceed']");
		next.click();

		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);

		int tomorrow = Integer.parseInt(today) + 1;
		System.out.println("tomorrow's date : " + tomorrow);

		WebElement today_date = driver.findElementByXPath("//div[@class='day picked full']");
		System.out.println("today's date is : " + today_date.getText());

		WebElement actual_date = driver.findElementByXPath("//div[contains(text()," + tomorrow + ")]");
		actual_date.click();
		next.click();
		next.click();

		List<WebElement> priceList = driver.findElementsByXPath("//div[@class='price']");

//		List<WebElement> pp_ll = driver.findElementsByXPath("//div[@class='car-item']");

//		List<Integer> price=new ArrayList<>();

		Map<String, Integer> full_details = new HashMap<>();
		List<WebElement> car_name = driver.findElementsByXPath("//div[@class='details']/h3");
		int size = car_name.size();
		for (int i = 1; i <= size; i++) {
			String carName = driver.findElementByXPath("(//div[@class='details']/h3)[" + i + "]").getText();

			for (WebElement p_list : priceList) {

				System.out.println(p_list.getText().replaceAll("\\D", ""));
				int rate = Integer.parseInt(p_list.getText().replaceAll("\\D", ""));
				full_details.put(carName, rate);
			}

			 List<Integer> value_1=new ArrayList<>();
			
			  
			  Set<Entry<String, Integer>> entrySet = full_details.entrySet();
			  
			  for (Entry<String, Integer> entry : entrySet) { 
				  Integer value = entry.getValue();
				  value_1.add(value);
				  
			  
			  }
			  for (Entry<String, Integer> entry1 : entrySet) { 
				 if(entry1.getValue()==Collections.max(value_1)) {
					 
				 }
				 System.out.println(entry1.getKey()+" -->"+entry1.getValue());
				  
			  
			  }
			  
			  
			 
		}

	}

}
