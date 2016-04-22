package explore;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExploreTestNG extends Wrapper {

@Test(dataProvider="testdata")
public void test(String firstname,String lastname){
	System.out.println("This is the firstname "+firstname);
	System.out.println("This is the lastname "+lastname);
}

@DataProvider(name="testdata")
public Object[][] dataProvider(){
	Object[][] data = new Object[2][2];
	data[0][0]="Hari";
	data[0][1]="krishnan";	
	data[1][0]="Asha";
	data[1][1]="P";
	return data;
	}

}
