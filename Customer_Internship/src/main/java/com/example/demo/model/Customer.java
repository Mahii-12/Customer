package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
     
	@Id
	
	private int id;
	private String A_FirstName;
	private String A_LastName;
	private String Street;
	private String T_Address;
	private String U_City;
	private String State;
	private String Y_Email;
	private double Z_Phone;
	
	public Customer() {}
	
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param street
	 * @param address
	 * @param city
	 * @param state
	 * @param email
	 * @param phone
	 */
	public Customer(int id, String firstName, String lastName, String street, String address, String city, String state,
			String email, double phone) {
		super();
		this.id = id;
		A_FirstName = firstName;
		A_LastName = lastName;
		Street = street;
		T_Address = address;
		U_City = city;
		State = state;
		Y_Email = email;
		Z_Phone = phone;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return A_FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		A_FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return A_LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		A_LastName = lastName;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return Street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		Street = street;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return T_Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		T_Address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return U_City;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		U_City = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Y_Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Y_Email = email;
	}
	/**
	 * @return the phone
	 */
	public double getPhone() {
		return Z_Phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(double phone) {
		Z_Phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", FirstName=" + A_FirstName + ", LastName=" + A_LastName + ", Street=" + Street
				+ ", Address=" + T_Address + ", City=" + U_City + ", State=" + State + ", Email=" + Y_Email + ", Phone="
				+ Z_Phone + "]";
	}
	
}
