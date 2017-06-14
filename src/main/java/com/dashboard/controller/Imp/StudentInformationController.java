package com.dashboard.controller.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.controller.IStudentInformationController;
import com.dashboard.model.StudentInformation;
import com.dashboard.service.IStudentInformationService;

@RestController
public class StudentInformationController implements IStudentInformationController {
	@Autowired
	private IStudentInformationService studentService;

	@GetMapping("string")
	public String getString() {
		String str = "Hello world";
		return str;
	}

	@Override
	@RequestMapping(value="/student",method=RequestMethod.GET, produces="application/json")
	public List<StudentInformation> getStudentInfo() {
		List<StudentInformation> stdService = studentService.getStudentInfo();
		return stdService;
	}


}
	