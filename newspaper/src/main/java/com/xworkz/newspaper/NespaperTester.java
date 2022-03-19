package com.xworkz.newspaper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.newspaper.dao.NewspaperDAO;
import com.xworkz.newspaper.dao.NewspaperDAOImpl;
import com.xworkz.newspaper.entity.NewspaperEntity;

public class NespaperTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		NewspaperDAO newspaperDAO = applicationContext.getBean(NewspaperDAO.class);

		NewspaperEntity entity = new NewspaperEntity("times of india", "15", "english", 25.0);
		newspaperDAO.saveNewspaperEntity(entity);
		((AbstractApplicationContext) applicationContext).close();

//		NewspaperDAOImpl newspaperDAO = new NewspaperDAOImpl();
//		NewspaperEntity entity = new	NewspaperEntity("sss","20","ss",20.0);
//		newspaperDAO.saveNewspaperEntity(entity);

	}

}
