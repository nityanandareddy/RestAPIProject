package com.tiny.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "USER")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min=3, max=50)
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Size(min=3, max=50)
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@Size(min=3, max=50)
	@Column(name = "STREET", nullable = false)
	private String streetName;
	
	@Size(min=3, max=50)
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@Size(min=3, max=20)
	@Column(name = "CITY", nullable = false)
	private String city;
	
	@Size(min=3, max=20)
	@Column(name = "STATE", nullable = false)
	private String state;
	
	@Column(name = "PINCODE", nullable = false)
	private int pincode;
	
	
	@Size(min=3, max=15)
	@Column(name = "COUNTRY", nullable = false)
	private String country;
	
	public String getName() {
		return name;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
