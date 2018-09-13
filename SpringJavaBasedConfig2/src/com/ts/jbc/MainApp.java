package com.ts.jbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext conn=new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor te=conn.getBean(TextEditor.class);
		te.getClass();

	}

}
