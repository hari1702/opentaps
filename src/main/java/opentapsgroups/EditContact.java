package opentapsgroups;

import org.testng.annotations.Test;

public class EditContact extends OpenTapsWrapper{
	
@Test(groups = "Sanity",dependsOnGroups="Smoke")
public void editContact(){
	clickByLinkText("Contacts");
	clickByLinkText("Find Contacts");
	enterByXpath("//div[@class='x-panel-bwrap']/div[1]/div[2]/div[1]/input[1]","AntoJ2");
	clickByXpath("(//button[@class='x-btn-text'])[7]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	clickByLinkText("AntoJ2");
	clickByLinkText("Edit");
	selectValueByIndex("addMarketingCampaignForm_marketingCampaignId",4);
	clickByXpath("(//input[@name='submitButton'])[2]");
	clickByXpath("(//input[@name='submitButton'])[1]");	
   }
}
