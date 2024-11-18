package com.jdbc.DAO;

import java.util.List;

import com.jdbc.entity.User;

public interface UserDao {
	void addUser(User user);
	User getUserById(int id);
	List<User> getAllUsers();
	void updateUser(User user);
	void deleteUser(int id);
}
 
 
 
 
 



