package com.xworkz.country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
		Country bean = applicationContext.getBean(Country.class);
		System.out.println(bean.hashCode());
		
		Country bean2 = applicationContext.getBean(Country.class);
		System.out.println(bean2.hashCode());
		
		Country bean3 = applicationContext.getBean(Country.class);
		System.out.println(bean3.hashCode());
		
		Country bean4 = applicationContext.getBean(Country.class);
		System.out.println(bean4.hashCode());
	}

}
