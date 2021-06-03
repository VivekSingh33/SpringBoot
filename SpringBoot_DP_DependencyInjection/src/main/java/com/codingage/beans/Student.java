package com.codingage.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stud")
public final class Student {
	
	
	@Autowired
	private CourseMaterial material; // HAS-A property
	
	public Student() {
		System.out.println("no arg constructor");
	}
	public void prepration(String examname) {
		String course=material.courseContent();
		double price=material.price();
		System.out.println("ExamNAme"+examname+"CousreContent"+course+"Price"+price);
	}


}
	




