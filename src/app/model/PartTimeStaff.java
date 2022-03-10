package app.model;

import app.util.Configs;

public class PartTimeStaff extends Staff {
	private int numberWorkHour;
	public PartTimeStaff(String name, int numberWorkHour) {
		this.name = name;
		this.numberWorkHour = numberWorkHour;
	}
	
	@Override
	protected String StaffType() {
		// TODO Auto-generated method stub
		return "Part-time staff";
	}

	@Override
	public void CalculateSalary() {
		salary = Configs.SALARY_PARTTIME_ONE_HOUR * numberWorkHour;
	}
}
