package com.dashboard.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.dao.StudentDao;
import com.dashboard.dao.StudentInformationDao;
import com.dashboard.model.StudentInformation;
import com.dashboard.service.StudentInformationService;

@Service
public class StudentInformationServiceImpl implements StudentInformationService{
	
	@Autowired
	private StudentDao studentInfDao;
	
	@Autowired
	private StudentInformationDao stdDao;
	
	@Override
	public List<StudentInformation> getStudentInfo() {		
		return (List<StudentInformation>) studentInfDao.findAll();
	}

	@Override
	public void addStudentInfo(StudentInformation stdInfo) {
		studentInfDao.save(stdInfo);
	}

	@Override
	public void updateStudentInfo(StudentInformation std) {
		studentInfDao.save(std);
	}

	@Override
	public void deleteStudentInfo(int id) {
		studentInfDao.delete(id);
	}


	@Override
	public List<StudentInformation> getStudentByClass(int classId) {
		return stdDao.getStudentByClass(classId);
	}

}