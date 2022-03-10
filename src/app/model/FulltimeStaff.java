package app.model;
import app.util.Configs;
public class FulltimeStaff extends Staff {
	private int numberOverTimeDay;
	private int level;
	public FulltimeStaff(String name) {
		super(name);
		this.level = Configs.STAFF;
	}
	public FulltimeStaff(String name, int numberOverTimeDay, int level) {
		super(name);
		this.numberOverTimeDay = numberOverTimeDay;
		this.level = level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	protected String StaffType() {
		// TODO Auto-generated method stub
		if(level == Configs.STAFF)
			return "Fulltime staff" + (numberOverTimeDay > 0 ? " (has overtime day)":"");
		else
			return "Fulltime manager" + (numberOverTimeDay > 0 ? " (has overtime day)":"");
	}
	@Override
	public void CalculateSalary() {
		if(level == Configs.STAFF)
			salary = Configs.SALARY_FULLTIME_STAFF + numberOverTimeDay * Configs.SALARY_OVER_TIME_ONE_DAY;
		else if(level == Configs.STAFF_MANAGER)
			salary = Configs.SALARY_FULLTIME_MANAGER + numberOverTimeDay * Configs.SALARY_OVER_TIME_ONE_DAY;
			
	}
}
