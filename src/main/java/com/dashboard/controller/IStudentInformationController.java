package com.dashboard.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.dashboard.model.StudentInformation;

@RequestMapping("/api-content")
public interface IStudentInformationController {
	
	public String getString();	
	public List<StudentInformation> getStudentInfo();
}
