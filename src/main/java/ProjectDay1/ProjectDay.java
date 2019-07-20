package ProjectDay1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

public class ProjectDay {

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

		driver.findElementByXPath("//div[contains(text()," + tomorrow + ")]").click();
		next.click();
		next.click();

		driver.findElementByXPath("//a[@class='close']").click();
		Map<String, Integer> fullDetails = new HashMap<String, Integer>();
		List<WebElement> car_name = driver.findElementsByXPath("//div[@class='details']/h3");
		int size = car_name.size();
		for (int i = 1; i <= size; i++) {
			String carName = driver.findElementByXPath("(//div[@class='details']/h3)[" + i + "]").getText();
			String price = driver.findElementByXPath("(//div[@class='price'])[" + i + "]").getText();

			int rate = Integer.parseInt(price.replaceAll("\\D", ""));
			fullDetails.put(carName, rate);

		}
		List<Integer> value_1 = new ArrayList<Integer>();

		Set<Entry<String, Integer>> entrySet = fullDetails.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			value_1.add(value);

		}

		for (Entry<String, Integer> entry1 : entrySet) {
			if (entry1.getValue() == Collections.max(value_1)) {
				System.out.println(entry1.getKey() + " --> Rs" + entry1.getValue());
			}

		}

	}

}