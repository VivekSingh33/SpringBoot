	package com.codingage.beans;
	//implementation class
	import org.springframework.context.annotation.Primary;
	import org.springframework.stereotype.Component;
	
	@Component("java")
	@Primary
	public final class JavaCourseMaterial implements CourseMaterial {
		public JavaCourseMaterial() {
			System.out.println("0 param constructor");
		}
		@Override
		public String courseContent() {
			System.out.println("JavaCourseContent");
	
		return "java oops";
		}
		@Override
		public double price() {
	
		return 400;
		}
}