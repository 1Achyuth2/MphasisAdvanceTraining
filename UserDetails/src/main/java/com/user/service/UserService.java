package com.user.service;

import java.security.SecureRandom;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.domian.User;
import com.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	private static final SecureRandom secureRandom = new SecureRandom();
	private static final Base64.Encoder base64encoder = Base64.getUrlEncoder();

	public User register(User user) {
		if (checkUserExist(user) == true)
			return null;

		user.setToken(GenerateToken());

		return userRepository.save(user);
	}

	private String GenerateToken() {
		byte[] token = new byte[24];
		secureRandom.nextBytes(token);
		return base64encoder.encodeToString(token);
	}

	private boolean checkUserExist(User user) {
		User existingUser = userRepository.findById(user.getUsername()).orElse(null);
		if (existingUser == null)
			return false;

		return true;
	}

	public User login(User user) {
		User existingUser = userRepository.findById(user.getUsername()).orElse(null);

		if (existingUser.getUsername().equals(user.getUsername())
				&& existingUser.getPassword().equals(user.getPassword())
				&& existingUser.getRole().equals(user.getRole())) {
			existingUser.setPassword("");
			return existingUser;

		}

		return null;
	}

}
