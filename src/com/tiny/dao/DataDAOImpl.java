package com.tiny.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Transaction;

import com.tiny.model.User;

public class DataDAOImpl implements DataDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	Session session = null;
	Transaction transaction;
	
	@Override
	public boolean createUser(User user) 
	{
		session = sessionFactory.getCurrentSession();
		transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		return false;
	}

	@Override
	public boolean findUserByEmail(String emialID) 
	{
		return false;
	}

	@Override
	public User getUserDetails(long id) 
	{
		session = sessionFactory.getCurrentSession();
		User user = (User) session.load(User.class, new Long(id));
		transaction = session.getTransaction();
		session.beginTransaction();
		transaction.commit();
		return user;
	}

	@Override
	public boolean updateUser(User user) 
	{

		return false;
	}

	@Override
	public boolean deleteUser(String emailID) 
	{
		session = sessionFactory.openSession();
		Object object = session.load(User.class, emailID);
		transaction = session.getTransaction();
		session.beginTransaction();
		session.delete(object);
		transaction.commit();
		return false;
	}
	
}
