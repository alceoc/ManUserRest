package it.businessrest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import it.businessrest.model.User;
import it.businessrest.service.UserSer;

@RestController

public class UserRestCtrl {

	@Autowired
	UserSer userSer;
	
	
	//add new user
	@PostMapping("/user")
		public ResponseEntity<Object> addUserCtrl (@Valid @RequestBody User user) {
		
		if (userSer.isUser(user)) {
			return new ResponseEntity<>("User with id " + user.getUserId() + " already exists!", HttpStatus.NOT_FOUND);
		}
		
		
		userSer.addUser(user);
		
		
		return new ResponseEntity<>("User is added successfully", HttpStatus.CREATED);
	}	
			
	//delete a user
	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteUserCtrl(@PathVariable("id") int id) { 
		
		
		
		if (!userSer.isUser(id)) {
			return new ResponseEntity<>("User with id " + id + " not found.", HttpStatus.NOT_FOUND);
		}
		
		userSer.deleteUser(id);
	      return new ResponseEntity<>("User is deleted successfully", HttpStatus.OK);
	   }
	
	
	
	@GetMapping("/user")
	public ResponseEntity<Object> allUsersCtrl() {
		List<User> usersList = userSer.allUsers();
		if (usersList.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<>(usersList, HttpStatus.OK);
	}
	
}
