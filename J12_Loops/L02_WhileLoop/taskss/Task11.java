package J12_Loops.L02_WhileLoop.taskss;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner scan=new Scanner(System.in);

        int sayi = 0;
        System.out.println(sayi);

        int girilenSayi = 1;
        System.out.print("bir sayı giriniz: ");
        int tahmin = scan.nextInt();
        while (sayi != tahmin) {
            if (tahmin > sayi) {
                System.out.print("fazla oldu bu sayı : ");
                tahmin = scan.nextInt();
                girilenSayi++;
            }
        }System.out.println(girilenSayi + ".  defa da buldunuz ");








    }
}
