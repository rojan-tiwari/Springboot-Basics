package com.spring.pojoClass;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component                   //it creates an object of Student i.e student
public class Student {
    @Value("Rojan")
    private String name;
    @Value("2")
    private  int rollNo;
    @Value("tandi")
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(rollNo);
    }

}
