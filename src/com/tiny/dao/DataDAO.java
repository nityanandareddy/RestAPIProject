package com.tiny.dao;

import com.tiny.model.User;

public interface DataDAO 
{
	public boolean createUser(User user);
	public boolean findUserByEmail(String emialID);
	public User getUserDetails(long id);
	public boolean updateUser(User user);
	public boolean deleteUser(String emailID); 
}
