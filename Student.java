package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name: Ponsangkar");
	}
	public void studentDept() {
		System.out.println("Department Name: Civil");
	}
	public void studentId() {
		System.out.println("ID No: 22CER070");
	}
	
	public static void main(String[] args) {
		
		Student studentDetails = new Student();
		
		studentDetails.collegeCode();
		studentDetails.collegeName();
		studentDetails.collegeRank();
		studentDetails.departmentName();
		studentDetails.studentDept();
		studentDetails.studentId();
		studentDetails.studentName();
	}
}
