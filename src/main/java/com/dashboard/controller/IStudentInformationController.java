package com.dashboard.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.dashboard.model.StudentInformation;

@RequestMapping("/api-content")
public interface IStudentInformationController {
	
	public String getString();	
	/**
	 * Get student information from Database
	 */
	public List<StudentInformation> getStudentInfo();
	/**
	 * Add new student information into Database
	 */
	public Object addStudentInfo(StudentInformation stdInfo);
	/**
	 * Update student information in Database 
	 */
	public Object updateStudentInfo(StudentInformation std);
	/**
	 * 
	 */
	public Object deleteStudentInfo(int id);
}
