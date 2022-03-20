package shapes;

import static net.mindview.util.Print.print;

import java.util.Scanner;

public class Rectangle extends Shapes {
	// properties
	private Scanner scanner;
    protected float length;
    protected float width;

    // constructor
    public Rectangle() {
    	super();
    	name = "Rectangle";
    }
    public Rectangle(float length, float width) {
    	name = "Rectangle";
    	this.length = length;
    	this.width = width;
    }

    // methods

    public void EnterLength() {
    	print("Enter length of the rectangle: ");
    	scanner = new Scanner(System.in);
    	length = scanner.nextFloat();
    }

    public void EnterWidth() {
    	print("Enter width of the rectangle: ");
    	scanner = new Scanner(System.in);
    	width = scanner.nextFloat();
    }

    public void CalculateCircumference() {
        circumference = 2 * (length + width);
    }

    public void CalculateArea() {
        area = length * width;
    }
}
