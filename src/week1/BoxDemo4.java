package week1;
class Box4{
    double width;
    double height;
    double depth;
    double volumn()
    {
        return width * height * depth;
    }
    void setDim(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
}
public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 box41 = new Box4();
        box41.width = 3;
        box41.height = 2;
        box41.depth = 4;
        Box4 box42 = new Box4();
        box42.width = 4;
        box42.height = 5;
        box42.depth = 6;
        double vol = box41.volumn();
        System.out.println("Box41 volumn is "+vol);
        vol = box42.volumn();
        System.out.println("Box42 volumn is "+vol);
        // testing setDim method void parameter
        Box4 box43 = new Box4();
        box43.setDim(5.5,6,7);
        vol = box43.volumn();
        System.out.println("Box43 volumn is "+vol);
    }// add main
}
