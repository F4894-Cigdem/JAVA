package J12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task11_Nested {
    public static void main(String[] args) {

        /*
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F
    şeklini yazdırınız.  65=A'nın ascıı değeri
    */

        char harf='F' ;

        for (char i = 'A'; i <=harf ; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
