package week1;
class Box7{
    double width;
    double height;
    double depth;

    public Box7(double w, double h, double d) // argument condtructor
    {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        double result = width * height * depth;
        return result;
    }
}// class end
public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 box7 = new Box7(2,3,4);
                double volume = box7.volume();
        System.out.println("Volumn is "+volume);
    }
}
