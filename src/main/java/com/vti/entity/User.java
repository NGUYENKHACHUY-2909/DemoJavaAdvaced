//
package com.vti.entity;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HuyNguyen
 * @create_date: Dec 28, 2022
 * @version: 1.0
 * @modifer: HuyNguyen
 * @modifer_date: Dec 28, 2022
 */
public abstract class User {
	private int id;
	private String email;
	private String password;
	private String fullName;
	UserType userType;


	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: HuyNguyen
	 * @create_date: Dec 28, 2022
	 * @version: 1.0
	 * @modifer: HuyNguyen
	 * @modifer_date: Dec 28, 2022
	 * @param id
	 * @param email
	 * @param password
	 * @param fullName
	 */
	public User(int id, String email, String password, String fullName) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.fullName = fullName;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the userType
	 */
	public UserType getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(UserType userType) {
		this.userType = userType;
	}

}
