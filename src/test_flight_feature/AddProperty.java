package test_flight_feature;




import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;



import base.Config;
import flightLoc.Locators;


public class AddProperty extends Config {

	Locators qq=new Locators();	
	@Test
	public void we(){
		pp(qq.addpro);
		System.out.println(driver.getTitle());
	Set <String> oo= driver.getWindowHandles();	
    Iterator<String>ii=oo.iterator();
    String mainwindow=ii.next();
    String nextwindow=ii.next();
    System.out.println(driver.getTitle());
    driver.switchTo().window(nextwindow);
    System.out.println(driver.getTitle());
	}
	
	
}
