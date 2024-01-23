package week3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GetDigit {
    public void checkDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit :");
        char c = sc.next().charAt(0);

        if(Character.isDigit(c))
        {
            System.out.println("You entered not a digit");
        }
        else
        {
            System.out.println("You entered a digit");
        }
    }
    public static void main(String[] args) {
        new GetDigit().checkDigit();
        //GetDigit().digit = new GetDigit();
        //digit.checkDigit();
    }
}