package com.tiny.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiny.model.Status;
import com.tiny.model.User;


@RestController
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class UserServices 
{
	@Autowired
	DataService service;
	
	User user;
	@RequestMapping("/")
	public String name()
	{
		user = new User();
		System.out.println("in controller..................");
		return "Home";
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/Registration",method=RequestMethod.POST)
	public ResponseEntity<User> setUserDetails(@RequestBody User user)
	{
		try
		{
			service.createUser(user);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<User>(user,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    @CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/Registration", method=RequestMethod.GET)
	public User getUserJSON()
	{
    	try
    	{
    		user = service.getUserDetails(0);
    		return user;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		return user;
    	}
		
	}
	@RequestMapping("/Home")
	public String signUp()
	{
		return "registration";
	}
}
