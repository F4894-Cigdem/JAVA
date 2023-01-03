package J12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        //task-> girilen sayı 17den küçük ise kazandınız büyük ise kaybettiniz print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
       int sayi=0;
        do  {
            System.out.println("bir sayı giriniz : ");
            sayi=scan.nextInt();
            System.out.println(sayi +" için kazandınız");
            sayi++;

        }

        while (sayi <=17);
            System.out.println(sayi +"için kaybettiniz ");
            sayi++;

    }
}
