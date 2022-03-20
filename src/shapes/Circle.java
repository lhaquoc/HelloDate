package shapes;

import static net.mindview.util.Print.print;

import java.util.Scanner;

public class Circle extends Shapes {
	// properties
	private Scanner scanner;
    protected float radius;

    // constructor
    public Circle() {
    	super();
    	scanner = new Scanner(System.in);
    	name = "Circle";
    }
    public Circle(float radius) {
    	this.radius = radius;
    }
    // methods

    public void PrintInfo() {
    	print("This is a circle.");
    	if(Configs.unit == Configs.UNIT_CM) {
    		print("The circle has radius = " + radius + " (cm)");
    		print("Equals " + Configs.CentimiterToInch(radius) + " (inch)");
    	} else {
    		print("The circle has radius = " + radius + " (inch)");
    		print("Equals " + Configs.InchToCentimiter(radius) + " (cm)");
    	}
    }

    public void EnterRadius() {
    	// choose the unit cm/inch
    	print("Enter to choose the unit:\n");
    	print("\t1 - Centimeter");
    	print("\t2 - Inch");
    	Configs.unit = scanner.nextInt();
    	if(Configs.unit == Configs.UNIT_CM) {
    		print("Enter radius of the circle (cm): ");
    	} else {
    		print("Enter radius of the circle (inch): ");
    	}

    	radius = scanner.nextFloat();
    }

    public void CalculateCircumference() {
        circumference = 2 * PI * radius;
    }

    public void CalculateArea() {
        area = PI * radius * radius;
    }
}

