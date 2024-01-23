package week3;

import java.util.Scanner;

public class StudentIDArray {
    public void getStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID number to check :");
        String id = sc.next();

        String[] ids = {"111111111","222222222","333333333","444444444","555555555"};
        String[] names = {"Mg Mg", "Aye Aye", "Myint Myint", "Kyaw Kyaw", "Su Su"};
        float[] gpas = {4.0f, 3.6f, 3.0f, 2.6f, 2.0f};
        boolean found =false;
        for (int i = 0; i < ids.length; i++)
        {
            if(id.equals(ids[i]))
            {
                System.out.println(ids[i]+ " "+ names[i]+ " "+ gpas[i]);
                found = true;
                break;
            }
        }
        if (!found)
        {
            System.out.println("Not found");
        }
    }
    public static void main(String[] args) {
        new StudentIDArray().getStudentInfo();
    }
}
