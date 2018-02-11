package com.javalec.ex;

public class Student {
	private String name;
	private String school;
	private int height;
	private int weight;
	
	
	public Student(String name, String school, int height, int weight) {
		super();
		this.name = name;
		this.school = school;
		this.height = height;
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public String getSchool() {
		return school;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	
	
	
	
}
