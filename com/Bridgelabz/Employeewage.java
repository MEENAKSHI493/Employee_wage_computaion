package com.Bridgelabz;

public class Employeewage {


	public static void main(String[] args) {
		int PartTimeHours = 4;
		int FullDay = 8;
		int WageParHour = 20;
		final int empPresent = 1;
		final int empPartTime = 2;
		int dailyWage = 0;

		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		
		switch (empCheck) {
		case empPresent:
			dailyWage = FullDay*WageParHour;
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage Is : "+ dailyWage);
			break;
		case empPartTime:{
			dailyWage = PartTimeHours*WageParHour;
			System.out.println("Employee Part Time is Present");
			System.out.println("Employee Part Time Wage Is : "+ dailyWage);
			break;
		}
		default:
			System.out.println("Employee is Absent");
			break;
		}
	}

	}
    
	


