package problem1;

import java.util.Comparator;

public class Student{
	String name;
	int age;
	int marks;
	String rollNumber;
	public Student() {
		super();
	}
	public Student(String name, int age, int marks, String rollNumber) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	
} 
