package com.spring.pojoClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private  String name;
    private  String no;

    @Autowired
    private Engine engine;

//setter dependency injection
    public void setName(String name) {
        this.name = name;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

//constructor dependency injection
//    public Car(String name, String no, Engine engine) {
//        this.name = name;
//        this.no = no;
//        this.engine = engine;
//    }

    public void display(){
        System.out.println(name);
        System.out.println(no);
        System.out.println(engine);
    }
}
