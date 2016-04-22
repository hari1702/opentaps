package week2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTest {

	public static void main(String[] args) {
		// set system property for chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Lauch chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Navigate to URL
		driver.get("http://popuptest.com");
		
	    //click on specified link
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		
		//Get windowhandle of parent window to use in foreach loop
		String parentwindow = driver.getWindowHandle();
		
		//get windowhandles of all windows
		Set <String> sessions = driver.getWindowHandles();
		
		//Spin through all session ids to check if it is child window to close
		
		for (String session : sessions) {
			
			driver.switchTo().window(session);
			
			if(!driver.getWindowHandle().equals(parentwindow))
			{
			driver.close();
			}
			
			driver.switchTo().window(parentwindow);
		}
		
		System.out.println("Title of the parent window:"+driver.getTitle());
	}

}
