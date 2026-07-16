package com.example.LogFile.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.LogFile.Service.UserService;

@RestController
public class LogFileController {
	
	 @Autowired
	    private UserService userService;

	    @GetMapping("/test")
	    public String test() {

	        userService.createUser();

	        return "Success";
	    }
}
