package Problem2;

public class Demo {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1.0f, 2.0f, 3f, 4f);
        System.out.println("Before moving: " + point);
        point.move();
        System.out.println("After moving: " + point);
    }
}
