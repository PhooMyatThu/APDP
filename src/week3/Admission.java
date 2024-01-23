package week3;

import java.util.Scanner;

public class Admission {
    public void getScore() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter grade point average :");
        float gpa = sc.nextFloat();
        System.out.print("Enter test score :");
        int score = sc.nextInt();

        if ((gpa <= 3.6 && score >= 60) || (gpa <= 3.0 && score >= 70) || (gpa <= 2.6 && score >= 80) || (gpa <= 2.0 && score >= 90))
        {
            System.out.println("Accept");
        }
        else
        {
            System.out.println("Reject");
        }
    }

    public static void main(String[] args){
        new Admission().getScore();
    }
}
