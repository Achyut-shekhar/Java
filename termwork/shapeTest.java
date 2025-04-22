import java.util.*;
abstract class Shape {
    abstract void rectangleArea(double length, double breadth);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}

class Area extends Shape {
    void rectangleArea(double length, double breadth) {   //@override
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    void squareArea(double side) {   //@override
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
    void circleArea(double radius) {   //@override
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class shapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Area();
        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        shape.rectangleArea(length, breadth);
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        shape.squareArea(side);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        shape.circleArea(radius);  }
}
