package com.rms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.bean.User;
import com.rms.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;
	
	public boolean addUser(User user) {
		repo.save(user);
		return true;
		
	}
	
	public boolean updateUser(User user) {
		repo.save(user);
		return true;

	}
	
	public boolean deleteUser(long userId) {
		repo.deleteById(userId);
		return true;
	}
	
	public User viewUser(long userId) {
	
		return repo.findById(userId).get();
	}
	public List<User> viewAllUsers(){
		Iterator<User> it=repo.findAll().iterator();
		 List<User> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
	public List<User> viewAllTenants(){
		Iterator<User> it=repo.viewAllTenants().iterator();
		 List<User> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
	
	public List<User> viewAllHouseOwners(){
		Iterator<User> it=repo.viewAllHouseOwners().iterator();
		 List<User> list=new ArrayList<>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
}
