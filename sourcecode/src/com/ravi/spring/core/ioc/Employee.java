package com.ravi.spring.core.ioc;

public class Employee {
	int empID;
	String empName;
	char empGender;

	public Employee() {
		System.out.println("--Employee object constructed--");
	}

	public Employee(int empID, String empName, char empGender) {
		this.empID = empID;
		this.empName = empName;
		this.empGender = empGender;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public char getEmpGender() {
		return empGender;
	}

	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName
				+ ", empGender=" + empGender + "]";
	}

}
