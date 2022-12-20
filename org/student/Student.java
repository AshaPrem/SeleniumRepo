package org.student;

import org.college.College;

public class Student extends College implements Department {
	
	
	/*
	 * Assignment2:
	=============
	     Package   :org.college
	     Class     :College
	     Methods   :collegeName(),collegeCode(),collegeRank()

	     Package   :org.department
	     Class        :Department
	     Methods   :deptName()
	 
	     Package   :org.student
	     Class        :Student
	     Methods   :studentName(),studentDept(),studentId()
	  
	Description:
	create above 3 class and call all your class methods into the Student using multilevel inheritance.
	 * 
	 * 
	 */
	
	public void studentName() {
		System.out.println("P. Asha");
		
	}
	public void studentDept() {
		System.out.println("M.Sc");
		
	}
	
	public void studentId() {
		System.out.println("123");
	}

	public static void main(String[] args) {
		

	}
	public void deptName() {
		// TODO Auto-generated method stub
		
	}

}
