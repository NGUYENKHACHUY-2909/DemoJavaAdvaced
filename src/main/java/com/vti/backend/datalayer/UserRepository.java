package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Admin;
import com.vti.entity.Employee;
import com.vti.entity.User;
import com.vti.entity.UserType;

import utils.JDBCUtils;

public class UserRepository implements IUserRepository{
	public List<User> getUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException{
		String sqlSelect = "SELECT * FROM `user`";
		List<User> users = new ArrayList<User>();
		Connection connection = JDBCUtils.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sqlSelect);
		while(resultSet.next()) {
			int id = resultSet.getInt("id");
			String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			String fullName = resultSet.getString("full_name");
			String userType = resultSet.getString("user_type");
			if(userType.equals(UserType.ADMIN)) {
				int expInYear = resultSet.getInt("exp_in_year");
				Admin admin = new Admin(id, email, password, fullName, expInYear);
				users.add(admin);
			}
			if(userType.equals(UserType.EMPLOYEE)) {
				String proSkill = resultSet.getString("pro_skill");
				Employee employee = new Employee(id, email, password, fullName, proSkill);
				users.add(employee);
			}
		}
		JDBCUtils.disconnect();
		return users;
	}
	public User getUserFromId(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		String sql = "SELECT * FROM `user` WHERE id = ? ";
		Connection connection = JDBCUtils.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		User user = null;
		while(resultSet.next()) {
			int getId = resultSet.getInt("id");
			String email = resultSet.getString("email");
			String passWord = resultSet.getString("passWord");
			String fullName = resultSet.getString("full_name");
			user = new User(id,email,passWord,fullName) {
			};
			};
		return user;
		
	}
}
