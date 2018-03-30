package com.spring.events;

import com.spring.mvc.tutorial.modal.User;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
public class CustomSpringEvent extends ApplicationEvent {
    private String message;
    public CustomSpringEvent(Object source,String message) {
        super(source);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}