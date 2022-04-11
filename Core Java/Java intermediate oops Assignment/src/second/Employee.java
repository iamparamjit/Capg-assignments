package second;

import java.util.ArrayList;

class Employee 
{

	int salary = 10000;
	int totalSal;
	
	
	public int getSalary(int salary) {
		return this.salary;
}

	public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries) {

		for (int i : employeeSalaries) {
			totalSal += i;
		}
		return totalSal;
	}
}

class Manager extends Employee {
	@Override
	public int getSalary(int salary) {
		int incentive = 5000;
		int total = incentive + salary;
		return total;
	}
}

class Labour extends Employee {
	@Override
	public int getSalary(int salary) {
		int overtime = 500;
		int total = overtime + salary;
		return total;
	}
}
