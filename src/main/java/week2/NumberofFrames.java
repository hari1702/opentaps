package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberofFrames {

	public static void main(String[] args) throws InterruptedException {
		
		//Set property for Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch Chrome
	    ChromeDriver driver = new ChromeDriver();
	    
	    //Maximize
	    driver.manage().window().maximize();
	    
	    //Launch URL
	    driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
	    
	    //Count number of Frames, creating collections
	    List <WebElement> frames = driver.findElementsByTagName("iframe");
		System.out.println("No of parent iFrames:"+frames.size());
		
		int count = frames.size();
				
		for (WebElement frame : frames) {
			
			driver.switchTo().frame(frame);
			
			List <WebElement> innerframes = driver.findElementsByTagName("iframe");
				
			System.out.println("No of Child iFrames in each Parent iFrame:"+innerframes.size());
			
			count = count+innerframes.size();
			
			driver.switchTo().defaultContent();
			
		}	
		
		System.out.println("Total no of Parent and Child iFrames:"+count);
	
	}
}