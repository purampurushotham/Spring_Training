package com.spring.mvc.tutorial.service;

import java.util.Date;

public class JavaBasedConfigService {
    public void log(String msg){
        System.out.println(new Date()+" "+msg);
    }
}
