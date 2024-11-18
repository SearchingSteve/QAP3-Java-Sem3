package Problem4;

public class Ellipse extends Shape {
    private double a; // major axis
    private double b; // minor axis

    public Ellipse(String name, double a, double b) {
        super(name);
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * Math.sqrt((a * a + b * b) / 2);
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major Axis: " + a + ", Minor Axis: " + b;
    }
}


