package com.ravi.spring.core.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// general java way of creating object
		Employee employee = new Employee();
		employee.setEmpID(1);
		employee.setEmpName("ravi");
		employee.setEmpGender('M');
		System.out.println("Employee: " + employee);

		// spring way of creating object - IOC(Inversion of control)
		Resource resource = new ClassPathResource("employee.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		//Employee object will be created when we request for object
		Employee employee1 = (Employee) beanFactory.getBean("emp1");
		Employee employee2=beanFactory.getBean("emp2",Employee.class);
		System.out.println("Employee1: " + employee1);
		System.out.println("Employee2: " + employee2);
		
		// spring another way of creating object and suggested way
		//Employee object will be created when application context loads xml
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee3 = (Employee) applicationContext.getBean("emp1");
		Employee employee4 = applicationContext.getBean("emp2", Employee.class);
		System.out.println("Employee3: " + employee3);
		System.out.println("Employee4: " + employee4);
	} 

}
