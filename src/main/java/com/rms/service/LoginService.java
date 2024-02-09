package com.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.bean.Login;
import com.rms.bean.User;
import com.rms.repo.UserRepo;

@Service
public class LoginService {
	@Autowired
	UserRepo repo;
	User user;

	public Login login(User user) {
		User ref = repo.findByUserEmail(user.getUserEmail());
		User pass = repo.findByUserPassword(user.getUserPassword());
		if (ref != null && pass != null) {
			String value = ref.getUserPassword();
			String word = pass.getUserPassword();
			if (value.equals(word)) {
				String res = ref.getUserType();
				if (res.equalsIgnoreCase("admin")) {
					return new Login("Admin Success");
				} else if (res.equalsIgnoreCase("Tenant")) {
					return new Login("Tenant Success");
				} else if (res.equalsIgnoreCase("HouseOwner")) {
					return new Login("HouseOwner Success");
				} else {
					return new Login("Login not Success");

				}
			} else {
				return new Login("Login Fail");
			}
		} else {
			return new Login("Login Fail");
		}

	}
}
