package org.spring.model;

public class Country {
	String countryName;
	public Country(String countryName)
	{
		this.countryName=countryName;
	}
	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
	}
	public String getCountryName() {
		// TODO Auto-generated method stub
		//return ("Nepal");
		return countryName;
	}

}
