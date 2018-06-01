package com.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.beans.User;
import com.user.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo db;

	public User login(User u) throws Exception {
		if (u==null || u.getName()== null) {
			throw new Exception("Invalid");
		}
		Optional<User> u2 = db.findById(u.getName());
		if ( ! u2.isPresent()) {
			throw new Exception("Invalid User Name");
		}
		if (u2.get().getPassword().equals(u.getPassword())) {
			return u2.get();
		}
		return null;
	
	}

	public User signup(User u) throws Exception {
		if (u==null || u.getName()== null) {
			throw new Exception("Invalid");
		}
		Optional<User> u2 = db.findById(u.getName());
		if ( u2.isPresent()) {
			throw new Exception("User already Exists");
		}
		return db.save(u);
	}

}
