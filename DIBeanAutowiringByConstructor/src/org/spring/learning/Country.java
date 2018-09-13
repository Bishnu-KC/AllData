package org.spring.learning;

public class Country {
	String countryName;
	Capital capitatlObj;
	public Country(String countryName, Capital capitalObj)
	{
		super();
		this.countryName=countryName;
		this.capitatlObj=capitalObj;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Capital getCapitatlObj() {
		return capitatlObj;
	}
	public void setCapitatlObj(Capital capitatlObj) {
		this.capitatlObj = capitatlObj;
	}
	
	
	

}
