package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same 
		boolean result = (theCoach == alphaCoach);
		
		// Results 
		System.out.println("\n Pointing to the same object: " + result);
		
		System.out.println("\n Memory location for theCoach: " + theCoach);
		
		System.out.println("\n Memory location alphaChoach: " + alphaCoach + "\n");
		
		context.close();
		
	}

}
