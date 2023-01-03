package J04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("dk saat ve saniyeye çevirmek istediğiniz zamanı giriniz: ");
        int zaman=scan.nextInt();

        int saat=zaman/3600;
        int kalanZaman=zaman%3600;

        int dakika=kalanZaman/60;
        int saniye=kalanZaman%60;

        System.out.println("saat: "+saat);
        System.out.println("dakika: "+dakika);
        System.out.println("saniye: "+saniye);


    }

}
