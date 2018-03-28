package com.hibernate.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name ="user",uniqueConstraints = {@UniqueConstraint(columnNames = {"ID"})})
public class userTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID",nullable = false,unique = true,length = 3)
    private int id;

    @Column(name="FIRSTNAME",length = 20,nullable = true)
    private String firstName;
    @Column(name = "LASTNAME",length = 20,nullable = true)
    private String lastName;

    @Column(name="AGE",length = 2,nullable = true)
    private int age;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
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

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

}
