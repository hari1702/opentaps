package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseFrames {

	public static void main(String[] args) {
		
		//Set property for Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch Chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Navigate to URL
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		
		//To close outer East and West frames using tag button

		List <WebElement> allbuttons = driver.findElementsByTagName("button");
		
	    for (WebElement closebutton : allbuttons) {
	    	
	    	if(closebutton.getText().equals("Close Me"))
	    		
	    		closebutton.click();
			
		}
	
	    //To close outer North and South frames
	    driver.findElementByXPath("/html/body/div[6]/div").click();
	    driver.findElementByXPath("/html/body/div[5]/div").click();	 
	    
	    //Move to inner frame
	    driver.switchTo().frame("childIframe");
	    
	    //To close inner North and South frames
	    driver.findElementByXPath("/html/body/div[6]/div").click();
	    driver.findElementByXPath("/html/body/div[7]/div").click();
	    
	    //To close inner North and South frames using button tag
	    
	    List <WebElement> allbuttons1 = driver.findElementsByTagName("button");
	    
	    
	    for (WebElement closebutton1 : allbuttons1) {

	    	if(closebutton1.getText().equals("Close Me"))
	    		
	    		closebutton1.click();	    	
			
		}

	}

}
