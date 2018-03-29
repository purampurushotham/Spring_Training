package com.spring.events.Listener;

import com.spring.events.CustomSpringEvent;
import com.spring.mvc.tutorial.modal.User;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;

public class CustomSpringEventListener implements ApplicationListener<User>{
    @Override
    public void onApplicationEvent(ApplicationEvent event, String message, User user) {
        System.out.println("Received spring custom event - " + message);
    }
}