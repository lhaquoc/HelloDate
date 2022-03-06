package chapter.everythingisobject.exercises;

import static net.mindview.util.Print.*;
import java.util.Scanner;

class Coordinate {
    int x;
    int y;
}

class Circle {
    // properties
    final float PI = 3.14f;
    float radius;
    float circumference;
    float area;
    Coordinate coordinate;

    // methods

    float CalculateCircumference() {
        circumference = 2 * PI * radius;
        return circumference;
    }

    float CalculateArea() {
        area = PI * radius * radius;
        return area;
    }

    void PrintCircumference() {
        print("Circumference = " + circumference);
    }

    void PrintArea() {
        print("Area = " + area);
    }

    void PrintRadius() {
        print("The radius of the circle: " + this.radius);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    boolean IsBigCircle() {
        if (radius > 30)
            return true;
        else
            return false;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setCoordinate(int x, int y) {
        this.coordinate = new Coordinate();
        this.coordinate.x = x;
        this.coordinate.y = y;
    }

    void PrintCoordinate() {
        print("The coordinate of the circle: ");
        print("x = " + this.coordinate.x);
        print("y = " + this.coordinate.y);
    }
}

public class ObjectExercise {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        // TODO Auto-generated method stub
        Circle circle = new Circle();
        // enter circle radius
        print("Enter radius of the circle:");
        
        float radius = scanner.nextFloat();
        circle.setRadius(radius);
        // enter circle coordinate
        Coordinate coordinate = new Coordinate();
        print("Enter coordinate of circle:");
        print("x = ");
        coordinate.x = scanner.nextInt();
        print("y = ");
        coordinate.y = scanner.nextInt();
        
        circle.setCoordinate(coordinate);
        
        // print out the result
        circle.PrintRadius();
        circle.PrintCoordinate();
        circle.CalculateCircumference();
        circle.CalculateArea();
        circle.PrintCircumference();
        circle.PrintArea();
    }

}
