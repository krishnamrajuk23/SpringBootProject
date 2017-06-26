package com.dashboard.dao;

import java.util.List;

import com.dashboard.model.StudentInformation;

public interface StudentInformationDao {
	List<StudentInformation> getStudentByClass(int classId);
}
