package com.dashboard.service;

import java.util.List;

import com.dashboard.model.StudentInformation;

public interface IStudentInformationService {
	public List<StudentInformation> getStudentInfo();
	public void addStudentInfo(StudentInformation stdInfo);
	public void updateStudentInfo(StudentInformation std);
	public void deleteStudentInfo(int id);
}
