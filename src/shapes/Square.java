package shapes;

import static net.mindview.util.Print.print;

import java.util.Scanner;

public class Square extends Rectangle {
	private Scanner scanner;

	// constructor
	public Square() {
		name = "Square";
	}

	// methods
	public void EnterSide() {
		print("Enter side of square: ");
		scanner = new Scanner(System.in);
		length = width = scanner.nextFloat();
	}
}
