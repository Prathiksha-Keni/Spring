package com.xworkz.newspaper.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.xworkz.newspaper.entity.NewspaperEntity;
import com.xworkz.newspaper.util.SessionFactoryProvider;

@Component

public class NewspaperDAOImpl implements NewspaperDAO {

	@Autowired
	private SessionFactory factory;

	public NewspaperDAOImpl(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	public NewspaperDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void saveNewspaperEntity(Object entity) {
		Session session = null;
		Transaction transaction = null;

		try {
			// sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.persist(entity);
			transaction.commit();
			System.out.println(entity);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is  closed");
			} else {
				System.out.println("Session is not closed");
			}

		}

	}

	public void getNewspaperPriceByName(String name) {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			// sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = factory.openSession();
			Query query = session.getNamedQuery("getNewspaperPriceByName");
			query.setParameter("Name", name);
			Object result = query.uniqueResult();
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is  closed");
			} else {
				System.out.println("Session is not closed");
			}
		}
	}

	public void getNewspaperEntityByPrice(String price) {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			// sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = factory.openSession();
			Query query = session.getNamedQuery("getNewspaperEntityByPrice");
			query.setParameter("Price", price);
			List<NewspaperEntity> list = query.list();
			for (NewspaperEntity entity : list) {
				System.out.println(entity);
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is  closed");
			} else {
				System.out.println("Session is not closed");
			}
		}

	}

	public void updateNewspaperNameByPrice(String newspaperName, double price) {
		Session session = null;
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		try {
			// sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			Query query = session.getNamedQuery("updateNewspaperNameByPrice");
			query.setParameter("NewspaperName", newspaperName);
			query.setParameter("Price", price);
			query.executeUpdate();
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is  closed");
			} else {
				System.out.println("Session is not closed");
			}
		}

	}

	public void deleteNewspaperEntityByName(String name) {
		Session session = null;
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		try {
			// sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			Query query = session.getNamedQuery("deleteNewspaperEntityByName");
			query.setParameter("Name", name);
			query.executeUpdate();
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is  closed");
			} else {
				System.out.println("Session is not closed");
			}
		}
	}

}
