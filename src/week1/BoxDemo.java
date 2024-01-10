package week1;

class Box{
    float width; // instance variable
    float height; // instance variable
    float depth; // instance variable
}// defined the class box
public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        box.width = 70;
        box.depth = 50;
        box.height = 20;
        float volumn =  box.depth * box.height * box.width;
        System.out.println("Volumn of box is "+volumn);

    }
}
