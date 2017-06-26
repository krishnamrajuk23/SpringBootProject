package com.dashboard.controller.Imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.controller.StudentInformationController;
import com.dashboard.model.StudentInformation;
import com.dashboard.service.StudentInformationService;

@RestController
public class StudentInformationControllerImp implements StudentInformationController {
	
	@Autowired
	private StudentInformationService studentService;

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
	
	
	@Override
	@RequestMapping(value="/student",method=RequestMethod.POST, produces="application/json")
	public Object addStudentInfo(@RequestBody StudentInformation stdInfo) {
		Map<String,String> obj = new HashMap<String,String>();
		try{
			studentService.addStudentInfo(stdInfo);
			obj.put("success", "Successfully saved");
		}
		catch(Exception e){
			e.printStackTrace();
			obj.put("error", "Error not save");
		}
		return obj;		
	}
	
	@Override
	@RequestMapping(value="/student",method=RequestMethod.PUT, produces="application/json")
	public Object updateStudentInfo(@RequestBody StudentInformation std) {
		Map<String,String> obj = new HashMap<String,String>();
		try{
			studentService.updateStudentInfo(std);
			obj.put("success", "Successfully Updated");
		}
		catch(Exception e){
			e.printStackTrace();
			obj.put("error", "Error not Updated");
		}
		return obj;
	}


	@Override
	@RequestMapping(value="/student/{id}",method=RequestMethod.DELETE, produces="application/json")
	public Object deleteStudentInfo(@PathVariable int id) {
		Map<String,String> obj = new HashMap<String,String>();
		try{
			studentService.deleteStudentInfo(id);
			obj.put("success", "Successfully Deleted");
		}
		catch(Exception e){
			e.printStackTrace();
			obj.put("error", "Error not save");
		}
		return obj;
	}


	@Override
	@RequestMapping(value="/student-class",method=RequestMethod.GET, produces="application/json")
	public Object getStudentByClass(@RequestParam("classId") int classId) {
		return studentService.getStudentByClass(classId);
	}
}
	