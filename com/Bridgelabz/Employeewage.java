package com.Bridgelabz;

public class Employeewage {

	public static void calculateWages(int FullDayHr, int PartTimeHr, int WagePerHr, String companyName) {
		int day = 0;
		int empHr = 0;
		int wage = 0;
		while (day <= 19) {
			int n = (int) (Math.random() * 10) % 3;
			switch (n) {
			case 1:
//System.out.println("present fullday");
				wage = (wage + (WagePerHr * FullDayHr));
				empHr = (empHr + FullDayHr);
				day++;
				break;
			case 2:
//System.out.println("present PartTime");
				wage = (wage + (WagePerHr * PartTimeHr));
				empHr = (empHr + PartTimeHr);
				day++;
				break;
			default:
//System.out.println("absent");
				day++;
				if (empHr == 100)
					break;
			}
		}
		System.out.println("Calculate Wages For :" + companyName);
		System.out.println("EmpHr :" + empHr);
		System.out.println("Day :" + day);
		System.out.println("Total Wage is :" + wage);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		calculateWages(8, 2, 20, "Dmart");
		calculateWages(8, 4, 20, "Reliance Digital");
		calculateWages(8, 6, 20, "Patrol Pump");
	}

}
