package week3;

public class TableOfSquares {
    public void getSquare() {
        int square;
        for(int i = 1; i <= 20; i++)
        {
            square = i * i;
            System.out.println(i+" = "+square);
        }
    }
    public static void main(String[] args){
        new TableOfSquares().getSquare();
    }

}
