package opentapsgroups;

import org.testng.annotations.Test;

public class EditLead extends OpenTapsWrapper{

@Test(groups = "Sanity",dependsOnGroups="Smoke")
public void editLead(){
	clickByLinkText("Leads");
	clickByLinkText("Find Leads");
	enterByXpath("(//input[@name='firstName'])[3]","Harik");
	clickByXpath("(//td[@class='x-btn-center'])[7]/em[1]/button[1]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	clickByLinkText("Harik");
	if(getTextById("sectionHeaderTitle_leads").equals("View Lead")){
		System.out.println("Yes, Title is View Lead");
	}else{
		System.out.println("No, Title is not View Lead");
	}

	clickByLinkText("Edit");
	selectValueByIndex("addDataSourceForm_dataSourceId", 1);
	clickByXpath("(//div[@class='fieldgroup-body'])[2]/table[1]/tbody[1]/tr[2]/td[2]/input[1]");
	clickByXpath("//td[@class='tabletextright']/a[1]");
	selectValueByIndex("addMarketingCampaignForm_marketingCampaignId", 1);
	clickByXpath("(//div[@class='fieldgroup-body'])[3]/table[1]/tbody[1]/tr[2]/td[2]/input[1]");
	clickByXpath("//div[@class='fieldgroup-body']/table[1]/tbody[1]/tr[12]/td[2]/input[1]");

	if(getTextById("viewLead_dataSources_sp").contains("Conference")){
		System.out.println("Source is updated correctly");
	}else{
		System.out.println("Source is not updated correctly");
	}
	
	if(getTextById("viewLead_marketingCampaigns_sp").equals("Automobile")){
		System.out.println("Marketing Campaigns is updated correctly");
	}else{
		System.out.println("Marketing Campaigns is not updated correctly");
	}

	}
}