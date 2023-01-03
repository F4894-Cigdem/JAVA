package day07;

import java.util.Scanner;

public class Q05_ForLoop {
    public static void main(String[] args) {

        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */

        Scanner scan=new Scanner(System.in);


        int toplam=0;
        int count=0;

        for (int i = 0; i <100 ; i++) {
            System.out.println("sayı giriniz:");
            count++;
            int sayi=scan.nextInt();
            toplam+=sayi;

            if (toplam>100) {
                System.out.println(count+ " kere sayı girdin. bu kadar yeter. ");
                break;
            }
            System.out.println("toplam= " +toplam);
        }
    }
}
