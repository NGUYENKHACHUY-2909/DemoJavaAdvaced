package com.vti.entity;

public class Admin extends User {
	private int expInYear;
	public Admin(int id, String email, String password, String fullName, int expInYear) {
		super(id, email, password, fullName);
		this.expInYear = expInYear;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}
	/**
	 * @param expInYear the expInYear to set
	 */
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	
}
