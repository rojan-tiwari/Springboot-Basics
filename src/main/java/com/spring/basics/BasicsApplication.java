package com.spring.basics;

import com.spring.config.Config;
import com.spring.pojoClass.Car;
import com.spring.pojoClass.Student;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class BasicsApplication {

	public static void main(String[] args)  {
		    //Using xml file config
//			String config_loc = "applicationContext.xml";
//			ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
//			Student std = (Student) context.getBean("stdId");
//			std.display();


		    //Using java file config
//			ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
//		     Student std = (Student) context1.getBean("stdId1");
//	     	std.display();


		    //Using Annotation Based configuration
//	    	String config_loc = "applicationContext.xml";
//			ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
//			Student std = (Student) context.getBean("student");
//			std.display();


		    //this is for dependency injection using XMl file
//			String config_loc = "dependencyInjection.xml";
//			ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
//			Car std = (Car) context.getBean("cary");
//			std.display();


            //this is for dependency injection using java config file
//			ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//			Car std = (Car) context.getBean("car");
//			std.display();
		
		    //this is for jdbc
		   DataSource dataSource = new DriverManagerDataSource();
		   
	}

}
