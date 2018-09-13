package com.example.model;

import org.springframework.stereotype.Component;

@Component

public class Account {
	long id;
	public Account()
	{
		super();
		System.out.println("Account object is creadet.");
	}

}
