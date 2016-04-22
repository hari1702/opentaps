package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameSearchGoogle {

	public static void main(String[] args) throws InterruptedException {
		//setting system property for chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Lauching chrome
		ChromeDriver driver = new ChromeDriver();
		
        //Maximize window
		driver.manage().window().maximize();
		
		//Navigating to Google
		driver.get("https://www.google.co.in");
		
		//Entering Harikrishnan in serach tab
		driver.findElementById("lst-ib").sendKeys("Harikrishnan");
		
		//Click Search
		driver.findElementByClassName("sbico").click();
		
		//Sleep to load the page
		Thread.sleep(5000);
		
		//Create list collections
		List <WebElement> link = driver.findElementsByTagName("a");
		System.out.println("No of link:"+link.size());
		
		for (WebElement Hari : link) {
			
			if((Hari.getText().contains("harikrishnan")) || (Hari.getText().contains("HARIKRISHNAN")) && 
					(Hari.getLocation().x>100) && (Hari.getAttribute("data-href").length()>20))
				
				System.out.println("Links that met our condition:"+Hari.getText());
		}
	}

}
