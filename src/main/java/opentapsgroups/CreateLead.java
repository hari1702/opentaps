package opentapsgroups;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends OpenTapsWrapper{


@Test(groups = "Smoke",dataProvider="createLeadDataProvider")
public void createLead(String CompanyName,String FirstName,String LastName, 
		               String PhoneNumber,String EmailId   )
{
	clickByLinkText("Create Lead");
	enterById("createLeadForm_companyName", CompanyName);
	enterById("createLeadForm_firstName", FirstName);
	enterById("createLeadForm_lastName", LastName);
	selectValueByIndex("createLeadForm_dataSourceId", 3);
	selectValueByIndex("createLeadForm_marketingCampaignId", 4);
	enterById("createLeadForm_primaryPhoneNumber",PhoneNumber);
	enterById("createLeadForm_primaryEmail",EmailId);	
	clickByClassName("smallSubmit");
	getTextByIdSysOut("viewLead_companyName_sp");
}

@DataProvider(name="createLeadDataProvider")
public Object[][] createLeadDataProvider(){
	Object[][] data= new Object[4][5];
	data[0][0] = "Aon";
	data[0][1] = "AntoJ";
	data[0][2] = "Prem";
	data[0][3] = "9345734579";
	data[0][4] = "anto@test.com";
	data[1][0] = "Aon";
	data[1][1] = "Harik";
	data[1][2] = "Krishnan";
	data[1][3] = "9345534579";
	data[1][4] = "hari@test.com";
	data[2][0] = "Aon";
	data[2][1] = "AntoJ1";
	data[2][2] = "Prem1";
	data[2][3] = "9345734589";
	data[2][4] = "anto1@test.com";
	data[3][0] = "Aon";
	data[3][1] = "Harik1";
	data[3][2] = "Krishnan1";
	data[3][3] = "9345334579";
	data[3][4] = "hari1@test.com";
	return data;
	 }
}
