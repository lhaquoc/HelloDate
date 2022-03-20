package main;

import static net.mindview.util.Print.print;

import java.util.Scanner;

import app.model.FulltimeStaff;
import app.model.PartTimeStaff;
import app.model.Staff;

public class StaffManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// there are 2 fulltime staff, 1 fulltime manager (0 overtime day)
//		FulltimeStaff manager =  new FulltimeStaff("Ronnal Reagan");
//		manager.setLevel(Configs.STAFF_MANAGER);
//		FulltimeStaff staff1 =  new FulltimeStaff("Jimmy Carter"); // 0 overtime day
//		FulltimeStaff staff2 =  new FulltimeStaff("Barrack Obama", 3); // 3 overtime days

		// calculate salary
//		manager.CalculateSalary();
//		staff1.CalculateSalary();
//		staff2.CalculateSalary();
//		manager.PrintInfo();
//		staff1.PrintInfo();
//		staff2.PrintInfo();

		// 1 part-time staff, work 30h/week
//		PartTimeStaff partTimeStaff = new PartTimeStaff("Joe Biden", 120);
//		partTimeStaff.CalculateSalary();
//		partTimeStaff.PrintInfo();

		// improvement
		// input the number of staffs
		Scanner scanner = new Scanner(System.in);
		print("Enter the number of staffs: ");
		int numberStaffs = Integer.parseInt(scanner.nextLine());

		Staff[] staffArray = new Staff[numberStaffs];
		for(int i = 0; i < numberStaffs; i++) {
			print("Name of staff " + (i + 1) + ": ");
			String name = scanner.nextLine();
			print("is (1 - Fulltime or 2 - Part-time)");
			int staffType = Integer.parseInt(scanner.nextLine());
			if(staffType == 1) {
				// fulltime
				print("Level (1 - Manager, 2 - Staff):");
				int level = Integer.parseInt(scanner.nextLine());
				print("Overtime day (if have): ");
				int overtimeDay = Integer.parseInt(scanner.nextLine());
				staffArray[i] = new FulltimeStaff(name, overtimeDay, level);
			} else {
				print("number of working hours: ");
				int workingHours = Integer.parseInt(scanner.nextLine());
				staffArray[i] = new PartTimeStaff(name, workingHours);
			}
		}
		print("Salary result: ");
		for(Staff staff : staffArray) {
			staff.CalculateSalary();
			staff.PrintInfo();
		}
	}

}
