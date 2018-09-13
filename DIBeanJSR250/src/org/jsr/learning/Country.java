package org.jsr.learning;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.portlet.bind.annotation.ResourceMapping;

public class Country {
	
	String countryName;
	
	//@Resource(name="capitalA")
	Capital capital;
	 public String getCountryName() {
	        return countryName;
	    }
	    public void setCountryName(String countryName) {
	        this.countryName = countryName;
	    }
	    public Capital getCapital() {
	        return capital;
	    }

}
