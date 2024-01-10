package com.spring.basics;

import com.spring.pojoClass.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BasicsApplication {

	public static void main(String[] args)  {
			String config_loc = "applicationContext.xml";    //Using xml file
			ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
			Student std = (Student) context.getBean("stdId");
			std.display();
	}

}
