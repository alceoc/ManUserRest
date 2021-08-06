package it.businessrest.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import it.businessrest.model.User;

@Service
public class UserSerImp implements UserSer {

	private List<User> userList = new ArrayList<>();
	private boolean exists;

	@Override
	public void addUser(User user) {
		userList.add(user);

	}

	
	


	@Override
	public void deleteUser(int id) {
		Iterator<User> iterator1 = userList.iterator();
		User user;
		while (iterator1.hasNext()) {
			user = iterator1.next();
			if (user.getUserId() == id) {
				iterator1.remove();
			}
		}
	}

	@Override
	public List<User> allUsers() {

		return userList;
	}

	@Override
	public boolean isUser(int id) {
		exists=false;
		userList.forEach((User usr) ->{
			if(usr.getUserId()==id) {exists=true;}
			});
		
		return exists;
	}
	
	@Override
	public boolean isUser(User user) {
		exists=false;
		userList.forEach((User usr) ->{
			if(usr.getUserId()==user.getUserId()) {exists=true;}
			});
		
		return exists;
	}
}
