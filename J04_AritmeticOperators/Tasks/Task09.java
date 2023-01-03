package J04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Çiftlikte bulunan ineklerin sayısını giriniz:");
        int inek=scan.nextInt();

        System.out.println("Çiftlikte bulunan koyunların sayısını giriniz:");
        int koyun=scan.nextInt();

        System.out.println("Çiftlikte bulunan tavukların sayısını giriniz:");
        int tavuk=scan.nextInt();

        System.out.println("ineklerin ayaklarının sayısı:"+(inek*4));
        System.out.println("koyunların ayaklarının sayısı:"+(koyun*4));
        System.out.println("tavukların ayaklarının sayısı:"+(tavuk*2));

        System.out.println("toplam ayak sayısı:"+(inek*4)+(koyun*4)+(tavuk*2));


    }

}
