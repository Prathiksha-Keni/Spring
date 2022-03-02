package com.xworkz.mountain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MountainTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		// Mountain mountain = applicationContext.getBean(Mountain.class);
		Object object = applicationContext.getBean("mountainConstructors7");
		Object object2 = applicationContext.getBean("mountainSetters4");
		Object object3 = applicationContext.getBean("mountainConstructors3");
		Object object4 = applicationContext.getBean("mountainSetters3");
		Mountain mountain = (Mountain) object;
		System.out.println("Mountain bean " + mountain.hashCode());
		System.out.println(mountain);
		mountain.shelter();
		mountain.preventSoilErosion();
	}

}
