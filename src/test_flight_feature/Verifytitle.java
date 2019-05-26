package test_flight_feature;

import base.Config;

public class Verifytitle extends Config {
	
public void yy(){
	//System.out.println(driver.getCurrentUrl());
	String yz=kol();
	if(yz.equalsIgnoreCase("Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacation")){
	System.out.println("we are getting right title");
}
	
	else{
		System.out.println("we are not getting right title");
	}
}

}
