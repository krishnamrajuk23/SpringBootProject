package com.dashboard.service;

import java.util.List;

import com.dashboard.model.StudentInformation;

public interface StudentInformationService {
	
	public List<StudentInformation> getStudentInfo();
	public void addStudentInfo(StudentInformation stdInfo);
	public void updateStudentInfo(StudentInformation std);
	public void deleteStudentInfo(int id);
	public List<StudentInformation> getStudentByClass(int classId);
}
