package org.spring.config;

import org.spring.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean(name="countryObj")
	public Country getCountryName()
	{
		return new Country("Nepal");
	}

}
