package opentapsgroups;

import org.testng.annotations.Test;

public class DeleteLead extends OpenTapsWrapper{
	
@Test(groups = "Sanity",dependsOnGroups="Smoke")
public void deleteLead(){
	clickByLinkText("Leads");
	clickByLinkText("Find Leads");
	clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
	enterByXpath("(//div[@class='x-plain-bwrap'])[14]/div[1]/input[1]", "9345734579");
	clickByXpath("(//button[@class='x-btn-text'])[7]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickByLinkText("AntoJ");		
	clickByClassName("subMenuButtonDangerous");
	/*clickByLinkText("Find Leads");
	clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
	enterByXpath("(//div[@class='x-plain-bwrap'])[14]/div[1]/input[1]", "9345734579");
	clickByXpath("(//button[@class='x-btn-text'])[7]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} */
  }
}
