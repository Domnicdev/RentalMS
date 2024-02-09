package com.rms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.bean.User;
import com.rms.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")

public class UserController {

	@Autowired
	UserService service;

	@PostMapping("PerformUserInsert")
	public String performInsert(@RequestBody User user) {
		service.addUser(user);
		return "Record Inserted";

	}

	@PutMapping("PerformUserUpdate")
	public String performUpdate(@RequestBody User user) {
		service.updateUser(user);
		return "Record Updated";

	}

	@DeleteMapping("PerformUserDelete/{userId}")
	public String performDelete(@PathVariable("userId") long userId) {
		service.deleteUser(userId);
		return "Record Deleted";
	}

	@GetMapping("PerformUserView/{userId}")
	public User performView(@PathVariable("userId") long userId) {
		
		return service.viewUser(userId);
	}

	@GetMapping("ViewAllUsers")
	public List<User> viewAllUsers() {
		Iterator<User> it = service.viewAllUsers().iterator();
		List<User> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

	@GetMapping("ViewAllTenants")
	public List<User> viewAllTenants() {
		Iterator<User> it = service.viewAllTenants().iterator();
		List<User> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	@GetMapping("ViewAllHouseOwners")
	public List<User> viewAllHouseOwners() {
		Iterator<User> it = service.viewAllHouseOwners().iterator();
		List<User> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}


}
