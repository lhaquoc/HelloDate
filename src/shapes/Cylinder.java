package shapes;
import static net.mindview.util.Print.*;

import java.util.Scanner;
public class Cylinder extends Circle {
	// properties
	private Scanner scanner;
	protected float height;
	// constructor
	public Cylinder() {
		scanner = new Scanner(System.in);
		name = "Cylinder";
	}
	// methods
	
	
	public void EnterHeight() {
//		EnterRadius();
		print("Enter height of the cylinder: ");
		scanner = new Scanner(System.in);
		height = scanner.nextFloat();
	}
	
	@Override
	public void EnterRadius() {
		// TODO Auto-generated method stub
		print("Enter radius of the cylinder base: ");
    	radius = scanner.nextFloat();
	}


	@Override
	public void PrintInfo() {
		// TODO Auto-generated method stub
		print("This is a cylinder.");
	}


	public void CalculateVolume() {
		CalculateArea();
		volume = area * height;
	}
}
