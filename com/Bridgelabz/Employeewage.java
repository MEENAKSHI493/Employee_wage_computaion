package com.Bridgelabz;

public class Employeewage {

	public static void main(String[] args) {
	
	  System.out.println("----Starts To Check EmployeePresentorNot-----");
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
		System.out.println("---- End To Check EmployeePresentorNot-----");
	}

}
