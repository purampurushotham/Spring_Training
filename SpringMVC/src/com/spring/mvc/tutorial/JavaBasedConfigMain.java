package com.spring.mvc.tutorial;

import com.spring.mvc.tutorial.controller.JavaBasedConfig;
import com.spring.mvc.tutorial.service.JavaBasedConfigService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigMain {
    public static void main(String args[]){
        /*AnnotationConfigApplicationContext*/
        /*Standalone application context, accepting annotated classes as input - in particular @Configuration-annotated classes, but also plain @Component types*/
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
        JavaBasedConfigService javaBasedConfigService = annotationConfigApplicationContext.getBean(JavaBasedConfigService.class);
        JavaBasedConfigService newjavaBasedConfigService = annotationConfigApplicationContext.getBean(JavaBasedConfigService.class);
        /* calling getBean method two times and printing the hashcode*/
        System.out.println("service hashcode="+javaBasedConfigService.hashCode());
        System.out.println("newService hashcode="+newjavaBasedConfigService.hashCode());
        annotationConfigApplicationContext.close();
        /**/
    }
}
