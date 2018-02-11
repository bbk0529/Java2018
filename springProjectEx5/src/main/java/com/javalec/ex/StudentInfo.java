package com.javalec.ex;

public class StudentInfo {

	public Student student;
	
	

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getInfo() {
		System.out.println(student.getName());
		System.out.println(student.getSchool());
		System.out.println(student.getHeight());
		System.out.println(student.getWeight());
	}
	
}
