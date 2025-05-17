package com.SpringConcepts.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloMessagingApp {
    public static final Logger logger = LoggerFactory.getLogger(HelloMessagingApp.class);

    public static void main(String[] args) {
        logger.info("Welcome to Hello Messaging App");

        ApplicationContext context = SpringApplication.run(HelloMessagingApp.class, args);

        logger.debug("Spring Context initialized.");


        NotificationSender sender = context.getBean(NotificationSender.class);
        sender.notify("Hello from Logger App", "user@example.com");

        logger.info("Message Sent Successfully!");
    }
}