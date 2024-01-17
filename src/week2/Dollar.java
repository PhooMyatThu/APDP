package week2;

import java.util.Scanner;
public class Dollar {
    int price;
    public void billnote(int price)
    {
        int twenty = (price)/20;
        int after20s = (price)%20;
        int ten = (after20s)/10;
        int afterten = (after20s)%10;
        int five = (afterten)/5;
        int afterfive = (afterten)%5;
        int one = (afterfive)%5;
        System.out.printf("twentys %4d\n tens %4d\n five %4d\n one ",twenty,ten,five,one);
    }
    public static void main(String[] args) {
        new Dollar().billnote(90);





//        int twenty = price/20;
//        System.out.println("Amount of money hold 20 is "+twenty);
//        int ten = price/10;
//        System.out.println("Amount of money hold 20 is "+ten);
//        int five = price/5;
//        System.out.println("Amount of money hold 20 is "+five);
//        int one = price/1;
//        System.out.println("Amount of money hold 20 is "+one);
    }
}
