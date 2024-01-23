package week3.ISP;

public class Cube implements Shape, ThreeDShape{
    public int edge;
    public Cube(int edge) {
        this.edge = edge;
    }
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volumn() {
        return edge * edge * edge;
    }
}
