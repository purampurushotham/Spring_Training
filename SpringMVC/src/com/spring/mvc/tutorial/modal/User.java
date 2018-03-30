package com.spring.mvc.tutorial.modal;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class User{
    private String firstName,lastName;
    private int age;
    public User(){
        System.out.println("Private default constructor");
    }
    private User(String firstName,String lastName,int age){
        System.out.println("Private param constructor");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println("FirstName"+this.firstName+" Lastname:"+this.lastName+"age"+this.age);
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }

    public String getLastName() {
        return this.lastName;
    }
}
