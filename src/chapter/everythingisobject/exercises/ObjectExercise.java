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
    void EnterRadius() {
        print("Enter radius of the circle:");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextFloat();
    }

    float CalculateCircumference() {
        circumference = 2 * PI * radius;
        return circumference;
    }

    void CalculateArea() {
        area = PI * radius * radius;
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

    void EnterCoordinate() {
        coordinate = new Coordinate();
        Scanner scanner = new Scanner(System.in);
        print("x = ");
        coordinate.x = scanner.nextInt();
        print("y = ");
        coordinate.y = scanner.nextInt();
    }

    void PrintCoordinate() {
        print("The coordinate of the circle: ");
        print("x = " + this.coordinate.x);
        print("y = " + this.coordinate.y);
    }
}

public class ObjectExercise {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Circle circle = new Circle();
        // enter circle radius
        circle.EnterRadius();
        // enter circle coordinate
        circle.EnterCoordinate();
        Coordinate coordinate = circle.getCoordinate();
        print("The coordinate of circle is: x = " + coordinate.x + ", y = " + coordinate.y);

        if (circle.IsBigCircle()) {
            print("The radius of the circle = " + circle.getRadius() + " is too big");
        } else {
            float circumference = circle.CalculateCircumference();
            print("The radius of the cirlce = " + circle.getRadius() + " , circumference = " + circumference);
        }
    }

}
