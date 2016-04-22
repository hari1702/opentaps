package opentapsgroups;

import org.testng.annotations.Test;

public class MergeContact extends OpenTapsWrapper{

@Test(groups = "Sanity",dependsOnGroups="Smoke")
public void mergeContact(){
	clickByLinkText("Contacts");
	clickByLinkText("Merge Contacts");
	clickByXpath("//table[@class='twoColumnForm']/tbody[1]/tr[1]/td[2]/a[1]/img[1]");
	switchToLastWindow();
	enterByName("firstName","Harik1");
	clickByXpath("(//button[@class='x-btn-text'])[1]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickByLinkText("Harik1");
	switchToPrimaryWindow();
	clickByXpath("//table[@class='twoColumnForm']/tbody[1]/tr[2]/td[2]/a[1]/img[1]");
	switchToLastWindow();
	enterByName("firstName","Harik2");
	clickByXpath("(//button[@class='x-btn-text'])[1]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickByLinkText("Harik2");
	switchToPrimaryWindow();	
	clickByLinkText("Merge");
	acceptAlert();
    }
}
