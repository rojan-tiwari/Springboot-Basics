package com.spring.config;

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


}
