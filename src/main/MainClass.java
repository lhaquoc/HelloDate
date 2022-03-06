package main;
import static net.mindview.util.Print.*;
import shapes.Circle;
import shapes.Cylinder;
import shapes.Rectangle;
import shapes.Square;

public class MainClass {

	public static void main(String[] args) {
		// circle
		Circle circle = new Circle();
		circle.PrintName();
		circle.EnterRadius();
		circle.CalculateCircumference();
		circle.CalculateArea();
		circle.PrintCircumference();
		circle.PrintArea();
		
		// circle 2
//		Circle circle2 = new Circle(10);
//		circle2.CalculateCircumference();
//		circle2.CalculateArea();
//		circle2.PrintCircumference();
//		circle2.PrintArea();
		
		// cylinder
		Cylinder cylinder = new Cylinder();
		cylinder.PrintName();
		cylinder.EnterHeight();
		cylinder.CalculateVolume();
		cylinder.PrintVolume();
		
		// rectangle
		Rectangle rectangle = new Rectangle();
		rectangle.PrintName();
		rectangle.EnterLength();
		rectangle.EnterWidth();
		rectangle.CalculateCircumference();
		rectangle.CalculateArea();
		rectangle.PrintCircumference();
		rectangle.PrintArea();
		
		// square
		Square square = new Square();
		square.PrintName();
		square.EnterSide();
		square.CalculateCircumference();
		square.CalculateArea();
		square.PrintCircumference();
		square.PrintArea();
	}

}
