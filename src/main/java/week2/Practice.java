package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		//Set property for Chrome
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//Launch chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize screen
		driver.manage().window().maximize();
		
		//Navigate URL
		driver.get("https://www.google.co.in");		
		
		//Find number of links
		 List <WebElement> google = driver.findElementsByTagName("a");
		 System.out.println("Number of links" +  google.size());
		
		//printing link text
		//for (WebElement google1 : google) {
		// System.out.println("Text of links"+ google1.getText());
			 
		//Additonal checks
			for (WebElement google2 : google) {
				if(google2.getText().contains("c") && (google2.getLocation().getX()>50) && (google2.getSize().getWidth()>20)){
							System.out.println("Link Text"+ google2.getText());
			                google2.click();
			                break;
							}
	}
	
}
}
