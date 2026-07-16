package com.example.LogFile.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	
	 private static final Logger log =
	            LoggerFactory.getLogger(UserService.class);

	    public void createUser() {

	        log.info("User creation started");

	        log.info("Saving user into database");

	        log.info("User created successfully");
	    }

}
