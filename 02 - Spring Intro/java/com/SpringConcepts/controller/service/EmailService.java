package com.SpringConcepts.controller.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {
    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Override
    public void sendMessage(String message, String receiver) {
        logger.info("Sending Email to {} with message: {}", receiver, message);
    }
}