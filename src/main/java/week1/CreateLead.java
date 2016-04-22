package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		//Lauch Firfox
		FirefoxDriver driver = new FirefoxDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Navigate to URL
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		
		//Print the title of the web page
		System.out.println(driver.getTitle());
		
		//Enter Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click login
		driver.findElementByClassName("decorativeSubmit").click();
		
//		Setting a default time out for identifying objects (after the page is completely loaded)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//Print the title of the web page
		System.out.println(driver.getTitle());
		
		//Click CRM/FSA
		driver.findElementByClassName("crmsfa").click();	
		
//		Setting a default time out for identifying objects (after the page is completely loaded)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Print the title of the web page
		System.out.println(driver.getTitle());
		
		//Click create lead
		driver.findElementByLinkText("Create Lead").click();
		
		//Print the title of the web page
		System.out.println(driver.getTitle());
		
		//Enter Company name
		driver.findElementById("createLeadForm_companyName").sendKeys("AON");
		
		//Enter First name
		driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
		
		//Enter Last name
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		
		//Click Create lead
		driver.findElementByClassName("smallSubmit").click();
		
		//Print the title of the web page
		System.out.println(driver.getTitle());
		
		
		}

}
