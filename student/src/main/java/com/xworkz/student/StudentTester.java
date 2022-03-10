package com.xworkz.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTester {

	public static void main(String[] args) {
		String configuration = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configuration);
		Student bean = applicationContext.getBean(Student.class);
		System.out.println(bean);
		System.out.println(bean.hashCode());
		System.out.println("--------------------");
		
		Student bean2 = applicationContext.getBean(Student.class);
		System.out.println(bean2);
		System.out.println(bean2.hashCode());
		System.out.println("--------------------");
		
		
		Student bean3 = applicationContext.getBean(Student.class);
		System.out.println(bean3);
		System.out.println(bean3.hashCode());
		
		
	}

}
