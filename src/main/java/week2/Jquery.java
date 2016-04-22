package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery {

	public static void main(String[] args) {
		// Set system property for chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Navigate to url
		driver.get("http://jqueryui.com/");
		
		//Click on draggable
		driver.findElementByLinkText("Draggable").click();
		
		//Entering in to iframe
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		//Get the text inside the frame
		System.out.println("Text available inside the frame:"+ driver.findElementById("draggable").getText());
		
		//Go to default frame
		driver.switchTo().defaultContent();
		
		//Click on Droppable
		driver.findElementByLinkText("Droppable").click();
	}

}
