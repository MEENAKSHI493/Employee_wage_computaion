package com.Bridgelabz;

public class Employeewage {

	public static void main(String[] args) {		 
		int FullDay = 8;
		int WageParHour = 20;
		int empPresent = 1;
		int empCheck = (int)Math.floor(Math.random() * 10) % 2;
		if (empCheck == empPresent) {
			int dailyWage = FullDay*WageParHour;
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage Is : "+ dailyWage);
		}else {
		System.out.println("Employee is Absent");
		}	
	}

}
