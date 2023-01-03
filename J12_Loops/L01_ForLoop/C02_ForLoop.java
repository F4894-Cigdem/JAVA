package J12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
       //task-> girilen sayıdan 100 e kadar 4 un katı tam sayıları print eden code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayi= scan.nextInt();

        if (sayi>100) {
            System.out.println(" 100 den büyük bir sayı girdiniz!!!");
        }
        else {
            for (int i = sayi; i < 100 ; i++) {
                if (i%4==0) {
                    System.out.print(i + " ");
                }
            }
        }






    }
}
