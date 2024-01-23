package week3.Liskov;

public class Square extends Quadrangle {
    float length;
    public Square(float l) {
        length = l;

    }
    @Override
    float area() {
        return length * length;
    }
}
