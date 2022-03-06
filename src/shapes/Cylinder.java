package shapes;
import static net.mindview.util.Print.*;

import java.util.Scanner;
public class Cylinder extends Circle {
	// properties
	float height;
	// constructor
	public Cylinder() {
		name = "Cylinder";
	}
	// methods
	public void EnterHeight() {
		EnterRadius();
		print("Enter height of the cylinder: ");
		Scanner scanner = new Scanner(System.in);
		height = scanner.nextFloat();
	}
	
	public void CalculateVolume() {
		CalculateArea();
		volume = area * height;
	}
}
