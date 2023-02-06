//
package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;

import utils.JDBCUtils;
import utils.ScannerUtils;

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
public class Program {
	public static void main(String[] args) {
		getUser();
		getUserFromId();
	}
	static void getUser() {
		try {
			UserController userController = new UserController();
			List<User> users = userController.getUsers();
			for (User user : users) {
				System.out.println(user.getId());
				System.out.println(user.getEmail());
				System.out.println(user.getFullName());
				System.out.println(user.getPassword());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("Error!");
		}
	}
	static void getUserFromId() {
		try {
			UserController userController = new UserController();
			System.out.println("nhap id muon tim: ");
			int id = ScannerUtils.inputInt();
			User user = userController.getUserFromId(id);
			System.out.println(user.getId());
			System.out.println(user.getEmail());
			System.out.println(user.getFullName());
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Error!");
			// TODO: handle exception
		}
	}
}
