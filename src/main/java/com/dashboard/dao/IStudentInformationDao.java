package com.dashboard.dao;

import java.util.List;
import com.dashboard.model.StudentInformation;

public interface IStudentInformationDao {
	List<StudentInformation> getStudentInfo();
}
