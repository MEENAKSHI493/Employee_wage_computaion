package com.Bridgelabz;

public class Employeewage {


	public static void main(String[] args) {
		System.out.println("wellcome to bridgelabz");
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");	
		int FullDay = 8;
		int WageParHour = 20;
		int empPresent = 1;		
		if (empCheck == empPresent) {
			int dailyWage = FullDay*WageParHour;
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage Is : "+ dailyWage);
		}else {
		System.out.println("Employee is Absent");
		}
		
	}

	}
}

