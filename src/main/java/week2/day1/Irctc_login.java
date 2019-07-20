package week2.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc_login {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='userRegistrationForm:userName']").sendKeys("pubgvenkat");
		driver.findElementByXPath("//input[@type='password']").sendKeys("abc123");
		driver.findElementByXPath("//input[@id='userRegistrationForm:confpasword']").sendKeys("abc123");
		
		WebElement security_question = driver.findElementByXPath("//select[@id='userRegistrationForm:securityQ']");
		Select s=new Select(security_question);
		s.selectByVisibleText("What is your all time favorite sports team?");
		//s.selectByValue("3");
		//s.selectByIndex(3);
		
		List<WebElement>  security_question_allOptions = s.getOptions(); 
		int size = security_question_allOptions.size();
		String text = security_question_allOptions.get(size-3).getText(); 
		System.out.println(text);
		
		
		//WebElement radio_gender_button = driver.findElementByXPath("//input[@value='M']");
		//radio_gender_button.click();
		List<WebElement> Gender_Button = driver.findElementsByName("userRegistrationForm:gender");
		for (WebElement all_Buttons : Gender_Button) {
			Thread.sleep(2000);
			all_Buttons.click();
		}
		WebElement radio_marital_status = driver.findElementByXPath("//input[@value='U']");
		radio_marital_status.click();
		
		WebElement DOB_day = driver.findElementById("userRegistrationForm:dobDay");
		Select s_0=new Select(DOB_day);
		s_0.selectByVisibleText("24");
		
		WebElement DOB_month = driver.findElementById("userRegistrationForm:dobMonth");
		Select s_1=new Select(DOB_month);
		s_1.selectByValue("06");
		
		WebElement DOB_year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select s_2=new Select(DOB_year);
		s_2.selectByIndex(10);
		
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select s1=new Select(occupation);
		List<WebElement> elementsInOccupation = s1.getOptions();
		
		for (WebElement webElement : elementsInOccupation)
		{
			
			System.out.println( webElement.getText());
		}
		
		s1.selectByVisibleText("SelfEmployed");
		
		WebElement country_selection = driver.findElementById("userRegistrationForm:countries");
		Select s_3=new Select(country_selection);
		s_3.selectByValue("94");
		
		WebElement nationality_selection = driver.findElementById("userRegistrationForm:nationalityId");
		Select s_4=new Select(nationality_selection);
		s_4.selectByVisibleText("India");
		
		WebElement pincode = driver.findElementByXPath("//input[@id='userRegistrationForm:pincode']");
		pincode.sendKeys("621216",Keys.TAB);
		WebElement state = driver.findElementById("userRegistrationForm:statesName");
		String state_name = state.getText();
		System.out.println("the state is : " + state_name); // not working
		
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select s_5=new Select(city);
		List<WebElement> options_1 = s_5.getOptions();
		options_1.get(1).click();
		
		WebElement taluk = driver.findElementById("userRegistrationForm:postofficeName");
		Select s_6=new Select(taluk);
		List<WebElement> options_2 = s_6.getOptions();
		
		
		
		
		
		/*
		 * List<WebElement> allOptions = s.getOptions(); 
		 * int size = allOptions.size();
		 * String text = allOptions.get(size).getText(); System.out.println(text);
		 */
		
		
	}

}
