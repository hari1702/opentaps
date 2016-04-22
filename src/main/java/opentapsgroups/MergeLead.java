package opentapsgroups;

import org.testng.annotations.Test;

public class MergeLead extends OpenTapsWrapper{

@Test(groups = "Sanity",dependsOnGroups="Smoke",enabled=false)
public void mergeLead(){
	clickByLinkText("Leads");
	clickByLinkText("Merge Leads");
	clickByXpath("//table[@class='twoColumnForm']/tbody[1]/tr[1]/td[2]/a[1]/img[1]");
	switchToLastWindow();
	enterByXpath("(//div[@class='x-form-element'])[2]/input[1]", "AntoJ1");
	clickByXpath("(//td[@class='x-btn-center'])[1]/em[1]/button[1]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickByLinkText("AntoJ1");
	switchToPrimaryWindow();
	clickByXpath("//table[@class='twoColumnForm']/tbody[1]/tr[2]/td[2]/a[1]/img[1]");
	switchToLastWindow();
	enterByXpath("(//div[@class='x-form-element'])[2]/input[1]", "Harik1");
	clickByXpath("(//td[@class='x-btn-center'])[1]/em[1]/button[1]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickByLinkText("Harik1");
	switchToPrimaryWindow();
	clickByClassName("buttonDangerous");
	acceptAlert();

	clickByLinkText("Find Leads");
	enterByXpath("(//div[@class='x-form-item x-tab-item'])[2]/div[1]/input[1]", "AntoJ1");
	clickByXpath("(//td[@class='x-btn-center'])[7]/em[1]/button[1]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	getTextByClassName("x-paging-info");
   }
}
