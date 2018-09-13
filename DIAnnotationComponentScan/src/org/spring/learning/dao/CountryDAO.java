package org.spring.learning.dao;

import org.spring.learning.componentscan.Country;
import org.springframework.stereotype.Repository;

@Repository("countryDAO")
public class CountryDAO {
	
	// You should get it from database
	  Country country = new Country("Nepal",30000000);

	public Country createNewCountry() {
		// TODO Auto-generated method stub
		return country;
	}

	  

}
