package com.dashboard.dao;

import java.util.List;
import com.dashboard.model.StudentInformation;

public interface IStudentInformationDao {
	List<StudentInformation> getStudentInfo();
	void addStudentInfo(StudentInformation stdInfo);
	void updateStudentInfo(StudentInformation std);
	void deleteStudent(int id);
}
