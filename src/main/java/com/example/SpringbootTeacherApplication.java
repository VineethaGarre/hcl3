package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.beans.*;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringbootTeacherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTeacherApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootTeacherApplication.class, args);
    
		Teacher t1 = context.getBean(Teacher.class);
		t1.setExamtip("Do a lot of practice");
		t1.setHomework("Complete your first maths exercise");
		t1.setSubject("Maths");
		Teacher t2 = context.getBean(Teacher.class);
		t2.setExamtip("Read carefully");
		t2.setHomework("Complete ur first lesson");
		t2.setSubject("Science");
		Teacher t3 = context.getBean(Teacher.class);
		t3.setExamtip("write each question without any mistakes");
		t3.setHomework("Complete ur first lesson");
		t3.setSubject("Hindi");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		
		
	}
	

}
