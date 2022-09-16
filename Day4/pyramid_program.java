package Day4;

import java.util.Scanner;

public class pyramid_program {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row value :");
        int rows = sc.nextInt();

      int k =  0;

        for (int i = 1; i <= rows; i++, k = 0) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
           }

           while (k != 2 * i - 1) {
                System.out.print("* ");
               k++;
            }

            System.out.println();
        }
    }

}
