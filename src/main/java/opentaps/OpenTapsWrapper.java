package opentaps;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class OpenTapsWrapper extends GenericWrapper {

@BeforeClass	
	public void launchBrowser(){	
	launchapp("firefox", "http://demo1.opentaps.org/opentaps/control/main");
		}
@AfterClass	
	public void closeBrowser(){	
		closeWindow();
			}	
@BeforeMethod
	public void Login(){	
	enterById("username", "DemoSalesManager");
	enterById("password", "crmsfa");
	clickByClassName("decorativeSubmit");
			}
	
}
