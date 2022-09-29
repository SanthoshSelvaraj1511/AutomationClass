package programs;

import java.util.Scanner;

public class LeapYaer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("leap Year");
        }else  System.out.println(" not leap Year");

    }
}