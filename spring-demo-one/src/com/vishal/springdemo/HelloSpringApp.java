package com.vishal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from the Spring Container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		// Close the context
		context.close();
	}

}
