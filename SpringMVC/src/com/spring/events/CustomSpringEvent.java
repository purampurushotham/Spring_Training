package com.spring.events;

import com.spring.mvc.tutorial.modal.User;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
public class CustomSpringEvent extends ApplicationEvent {
    private String message;
    private User user;
    public CustomSpringEvent(Object source,String message,User user) {
        super(source);
        this.message = message;
        this.user = user;
    }
}