package it.businessrest.service;

import java.util.List;

import it.businessrest.model.User;

public interface UserSer {
	
	public void addUser(User user);
	public void deleteUser(int id);
	public List<User> allUsers();
	public boolean isUser(int id); 
	public boolean isUser(User user); 
	
	
	
	
}
