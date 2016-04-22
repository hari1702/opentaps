package opentaps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DeleteLead extends OpenTapsWrapper {
@Test(dependsOnMethods="opentaps.CreateLead.createLead")	
	public void deleteLead(){
	clickByXpath("//div[@class='crmsfa']/a/img");
	clickByLinkText("Leads");
	clickByLinkText("Find Leads");
	clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
	enterByXpath("(//div[@class='x-plain-bwrap'])[14]/div[1]/input[1]", "9605110876");
	clickByXpath("(//button[@class='x-btn-text'])[7]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickByLinkText("Hari Create4");		
	clickByClassName("subMenuButtonDangerous");
	clickByLinkText("Find Leads");
	clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
	enterByXpath("(//div[@class='x-plain-bwrap'])[14]/div[1]/input[1]", "9605110876");
	clickByXpath("(//button[@class='x-btn-text'])[7]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
@AfterMethod
    public void verifyDeleteLead(){
	getTextByClassName("x-paging-info");
}

}
