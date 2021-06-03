
package com.codingage.beans;

import org.springframework.stereotype.Component;

//implementation class
@Component("ui")
public final class UICourseMaterial implements CourseMaterial {

	@Override
	public String courseContent() {
		System.out.println("UICourseContent");

		return "UI HTML";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 300;
	}}

