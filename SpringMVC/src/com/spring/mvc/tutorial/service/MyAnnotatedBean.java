package com.spring.mvc.tutorial.service;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
@Service
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class MyAnnotatedBean {
    private int id;
    public MyAnnotatedBean(){
        System.out.println("Default constructor is called");
    }
    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
