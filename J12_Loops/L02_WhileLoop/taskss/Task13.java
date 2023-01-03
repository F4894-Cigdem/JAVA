package J12_Loops.L02_WhileLoop.taskss;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */

        Scanner scanner = new Scanner(System.in);
        char i;
        do {System.out.println("bir karakter giriniz: ");
            i=scanner.next().charAt(0);
            if (i!='x'&&i!='X'){
                System.out.println("javaCAN");
            }else System.out.println("jAVATAR");
        }while (i!='x'&&i!='X');



    }

}