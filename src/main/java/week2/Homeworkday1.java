package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homeworkday1 {

	public static void main(String[] args) throws InterruptedException {
		//set property for chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		int count = 0;
		
		//Launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Navigate to google
		driver.get("https://www.google.co.in");
		
		//Enter Harikrishnan in google search box
		driver.findElementById("lst-ib").sendKeys("Harikrishnan");		
		
		//Click google search
		driver.findElementByClassName("sbico").click();
		
		Thread.sleep(3000);
		
		//Find webelements by tag name
		List <WebElement> iterative = driver.findElementsByTagName("a");
		
		System.out.println("No of links in the page:"+ iterative.size());
		
		for (WebElement iterative1 : iterative) {
			if (iterative1.getText().contains("Harikrishnan")){
				
				count++;
			}
					
		}
		
		System.out.println("No of links contains my name:" + count);
		
		}

}
