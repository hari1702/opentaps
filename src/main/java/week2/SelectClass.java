package week2;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// Set system property for chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Navigate to IRCTC site
		driver.get("https://www.irctc.co.in");
		
		//click sign up link
		driver.findElementByLinkText("Sign up").click();
		
		//create collects for Nationality
		WebElement se = driver.findElementById("userRegistrationForm:nationalityId");
		
		Select dropdown = new Select(se);
		
		System.out.println("No of options in drop down:" +dropdown.getOptions().size());
		
		List <WebElement> options = dropdown.getOptions();
		
		for (WebElement option : options) {
			
			System.out.println(option.getText());
			
		}

	}

}
