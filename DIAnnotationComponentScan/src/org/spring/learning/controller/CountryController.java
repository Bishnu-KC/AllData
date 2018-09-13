package org.spring.learning.controller;

import org.spring.learning.componentscan.Country;
import org.spring.learning.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller ("countryController")
public class CountryController {
	@Autowired
    CountryService countryService;
     
    public Country createNewCountry()
    {
        return countryService.createNewCountry();
    }

}
