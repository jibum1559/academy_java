package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.StudentModel;

public class StudentController {
	
	private StudentModel stumodel;
	private StudentView stuview;
	
	public StudentController(StudentModel stumodel, StudentView stuview) {
		this.stumodel = stumodel;
		this.stuview = stuview;
	}
	
	
	
}
