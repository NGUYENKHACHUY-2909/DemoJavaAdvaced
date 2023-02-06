package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IUserRepository {
	public List<User> getUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
	public User getUserFromId(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
}
