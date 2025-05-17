package com.example.demo.service;

import com.example.demo.Model.GreetingRecord;
import com.example.demo.repository.GreetingMessageRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingMessageService {

    @Autowired
    private GreetingMessageRepository greetingMessageRepository;

    public String createAndSaveGreeting(String firstName, String lastName) {
        String message;

        if (firstName != null && !firstName.isBlank() && lastName != null && !lastName.isBlank()) {
            message = "Hello " + firstName + " " + lastName;
        } else if (firstName != null && !firstName.isBlank()) {
            message = "Hello " + firstName;
        } else if (lastName != null && !lastName.isBlank()) {
            message = "Hello " + lastName;
        } else {
            message = "Hello World";
        }

        greetingMessageRepository.save(new GreetingRecord(message));
        return message;
    }

	public Object findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<GreetingRecord> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public GreetingRecord save(GreetingRecord greeting) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
}