package week3;

import org.junit.Test;
import org.openqa.selenium.By;

public class WrapperCheck extends WrapperClass {
	
@Test	
	public void popuptest(){
	
	launchapp("firefox","http://popuptest.com");
	
	driver.findElement(By.linkText("Multi-PopUp Test #2")).click();
	
	switchToLastWindow();
	
	System.out.println(driver.getCurrentUrl());

	}
}
