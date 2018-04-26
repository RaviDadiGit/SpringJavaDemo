package com.ravi.spring.core.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		// spring another way of creating object and suggested way
		// we are controlling bean life cycle by defining init and destroy methods
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
		Employee employee3 = (Employee) applicationContext.getBean("emp1");
		System.out.println("Employee3: " + employee3);
		ClassPathXmlApplicationContext classPathXmlApplicationContext =(ClassPathXmlApplicationContext)applicationContext;
		//will shutdown the Spring core container so that all the objects will be closed
		classPathXmlApplicationContext.close();
		//will throw the  IllegalstateException due to bean factory closed
		Employee employee4 = (Employee) applicationContext.getBean("emp1");
		System.out.println("Employee4" + employee4);
	} 

}
