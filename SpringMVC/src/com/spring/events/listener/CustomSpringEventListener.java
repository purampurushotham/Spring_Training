package com.spring.events.listener;

import com.spring.events.CustomSpringEvent;
import org.springframework.context.ApplicationListener;

public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent>{
    @Override
    public void onApplicationEvent(CustomSpringEvent customSpringEvent) {
        System.out.println("Receiving Custom Events");
        System.out.println(customSpringEvent.getMessage());
    }
}