package opentapsgroups;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact extends OpenTapsWrapper{

@Test(groups="Smoke",dataProvider="createContactDataProvider")
public void createContact(String FirstName,String LastName){
	clickByLinkText("Create Contact");
	enterById("firstNameField", FirstName);
	enterById("lastNameField", LastName);
	clickByClassName("smallSubmit");
   }

@DataProvider(name="createContactDataProvider")
public Object[][] createContactDataProvider(){
	Object[][] data = new Object[4][2];
	data[0][0] = "AntoJ1";
	data[0][1] = "Prem";
	data[1][0] = "AntoJ2";	
	data[1][1] = "Prem";
	data[2][0] = "Harik1";
	data[2][1] = "krishnan";
	data[3][0] = "Harik2";	
	data[3][1] = "krishnan";
	return data;
	}
}
