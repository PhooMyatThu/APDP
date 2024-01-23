package week3.ISP;

public class SegregationTest {

    public static void main (String[] args) {
        Circle circle = new Circle(50);
        Cube cube = new Cube(100);
        double area1 = circle.area();
        System.out.println("Circle area is "+area1);
        double area2 = cube.area();
        System.out.println("Cube area is "+area2);
        double volumn = cube.volumn();
        System.out.println("Cube volumn is "+cube);


    }
}
