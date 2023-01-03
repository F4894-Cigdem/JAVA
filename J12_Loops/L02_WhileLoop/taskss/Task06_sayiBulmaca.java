package J12_Loops.L02_WhileLoop.taskss;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Scanner scan=new Scanner(System.in);

        int sayi = (int) (Math.random()*100);
        System.out.println(sayi);

        int tahminSayisi = 1;
        System.out.print("Sayıyı tahmin ediniz : ");
        int tahmin = scan.nextInt();
        while (sayi != tahmin) {
            if (tahmin > sayi) {
                System.out.print("tahmin sayısını düşürün : ");
                tahmin = scan.nextInt();
                tahminSayisi++;
            }else {
                System.out.print("tahmin sayısını artırın : ");
                tahmin = scan.nextInt();
                tahminSayisi++;
            }
        }System.out.println(tahminSayisi + ".  defa da buldunuz ");
    }

}
