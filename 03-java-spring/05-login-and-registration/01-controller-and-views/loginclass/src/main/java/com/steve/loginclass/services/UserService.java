package com.steve.loginclass.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steve.loginclass.models.User;
import com.steve.loginclass.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public User newUser (User user) {
		String hashedPw = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashedPw);
		return uRepo.save(user);
	}
	
	public User findByEmail(String email) {
		return ((UserRepository) uRepo).findByEmail(email);
	       
	    }
	public User getSingleUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	public boolean loginUser(String email, String password) {
		User user = uRepo.findByEmail(email);
		if(user == null) {
			return false;
		}
		return BCrypt.checkpw(password, user.getPassword());
	}
	
	
}
