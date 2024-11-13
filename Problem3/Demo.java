package Problem3;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle", 5.0),
            new Ellipse("Ellipse", 7.0, 5.0),
            new Triangle("Triangle", 3.0, 4.0, 5.0),
            new EquilateralTriangle("Equilateral Triangle", 6.0)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

