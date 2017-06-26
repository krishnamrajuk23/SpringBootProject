package com.dashboard.model;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentInformation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="rollno")
	private int rollno;
	
	@Column(name="dob")
	private Calendar dateofbirth;
	
	@Column(name="reg_no")
	private int registerationNo;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="mother_name")
	private String motherName;
	
	@Column(name="phone_no")
	private int phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="date_of_join")
	private Calendar date_of_join; 
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="class_id")
	private ClassesInfromation studentClass;
	
	@Column(name="gender")
	private String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Calendar getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Calendar dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getRegisterationNo() {
		return registerationNo;
	}

	public void setRegisterationNo(int registerationNo) {
		this.registerationNo = registerationNo;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Calendar getDate_of_join() {
		return date_of_join;
	}

	public void setDate_of_join(Calendar date_of_join) {
		this.date_of_join = date_of_join;
	}

	public String getStudentClass() {
		return studentClass.getClass_section();
	}

	public void setStudentClass(ClassesInfromation studentClass) {
		this.studentClass = studentClass;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
