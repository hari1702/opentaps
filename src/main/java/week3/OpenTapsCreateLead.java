package week3;

import org.junit.Test;

public class OpenTapsCreateLead extends WrapperClass{

@Test	
public void createLead(){
	
	//Launch opentaps
	launchapp("chrome","http://demo1.opentaps.org/opentaps/control/main");
	
	//Enter Username and Password
	enterById("username","DemoSalesManager");
	enterByName("PASSWORD","crmsfa");
	
    //Verify title
	verifyTitle("Opentaps Open Source ERP + CRM");
	
	//Verify Url
	verifyUrl("http://demo1.opentaps.org/opentaps/control/main");
	
	//Click Login Button
	clickByClassName("decorativeSubmit");
	
	//Verify title
	verifyTitle("Opentaps Open Source ERP + CRM");
	
	//Click crmsfa 
	clickByXpath("//div[@class='crmsfa']/a[1]/img[1]");
	
	//Verify title
	verifyTitle("My Home | opentaps CRM");
	
	//Click create lead link
	clickByXpath("//ul[@class='shortcuts']/li[1]/a[1]");	
	
	//Verify title
	verifyTitle("Create Lead | opentaps CRM");
	
	//Fill Company Name
	enterById("createLeadForm_companyName","AON");
	
	//Fill First Name
	enterById("createLeadForm_firstName","Hari");
	
	//Fill Last Name
	enterById("createLeadForm_lastName","Krishnan");
	
	//Select source
	selectValueByIndex("createLeadForm_dataSourceId", 2);
	
	//Select Industry
	selectValueByIndex("createLeadForm_industryEnumId", 3);
	
	//Click Create Lead Button
	clickByName("submitButton");
	
	//Verify Title
	verifyTitle("View Lead | opentaps CRM");
	
	//Verify Text
	verifyText("sectionHeaderTitle_leads","View Lead");
  }

}
