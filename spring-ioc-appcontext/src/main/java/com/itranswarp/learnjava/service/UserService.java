package com.itranswarp.learnjava.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;



public class UserService {

	private MailService mailService;
	private DataSource dataSource;
	public void setMailService(MailService mailService) {
		this.mailService = mailService;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private List<User> users = new ArrayList<>(List.of( // users:
			new User(1, "bob@example.com", "password", "Bob"), // bob
			new User(2, "alice@example.com", "password", "Alice"), // alice
			new User(3, "tom@example.com", "password", "Tom"))); // tom

	public void login(String email, String password) {
//		for (User user : users) {
//			if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
//				mailService.sendLoginMail(user);
//				return user;
//			}
//		}
		try {
			if (password.equals(queryUserEmail(email) )) {
				System.out.println("log in successed.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		throw new RuntimeException("login failed.");
	}

	public User getUser(long id) {
		return this.users.stream().filter(user -> user.getId() == id).findFirst().orElseThrow();
	}

	public User register(String email, String password, String name) {
		users.forEach((user) -> {
			if (user.getEmail().equalsIgnoreCase(email)) {
				throw new RuntimeException("email exist.");
			}
		});
		User user = new User(users.stream().mapToLong(u -> u.getId()).max().getAsLong(), email, password, name);
		users.add(user);
		mailService.sendRegistrationMail(user);
		return user;
	}
	
	String queryUserEmail(String email) throws SQLException {
		String re = "";
		try (Connection conn = this.dataSource.getConnection()) {
			try (PreparedStatement ps = conn
					.prepareStatement("SELECT * FROM users WHERE email = ? ")) {
				ps.setString(1, email); // 第一个参数grade=?
				try (ResultSet rs = ps.executeQuery()) {
					if (rs.next()) {
						re = rs.getString("password");
						System.out.println(rs.toString());
					}
				}
			}
		}
		return re;
	}	
}
