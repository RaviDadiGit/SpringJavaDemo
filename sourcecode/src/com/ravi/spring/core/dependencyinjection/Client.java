package com.ravi.spring.core.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		// spring another way of creating object and suggested way
		// we are controlling bean life cycle by defining init and destroy methods
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DependencyInjection.xml");
		Employee employee3 = (Employee) applicationContext.getBean("emp1");
		System.out.println("Employee Constructor Injection : " + employee3);
		Employee employee4 = applicationContext.getBean("emp2",Employee.class);
		System.out.println("Employee Setter Injection: " + employee4);
	} 

}
