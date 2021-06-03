package com.codingage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.codingage.beans.Student;

@SpringBootApplication
public class SpringBootDpDependencyInjectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(SpringBootDpDependencyInjectionApplication.class, args);
		Student st=ctx.getBean("stud",Student.class);
		st.prepration("java");
	
		
		
	}

}
