package com.launchcode.Liftoffproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Member {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private boolean gender;
    public Member(){}

    public Member(String name, int age){
        this.name = name;
        this.age = age;


    }
    public int getAge(){return age;}
    public void setAge(int age){this.age=age;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }


    public Integer getId() {
        return id;
    }

}
