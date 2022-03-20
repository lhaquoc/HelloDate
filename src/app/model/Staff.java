package app.model;
import static net.mindview.util.Print.print;
public class Staff {
	protected String name;
	protected long salary;

	public Staff() {}
	public Staff(String name) {
		this.name = name;
	}
	protected String StaffType() {
		return "";
	}
	public void PrintInfo() {
		print("===== Staff: " + name + " =====");
		print("- Staff type: " + StaffType());
		print("- Salary: " + salary + " VND");
	}
	public void CalculateSalary() {

	}
}
