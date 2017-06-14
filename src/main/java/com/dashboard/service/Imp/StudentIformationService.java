package com.dashboard.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.dao.IStudentInformationDao;
import com.dashboard.model.StudentInformation;
import com.dashboard.service.IStudentInformationService;
@Service
public class StudentIformationService implements IStudentInformationService{
	@Autowired
	private IStudentInformationDao studentInfDao;
	
	@Override
	public List<StudentInformation> getStudentInfo() {		
		return studentInfDao.getStudentInfo();
	}


}
