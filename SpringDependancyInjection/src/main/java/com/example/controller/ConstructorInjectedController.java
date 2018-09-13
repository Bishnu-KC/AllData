package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.service.BookingService;

@Controller
public class ConstructorInjectedController {
	private BookingService bookingService;
	
	@Autowired
	public ConstructorInjectedController(BookingService bookingService)
	{
		super();
		System.out.println("This is constructor based Injections");
		this.bookingService=bookingService;
		
		/*public ConstructorInjectiondController (@Qulifier("AnotherInstant")Booking Service bookingService)
		 * if you need to use another instance of bean you can use @Qualifier bean annotation
		 * */
		
		
	}
	public String booking()
	{
		return bookingService.bookTrip();
	}

}
