package com.spring.config;

import com.spring.pojoClass.Car;
import com.spring.pojoClass.Engine;
import com.spring.pojoClass.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.pojoClass")    //this is for Annotation based config using java config file.
public class Config {

    @Bean("stdId1")
    public Student stu()
    {
         Student st =  new Student();
         st.setName("Rojan");
         st.setAddress("tandi");
         st.setRollNo(2);
         return st;
    }


    //this is for setter methods injection using config file
//    @Bean
//    public Engine eng(){
//        Engine engine = new Engine();
//        engine.setEngNo(1);
//        engine.setEngType("type1");
//        return engine;
//    }
//
//    @Bean
//    public Car car(){
//        Car car = new Car();
//        car.setNo("12");
//        car.setName("ferrari");
//        car.setEngine(eng());
//        return car;
//    }


    //this is for constructor injection using java config file

    @Bean
    public Engine en() {
        Engine engi = new Engine(12,"type3");
        return engi;
    }


    @Bean
    public Car cr() {
        Car care = new Car("i2o","123",en());  //dependency injection using constructor
        return care;
    }
}
