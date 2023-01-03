package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("isim soyisim giriniz:");
        String isimSoyisim=scan.nextLine();

        System.out.println("yaşınızı giriniz:");
        int yas=scan.nextInt();

        System.out.println("kilonuzu giriniz:");
        double kilo=scan.nextDouble();

        System.out.println("boyunuzu giriniz:");
        double boy=scan.nextDouble();

        System.out.println("salona kaç ay devam edeceksiniz?");
        int ay=scan.nextInt();

        int odeme=ay*20;

        System.out.println("adınız soyadınız:"+isimSoyisim+"\nyaşınız:"+yas+"\nkilonuz:"+kilo+"\nboyunuz:"+boy+"\naylık ödemeniz:"+odeme);


    }
}
