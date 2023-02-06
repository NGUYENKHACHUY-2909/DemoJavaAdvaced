package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

public class UserController {
	private IUserService iUserService;
	public UserController() {
		iUserService = new UserService();
	}
	public List<User> getUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException{
		List<User> users = iUserService.getUsers();
		return users;
	}
	public User getUserFromId(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		User user = iUserService.getUserFromId(id);
		return user;
	}
}
