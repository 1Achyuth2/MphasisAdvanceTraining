package com.user_payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.user.repository.UserRepository;

@SpringBootApplication
public class UserDetailsApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(UserDetailsApplication.class, args);
	}


}
