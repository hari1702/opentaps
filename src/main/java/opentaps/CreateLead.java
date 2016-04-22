package opentaps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CreateLead extends OpenTapsWrapper {	
	
@Test()
	public void createLead(){
	String CompanyName = readCellFromExcel("CreateLead",4,1);	
    String FirstName = readCellFromExcel("CreateLead",4,2);
    String LastName = readCellFromExcel("CreateLead",4,3);
    String PhoneNumber = readCellFromExcel("CreateLead",4,4);
    String EmailId = readCellFromExcel("CreateLead",4,5);	    
	clickByXpath("//div[@class='crmsfa']/a/img");
	clickByXpath("//div[@id='left-content-column']/div[1]/div[2]/ul[1]/li[1]/a[1]");
	enterById("createLeadForm_companyName", CompanyName);
	enterById("createLeadForm_firstName", FirstName);
	enterById("createLeadForm_lastName", LastName);
	selectValueByIndex("createLeadForm_dataSourceId", 3);
	selectValueByIndex("createLeadForm_marketingCampaignId", 4);
	enterById("createLeadForm_primaryPhoneNumber",PhoneNumber);
	enterById("createLeadForm_primaryEmail",EmailId);	
	clickByClassName("smallSubmit");
	}

@AfterMethod
   public void verifyCreateLead(){
	getTextByIdSysOut("viewLead_companyName_sp");
    }

}
