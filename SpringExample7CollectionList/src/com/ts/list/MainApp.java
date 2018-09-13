package com.ts.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext conn=new ClassPathXmlApplicationContext("a.xml");
		
		JavaCollection jc=(JavaCollection) conn.getBean("b");
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();
	}

}
