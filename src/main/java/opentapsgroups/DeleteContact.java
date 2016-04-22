package opentapsgroups;

import org.testng.annotations.Test;

public class DeleteContact extends OpenTapsWrapper{

@Test(groups = "Sanity",dependsOnGroups="Smoke")
public void deleteContact(){
	clickByLinkText("Contacts");
	clickByLinkText("Find Contacts");
	enterByXpath("//div[@class='x-panel-bwrap']/div[1]/div[2]/div[1]/input[1]","AntoJ1");
	clickByXpath("(//button[@class='x-btn-text'])[7]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	clickByLinkText("AntoJ1");
	clickByClassName("subMenuButtonDangerous");
	acceptAlert();
    }

}
