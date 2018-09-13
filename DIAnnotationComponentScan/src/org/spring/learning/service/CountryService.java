package org.spring.learning.service;

import org.spring.learning.componentscan.Country;
import org.spring.learning.dao.CountryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("countryService")
public class CountryService {
	
	@Autowired
	 CountryDAO countryDAO;
	 public Country createNewCountry() {
	 
	  return countryDAO.createNewCountry();
	 }

}
