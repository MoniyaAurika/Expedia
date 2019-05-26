package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Config;

public class WebDriverFunction   {
	public WebDriver driver;


	public  String lol(String Locators){
		System.out.println(driver.getCurrentUrl());
		String xy=(driver.getCurrentUrl());
		if(xy.equalsIgnoreCase(Locators)){
			System.out.println("We are on right page");
		}
		else{
			System.out.println("We are not in the right page");
		}
		return driver.getCurrentUrl();	
	}
	public String kol(){
		return driver.getTitle();

	}
	public void pp(String Locators){
		driver.findElement(By.xpath(Locators)).click();
	}
	public void list (String Locators){
		WebElement ii = driver.findElement(By.xpath(Locators));
		List<WebElement> web=ii.findElements(By.tagName("a"));
		System.out.println(web.size());
		for(int i=0;i<web.size();i++){
			System.out.println(web.get(i).getText());	
		}
		List<WebElement> op=ii.findElements(By.tagName("button"));
		System.out.println(op.size());
		for(int i=0;i<op.size();i++){
			System.out.println(op.get(i).getText());

		}

	}





}
