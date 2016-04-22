package week1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class IrctReg {

	public static void main(String[] args) throws InterruptedException {
		
		//Create new instance of the Firefox driver
		FirefoxDriver driver = new FirefoxDriver();
		
		//Open IRCTC registration page
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//Get Webpage title
		System.out.println(driver.getTitle());		
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Filling Registration form of IRCTC
		
		//Filling User ID
		driver.findElementById("userRegistrationForm:userName").sendKeys("hari1702");
		
		//Filling Password
		driver.findElementById("userRegistrationForm:password").sendKeys("workat04");
		
		//Filling Confirm PassWord
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("workat04");
		
		//Selecting security question
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What was the name of your first school?");
		
        //Filling Security Answer
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("National");
		
		//Filling First Name
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Hari");
		
		//Filling Middle Name
		driver.findElementById("userRegistrationForm:middleName").sendKeys("");
				
		//Filling last Name
		driver.findElementById("userRegistrationForm:lastName").sendKeys("M");
		
		//Selecting Gender
		driver.findElementById("userRegistrationForm:gender:0").click();
		
		//Selecting Marital status
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		
		//Selecting Date of Birth
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("30");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("JUL");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1988");
	
		//Selecting Occupation
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Private");
		
		//Filling Adhaar number
		driver.findElementById("userRegistrationForm:uidno").sendKeys("AGD45804");
		
		//Filling Email id
		driver.findElementById("userRegistrationForm:email").sendKeys("hari1702@gmail.com");
		
		//Filling Mobile number
		driver.findElementByName("userRegistrationForm:mobile").sendKeys("9600110876");
		
		//Selecting Nationality
		driver.findElementByName("userRegistrationForm:nationalityId").sendKeys("India");
		
		//Filling Residential address
		driver.findElementById("userRegistrationForm:address").sendKeys("81");
		driver.findElementById("userRegistrationForm:street").sendKeys("Thiruvalluvar Street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Pichanoor");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("632602");
		
		//To wait for web page to load city and post office
		Thread.sleep(10000);
      
		
        driver.findElementById("userRegistrationForm:cityName").sendKeys("Vellore");
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Gudiyattam H.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("9600110876");
	}

}
