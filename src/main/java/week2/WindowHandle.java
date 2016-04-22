package week2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      
      driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
      driver.findElementByLinkText("Contact Us").click();;
      
      Set <String> window = driver.getWindowHandles();
      
      
      for (String eachwindow : window) {
    	  
    	  driver.switchTo().window(eachwindow);
    	  System.out.println("This is the tile of the window"+driver.getTitle());
			
	}
      System.out.println("This is the url of the second window " +driver.getCurrentUrl() );

      
      
	}

}
