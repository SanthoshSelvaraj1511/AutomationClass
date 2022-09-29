package programs;

import java.util.Scanner;

public class armNumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner((System.in));
        int no = sc.nextInt();
        int no1=no;
        int arm = 0;
        do {
            int rem = no % 10;
            arm = arm + (rem * rem * rem);
            no = no / 10;
        }while (no>0);

if(arm==no1){
    System.out.println("Amstrong number");
}else{
    System.out.println("not amstrong no");
}
    }

    }




