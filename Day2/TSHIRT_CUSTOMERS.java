package Day2;

import java.util.Locale;
import java.util.Scanner;

public class TSHIRT_CUSTOMERS {
    public void customers() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 50 ;) {


                System.out.println("Enetr the TSHIRT colour :");
                String colour = sc.next().toLowerCase();


                System.out.println("Enetr the TSHIRT count :");
                int count = sc.nextInt();
            int j=i+count;
            i=j;

                System.out.println("Enetr the TSHIRT size :");
                char size = sc.next().charAt(0);
                System.out.println("T-SHIRT count "+count+" with "+colour+" and "+size+" size");
            }
        }
    }
