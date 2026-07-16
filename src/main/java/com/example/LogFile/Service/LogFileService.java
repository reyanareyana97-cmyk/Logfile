package com.example.LogFile.Service;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.stereotype.Service;

@Service
public class LogFileService {
	
	  public String readLogFile() {

	        StringBuilder logs = new StringBuilder();

	        try (BufferedReader reader =
	                     new BufferedReader(new FileReader("logs/application.log"))) {

	            String line;

	            while ((line = reader.readLine()) != null) {
	                logs.append(line).append("\n");
	            }

	        } catch (IOException e) {
	            return "Error reading log file : " + e.getMessage();
	        }

	        return logs.toString();
	    }

}
