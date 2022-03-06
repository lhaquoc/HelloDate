package shapes;

import static net.mindview.util.Print.*;

import java.util.Scanner;

public class Circle extends Shapes {
	// properties
    float radius;
    
    // constructor
    public Circle() {
    	name = "Circle";
    }
    public Circle(float radius) {
    	this.radius = radius;
    }
    // methods

    public void EnterRadius() {
    	print("Enter radius of the circle: ");
    	Scanner scanner = new Scanner(System.in);
    	radius = scanner.nextFloat();
    }
    
    public void CalculateCircumference() {
        circumference = 2 * PI * radius;
    }

    public void CalculateArea() {
        area = PI * radius * radius;
    }
}

