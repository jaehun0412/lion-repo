package day05;

class Circle {
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public void displayInfo() {
        System.out.println("원의 반지름: " + radius);
        System.out.println("원의 면적: " + getArea());
        System.out.println("원의 둘레: " + getCircumference());
    }
}

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void displayInfo() {
        System.out.println("사각형 크기: " + width + " x " + height);
        System.out.println("사각형 넓이: " + getArea());
        System.out.println("사각형 둘레: " + getPerimeter());
    }
}

public class ShapeMain {

    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(8, 3);

        circle.displayInfo();
        System.out.println("-----");
        rectangle.displayInfo();
    }
}
