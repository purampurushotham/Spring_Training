package com.spring.events;

import com.spring.events.publisher.CustomSpringEventPublisher;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyEventMain {
    public static void main(String args[]) throws BeansException{
        ApplicationContext context =  new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        /*new ClassPathXmlApplicationContext("src/WEBapplication-context.xml"})*/
        CustomSpringEventPublisher publisher = context.getBean(CustomSpringEventPublisher.class);
        publisher.doProcessAndPublishAnEvent("custom event Raising");
    }
}
