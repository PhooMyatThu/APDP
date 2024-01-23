package week3;

public class Rectangle extends Quadrangle{
    float widht;
    float height;
    public  Rectangle(float w, float h)
    {
        widht = w;
        height = h;
    }
    @Override
    float area() {
        return widht * height;
    }
}
