package J12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task03_Faktöriyel {
    public static void main(String[] args) {
        /*
        Task-> girilen sayının faktöriyelini hesaplayan method create ediniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz ");
        int sayi= scan.nextInt();

        faktoriyel(sayi);


    }

    private static void faktoriyel(int sayi) {
        int faktoriyel=1;

        for (int i = 1; i <=sayi ; i++) {
            faktoriyel *=i;

        }
        System.out.println("faktoriyel = " + faktoriyel);
    }
}
