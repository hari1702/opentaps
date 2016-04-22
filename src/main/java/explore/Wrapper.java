package explore;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Wrapper {
@BeforeClass	
	public void launchBrowser(){	
	System.out.println("Browser Launched successfully");
		}
@AfterClass	
	public void closeBrowser(){	
	System.out.println("Browser closed successfully");
			}	
@BeforeMethod
	public void Login(){	
	System.out.println("Loggedin");	
			}
@AfterMethod
    public void verify(){
	System.out.println("Verified");
}
}
