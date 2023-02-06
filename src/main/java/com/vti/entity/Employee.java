package com.vti.entity;

public class Employee extends User{

	private String proSkil;
	public Employee(int id, String email, String password, String fullName, String proSkil) {
		super(id, email, password, fullName);
		this.proSkil = proSkil;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the proSkil
	 */
	public String getProSkil() {
		return proSkil;
	}
	/**
	 * @param proSkil the proSkil to set
	 */
	public void setProSkil(String proSkil) {
		this.proSkil = proSkil;
	}
	
}
