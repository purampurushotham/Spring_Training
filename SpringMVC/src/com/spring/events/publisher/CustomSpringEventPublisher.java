package com.spring.events.publisher;

import com.spring.events.CustomSpringEvent;
import com.spring.mvc.tutorial.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomSpringEventPublisher implements ApplicationEventPublisherAware {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    public void doProcessAndPublishAnEvent(String message, User user) {
        System.out.println("Publishing custom event. ");
        applicationEventPublisher.publishEvent(new CustomSpringEvent(this,message,user));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}