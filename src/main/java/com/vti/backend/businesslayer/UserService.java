package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class UserService implements IUserService {
	private IUserRepository iUserRepository;
	public UserService() {
		iUserRepository = new UserRepository();
	}
	public List<User> getUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException{
		List<User> users = iUserRepository.getUsers();
		return users;
	}
	public User getUserFromId(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		User user = iUserRepository.getUserFromId(id);
		return user;
	}
}
