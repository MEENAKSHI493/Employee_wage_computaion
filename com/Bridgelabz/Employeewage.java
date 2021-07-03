package com.Bridgelabz;

public class Employeewage {


	public static void main(String[] args) {

		int FullDayHr=8;
		int PartTimeHr=4;
		int WagePerHr=20;
		int day=0;
		int empHr=0;
		int wage = 0;
		while (day <= 19) {
			int n = (int) (Math.random() * 10) % 3;
		switch (n) {
		case 1:
			System.out.println("present fullday");
			wage = (wage + (WagePerHr * FullDayHr));
            empHr=(empHr+ FullDayHr);
			day++;
			break;
		case 2:
			System.out.println("present PartTime");
			wage = (wage + (WagePerHr * PartTimeHr));
			empHr=(empHr+ PartTimeHr);
			day++;
			break;
		default:
			System.out.println("absent");
		    day++;
			if( empHr == 100)
				break;
		}
		 }
		System.out.println("total wage of a month is");
		System.out.println(wage);
		System.out.println(empHr);
		System.out.println(day);
	}
	
	
}

	


