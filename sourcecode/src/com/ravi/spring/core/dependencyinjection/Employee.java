package com.ravi.spring.core.dependencyinjection;

public class Employee {
	int empID;
	String empName;
	char empGender;
	Address address;

	public Employee() {
		System.out.println("--Employee object constructed--");
	}

	// Constructor injection
	public Employee(Address address) {
		System.out.println("--Constructor Injection--");
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	// setter Injection
	public void setAddress(Address address) {
		System.out.println("--Setter Injection--");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName
				+ ", empGender=" + empGender + ", address=" + address + "]";
	}

	
}
