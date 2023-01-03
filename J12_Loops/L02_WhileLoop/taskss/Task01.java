package J12_Loops.L02_WhileLoop.taskss;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını print eden code create ediniz.
 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Toplanacak Sayıları Girin (Çıkmak için 0 girin)\n\n");
        double toplam = 0;
        double girdi  = -1;
        int adet = -1;

        while(girdi != 0) {
            System.out.print(adet+". Sayı: ");
            girdi = scan.nextDouble();
            toplam = toplam + girdi;
            adet++;
        }
         if (toplam>=333) {
             System.out.println("\n\nToplam: " + toplam +"\nGirilen sayı adedi : " +adet);
         }
         else {
             System.out.println("girdiğiniz sayıların toplamı 333 den azdır");
         }


    }
}
