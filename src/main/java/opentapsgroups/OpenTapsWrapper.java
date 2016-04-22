package opentapsgroups;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class OpenTapsWrapper extends GenericWrapper {

@BeforeClass(groups={"Smoke","Sanity"})	
@Parameters("Browser")
	public void launchBrowser(String Browser){	
	launchapp(Browser, "http://demo1.opentaps.org/opentaps/control/main");
	enterById("username", "DemoSalesManager");
	enterById("password", "crmsfa");
	clickByClassName("decorativeSubmit");
	clickByXpath("//div[@class='crmsfa']/a/img");
		}
@AfterClass(groups={"Smoke","Sanity"})	
	public void closeBrowser(){	
		closeWindow();
			}	
	
}
