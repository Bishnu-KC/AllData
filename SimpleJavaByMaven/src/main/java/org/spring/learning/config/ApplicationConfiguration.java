package org.spring.learning.config;

import org.spring.learning.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	@Bean(name="countryObj")
	public Country getCountry()
	{
		return new Country("Nepal");
	}

}
