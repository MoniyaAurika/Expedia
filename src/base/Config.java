package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.WebdriverMethods;

public class Config extends WebdriverMethods{

	
	@BeforeTest
	public void openBrowser(){
		// driver init
		driver.get("https://www.expedia.com/");
		// max page
		// implicit wait
	}
	
	
	@AfterTest
	public void tearDown(){
		// driver.quite
	}
}
