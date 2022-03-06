package shapes;

import static net.mindview.util.Print.*;
import java.util.Scanner;

public class Square extends Rectangle {
	// constructor
	public Square() {
		name = "Square";
	}
	
	// methods
	public void EnterSide() {
		print("Enter side of square: ");
		Scanner scanner = new Scanner(System.in);
		length = width = scanner.nextFloat();
	}
}
