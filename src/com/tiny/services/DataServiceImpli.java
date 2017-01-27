package com.tiny.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.tiny.dao.DataDAO;
import com.tiny.model.User;

public class DataServiceImpli implements DataService
{
	@Autowired
	DataDAO dataDao;
	
	@Override
	public boolean createUser(User user) 
	{
		return dataDao.createUser(user);
	}
	@Override
	public boolean findUserByEmail(String emialID) 
	{
		return dataDao.findUserByEmail(emialID);
	}

	@Override
	public User getUserDetails(long id) 
	{
		return dataDao.getUserDetails(id);
	}

	@Override
	public boolean updateUser(User user) 
	{
		return dataDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(String emailID) 
	{
		return dataDao.deleteUser(emailID);
	}
	
}
