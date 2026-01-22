package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CourseRegistration 
{
	@Value("101")
	private int rollno;
	@Value("BALA")
	private String studentName;
	@Value("FSAD")
	private String courseName;
	@Value("4")
	private int semester;
	
	public CourseRegistration(int rollno,String studentName, String courseName, int semester)
	{
		this.rollno=rollno;
		this.studentName=studentName;
		this.courseName=courseName;
		this.semester=semester;
	}
	
	public void display()
	{
		System.out.println("RollNo: "+rollno);
		System.out.println("Name: "+studentName);
		System.out.println("CourseName: "+courseName);
		System.out.println("Semester: "+semester);
	}
	

}
