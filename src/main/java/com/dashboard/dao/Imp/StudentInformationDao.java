package com.dashboard.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dashboard.dao.IStudentInformationDao;
import com.dashboard.model.StudentInformation;

@Transactional
@Repository
public class StudentInformationDao implements IStudentInformationDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<StudentInformation> getStudentInfo() {
		String studentQuery = "SELECT s FROM StudentInformation s ORDER BY s.id";
		List<StudentInformation> resultList = entityManager.createQuery(studentQuery).getResultList();
		return resultList;
	}

	@Override
	public void addStudentInfo(StudentInformation stdInfo) {
		entityManager.persist(stdInfo);
	}

	@Override
	public void updateStudentInfo(StudentInformation std) {
		StudentInformation stdObj = entityManager.find(StudentInformation.class, std.getId());
		stdObj.setName(std.getName());
		stdObj.setRollno(std.getRollno());
		entityManager.flush();
	}

	@Override
	public void deleteStudent(int id) {
		entityManager.remove(entityManager.find(StudentInformation.class, id));
	}
	
}
