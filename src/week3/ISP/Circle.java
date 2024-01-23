package week3.ISP;

public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
