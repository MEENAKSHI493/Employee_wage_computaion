package com.Bridgelabz;

public class Employeewage {


	public static void main(String[] args) {
		int PartTimeHours = 4;
		int FullDay = 8;
		int WageParHour = 20;
		int empPresent = 1;
		int empPartTime = 2;
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		if (empCheck == empPresent) 
		{
			int dailyWage = FullDay*WageParHour;
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage Is : "+ dailyWage);
		}
		else if(empCheck == empPartTime)
		{
			int dailyWage = PartTimeHours*WageParHour;
			System.out.println("Employee Part Time is Present");
			System.out.println("Employee Part Time Wage Is : "+ dailyWage);
		}
		else 
		{
			System.out.println("Employee is Absent");
		}
	}


	}
    
	


